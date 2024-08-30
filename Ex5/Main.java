public class Main {
    public static void main(String[] args) {

        TestClass obj = new TestClass();

        System.out.println("Trường công khai: " + obj.publicField);
        obj.publicMethod();

        System.out.println("Trường protected: " + obj.protectedField);
        obj.protectedMethod();

        System.out.println("Trường package-access: " + obj.packageField);
        obj.packageMethod();

        // System.out.println("Trường private: " + obj.privateField); // Gây lỗi biên dịch
        // obj.privateMethod(); // Gây lỗi biên dịch
    }
}

