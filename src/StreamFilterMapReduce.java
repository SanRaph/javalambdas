import java.util.stream.IntStream;

public class StreamFilterMapReduce {
    private int filter = IntStream.rangeClosed(1, 10)
                                               .filter(x -> x % 2 == 0)
                                               .map(x -> x * 3)
                                               .sum();

    public int getFilter(){
        return filter;
    }


    public static void main(String[] args) {
        StreamFilterMapReduce streamFilterMapReduce = new StreamFilterMapReduce();
        System.out.printf("Sum of triples of the even ints from 2 through 10: %d%n", streamFilterMapReduce.getFilter());
    }
}
