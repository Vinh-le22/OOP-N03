package checkProtected;

public class ProtectedDemo {
    public static void main(String[] args) {
        Test caseTest = new Test();
        caseTest.protectedMethod(); // Có thể truy cập vì A và ProtectedDemo đều trong cùng một package
    }
}
