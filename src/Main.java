import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main extends Application {

    private KhachSan khachSan;

    @Override
    public void start(Stage primaryStage) {
        khachSan = new KhachSan();

        // Tạo giao diện chính với 4 nút
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Button btnLietKePhong = new Button("Liệt kê phòng trống");
        Button btnDatPhong = new Button("Đặt phòng");
        Button btnHuyDatPhong = new Button("Hủy đặt phòng");
        Button btnThongTinKhachHang = new Button("Thông tin khách hàng");
        
        grid.add(btnLietKePhong, 0, 0);
        grid.add(btnDatPhong, 1, 0);
        grid.add(btnHuyDatPhong, 0, 1);
        grid.add(btnThongTinKhachHang, 1, 1);

         // Xử lý sự kiện cho các nút
        btnLietKePhong.setOnAction(e -> lietKePhongTrong());
        btnDatPhong.setOnAction(e -> datPhong());
        btnHuyDatPhong.setOnAction(e -> huyDatPhong());
        btnThongTinKhachHang.setOnAction(e -> hienThiThongTinKhachHang());

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Quản Lý Khách Sạn");
        primaryStage.show();
    }

     // Phương thức liệt kê phòng trống
    private void lietKePhongTrong() {
        StringBuilder sb = new StringBuilder();
        for (Phong phong : khachSan.layDanhSachPhong()) {
            if (phong.isTrangThai()) {
                sb.append("Số phòng: ").append(phong.getSoPhong())
                  .append(", Trạng thái: Trống")
                  .append("\n");
            } else {
                sb.append("Số phòng: ").append(phong.getSoPhong())
                  .append(", Trạng thái: Đã đặt")
                  .append(", Mã đặt phòng: ").append(phong.getMaDatPhong())
                  .append("\n");
            }
        }
        showAlert("Danh sách phòng", sb.toString(), Alert.AlertType.INFORMATION);
    }

      // Cập nhật phương thức đặt phòng
    private void datPhong() {
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Đặt phòng");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField tenKhachHang = new TextField();
        TextField soPhong = new TextField();
        TextField soDienThoai = new TextField();
        TextField diaChi = new TextField();
        DatePicker ngayDat = new DatePicker();

        grid.add(new Label("Họ tên khách hàng:"), 0, 0);
        grid.add(tenKhachHang, 1, 0);
        grid.add(new Label("Số phòng:"), 0, 1);
        grid.add(soPhong, 1, 1);
        grid.add(new Label("Số điện thoại:"), 0, 2);
        grid.add(soDienThoai, 1, 2);
        grid.add(new Label("Địa chỉ:"), 0, 3);
        grid.add(diaChi, 1, 3);
        grid.add(new Label("Ngày đặt:"), 0, 4);
        grid.add(ngayDat, 1, 4);

        dialog.getDialogPane().setContent(grid);

        ButtonType buttonTypeOk = new ButtonType("Xác nhận", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(buttonTypeOk, ButtonType.CANCEL);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == buttonTypeOk) {
                return tenKhachHang.getText() + "," + soPhong.getText() + "," + soDienThoai.getText() + "," + diaChi.getText() + "," + ngayDat.getValue();
            }
            return null;
        });

        dialog.showAndWait().ifPresent(result -> {
            String[] data = result.split(",");
            if (data.length == 5) {
                String ten = data[0];
                String so = data[1];
                String sdt = data[2];
                String dc = data[3];
                LocalDate ngay = LocalDate.parse(data[4]);

                if (kiemTraThongTinDatPhong(so, sdt, ngay)) {
                    Phong phong = khachSan.timPhong(so);
                    if (phong != null && phong.isTrangThai()) {
                        String maDatPhong = phong.datPhong(ten, sdt, dc, ngay);
                        showAlert("Thông báo", "Đặt phòng thành công!\nMã đặt phòng: " + maDatPhong, Alert.AlertType.INFORMATION);
                    } else {
                        showAlert("Lỗi", "Phòng không tồn tại hoặc đã được đặt!", Alert.AlertType.ERROR);
                    }
                }
            }
        });
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}
