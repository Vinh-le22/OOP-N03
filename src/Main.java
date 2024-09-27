import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Quản Lý Khách Sạn");

        // Tạo layout VBox để dàn các nút
        VBox vbox = new VBox();
        vbox.setSpacing(20); // Khoảng cách giữa các nút
        vbox.setStyle("-fx-padding: 20;"); // Padding cho VBox

        // Tạo các nút cho menu
        Button button1 = new Button("Liệt Kê Phòng Trống");
        button1.setOnAction(e -> {
            // Logic cho liệt kê phòng trống
            System.out.println("Liệt kê phòng trống...");
        });

        Button button2 = new Button("Đặt Phòng");
        button2.setOnAction(e -> {
            // Logic cho đặt phòng
            System.out.println("Đặt phòng...");
        });

        Button button3 = new Button("Hủy Đặt Phòng");
        button3.setOnAction(e -> {
            // Logic cho hủy đặt phòng
            System.out.println("Hủy đặt phòng...");
        });

        Button button4 = new Button("Thông Tin Khách Hàng");
        button4.setOnAction(e -> {
            // Logic cho hiển thị thông tin khách hàng
            System.out.println("Thông tin khách hàng...");
        });

        // Thêm các nút vào VBox
        vbox.getChildren().addAll(button1, button2, button3, button4);

        // Tạo scene và hiển thị
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
