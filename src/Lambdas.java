import java.util.stream.IntStream;

public class Lambdas {
    private int total = IntStream.rangeClosed(1, 10)
                .sum();

    public int total(){
        return total;
    }


}
