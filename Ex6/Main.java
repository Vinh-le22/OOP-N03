class DataManipulator {
    public void modifyData(DataClass data) {
        data.protectedData = 20; // Thay đổi dữ liệu protected
    }
}
public class Main {
    public static void main(String[] args) {
        DataClass data = new DataClass();
        data.displayData(); // Truy cập phương thức protected từ cùng một tệp
        // Manipulate dữ liệu protected trong lớp DataClass
        DataManipulator manipulator = new DataManipulator();
        manipulator.modifyData(data);
        data.protectedData=12;
        data.displayData(); // Hiển thị dữ liệu sau khi thay đổi
    }
}




