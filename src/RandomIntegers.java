import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {

    private SecureRandom randomIntegers;
    private SecureRandom randomNumbers;

//    public  getRandomIntegers(){
//        System.out.println("Random numbers on separate ");
//        return randomIntegers.ints(10, 1, 7)
//                             .forEach(System.out::println);
//    }

    public String getRandomNumbers(){

        return randomNumbers.ints(10, 1, 7)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining(""));
    }

}
