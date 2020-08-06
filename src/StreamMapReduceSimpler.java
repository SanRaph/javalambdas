import java.util.stream.IntStream;

public class StreamMapReduceSimpler {

    private  int sumOfEvenNumbers = IntStream.rangeClosed(1, 10)
            .map( (x) -> x * 2  )
            .sum();

    public int getSumOfEvenNumbers() {
        return sumOfEvenNumbers;
    }

    public static void main(String[] args) {
        StreamMapReduce streamMapReduce = new StreamMapReduce();
        System.out.printf("Sum of the even ints from 2 thru 20: %d%n", streamMapReduce.getSumOfEvenNumbers());


    }

}
