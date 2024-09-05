import java.util.ArrayList;
import java.util.List;

public class NNCollection {
    private List<Integer> numbers;

    public NNCollection() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void printNumbers() {
        System.out.println("Numbers: " + numbers);
    }
}