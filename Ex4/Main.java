import checkProtected.*;
public class Main {
    public static void main(String[] args) {
        Test caseTest = new Test();
        //caseTest.protectedMethod(); lỗi do phương phức này có kiểu protected không thể truy xuất ngoài package
    }
}
