import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.printf("Original values: %s%n", Arrays.asList(values));
        //System.out.printf("Scored values: %s%n", Arrays.stream(values).sorted().collect(Collectors.toList()));

        //List<Integer> greaterThan4 = Arrays.stream(values).filter(value -> value > 4).collect(Collectors.toList());

        //System.out.printf("Values greater than 4: %s%n", greaterThan4);


    }
}
