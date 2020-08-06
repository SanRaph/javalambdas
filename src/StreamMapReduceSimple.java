import java.util.stream.IntStream;

public class StreamMapReduceSimple {

    private  int sumOfEvenNumbers = IntStream.rangeClosed(1, 10)
            .map( (x) -> { return  x * 2;}  )
            .sum();

    public int getSumOfEvenNumbersSimple() {
        return sumOfEvenNumbers;
    }

    public static void main(String[] args) {
        StreamMapReduce streamMapReduce = new StreamMapReduce();
        System.out.printf("Sum of the even ints from 2 thru 20: %d%n", streamMapReduce.getSumOfEvenNumbers());

    }
}

