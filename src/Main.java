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

    public static void main(String[] args) {
        launch(args);
    }
}
