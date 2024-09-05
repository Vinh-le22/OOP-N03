public class NameNumber {
    private String name;
    private int number;

    public NameNumber(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Number: " + number);
    }
}