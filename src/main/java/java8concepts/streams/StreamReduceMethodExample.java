package java8concepts.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author piksel
 */
public class StreamReduceMethodExample {

    public static void main(String[] args) {
        //stream reduce method example
        Stream<Double> myStream = Stream.of(4.5, 6.5, 1.5);
        double add = myStream.reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("addition of 2 double numbers " + add);

        //Stream summary statistics example
        IntStream myInStream = IntStream.of(1, 3, 5, 7, 4, 9);
        IntSummaryStatistics summaryStatistics = myInStream.summaryStatistics();
        System.out.println("summary statistics " + summaryStatistics);

     }

}
