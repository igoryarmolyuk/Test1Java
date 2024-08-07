package homework.TwentyThree;

import java.util.*;
import java.util.stream.Collectors;

public class NumberProcessor {
    private List<Integer> numbers;

    public NumberProcessor() {
        this.numbers = new ArrayList<>();
    }

    public void addNumbers(int... nums) {
        for (int num : nums) {
            numbers.add(num);
        }
    }

    public int sumOfEvenNumbers() {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<Integer> multiplyEachNumberByTwo() {
        return numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public Optional<Integer> findMaxNumber() {
        return numbers.stream()
                .max(Integer::compareTo);
    }

    public String getOddNumbersAsString() {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public OptionalDouble getAverage() {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    public void printResults() {
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers());
        System.out.println("Numbers multiplied by 2: " + multiplyEachNumberByTwo());
        System.out.println("Maximum number: " + findMaxNumber().orElseThrow(NoSuchElementException::new));
        System.out.println("Odd numbers: " + getOddNumbersAsString());
        System.out.println("Average of numbers: " + getAverage().orElseThrow(NoSuchElementException::new));
    }

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (type 'exit' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                processor.addNumbers(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        processor.printResults();
    }
}
