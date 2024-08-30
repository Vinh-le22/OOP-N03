class TestClass {
    public int publicField = 1;

    private int privateField = 2;

    protected int protectedField = 3;

    int packageField = 4;

    public void publicMethod() {
        System.out.println("Phương thức public.");
    }

    private void privateMethod() {
        System.out.println("Phương thức private.");
    }

    protected void protectedMethod() {
        System.out.println("Phương thức protected.");
    }

    void packageMethod() {
        System.out.println("Phương thức package-access.");
    }
}
