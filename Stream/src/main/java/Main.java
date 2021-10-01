import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, -3, 5, 8, -2, -1, 6, 9};

        double average = Arrays.stream(array)
                .average().getAsDouble();
        System.out.println("Average value: " + average);

        int min = Arrays.stream(array)
                .min().getAsInt();

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println("Minimal value: [" + list.indexOf(min) + "] " + min);

        long countValMoreZero = Arrays.stream(array)
                .filter(value -> value > 0)
                .count();
        System.out.println("More zero: " + countValMoreZero);

        long countValLessZero = Arrays.stream(array)
                .filter(value -> value < 0)
                .count();
        System.out.println("Less zero: " + countValLessZero);

        Arrays.stream(array)
                .forEach(value -> System.out.print(value * 2 + " "));
    }
}