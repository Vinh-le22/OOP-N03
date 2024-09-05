public class App {
    public static void main(String[] args) {
        // Book
        Book book = new Book("1984", "George Orwell");
        book.printDetails();

        // Time
        Time time = new Time(10, 30);
        time.displayTime();

        // Recursion
        Recursion recursion = new Recursion();
        System.out.println("Factorial of 5: " + recursion.factorial(5));

        // NNCollection
        NNCollection nnCollection = new NNCollection();
        nnCollection.addNumber(1);
        nnCollection.addNumber(2);
        nnCollection.printNumbers();

        // NameNumber
        NameNumber nameNumber = new NameNumber("Alice", 42);
        nameNumber.printInfo();
    }
}