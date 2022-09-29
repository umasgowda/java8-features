package java8concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A Stream can be defined as a sequence of elements from a source that supports sequential and parallel aggregate operations.
 * Using these aggregation operations we can create a pipeline.
 * Some of the aggregation operations provided are collect, concat, count, distinct, filter, forEach, limit, map, max, min, reduce, sorted.
 * <p>
 * https://netjs.blogspot.com/2016/12/java-stream-api-examples.html
 *
 * Stream has 2 types of Operation -
 * 1. Intermediate Operations - such as filter, map, sorted, anyMatch, findFirst,concat, distinct etc can return a stream, so we can chain multiple intermediate
 *  operations.
 * 2. Terminal Operations - such as forEach, reduce, min, max, sum, collect etc are either void or return a non-stream result.
 */
public class StreamsDemo {

    public static void main(String[] args) {

        //Java Stream API count() method example
        System.out.println("Java Stream API count() method example");
        streamApiCountExample();

        //Java Stream API concat() method example
        System.out.println("Java Stream API concat() method example");
        streamApiConcatExample();

        //Java Stream API distinct method example
        System.out.println("Java Stream API distinct method example");
        streamApiDistinctExample();

        //Java Stream API filter() method example
        System.out.println("Java Stream API filter() method example");
        streamApiFilterMethodExample();

        //Java Stream API limit() method example
        System.out.println("Java Stream API limit() method example");
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //Java Stream API map() method example
        System.out.println("Java Stream API map() method example");
        List<Integer> myList = Arrays.asList(7000, 5000, 4000, 24000, 17000, 6000);
        myList.stream().map(i-> i + 10).forEach(System.out::println);

        //findFirst() and findAny() methods in Java Stream API
        System.out.println("findFirst() and findAny() methods in Java Stream API");
        List<String> aList = Arrays.asList("Aarav", "Samu", "Simrata");
        Optional<String> aName = aList.stream().findFirst();
        System.out.println(" first element in  the stream " + aName.get());

        Optional<String> anyName = aList.stream().findAny();
        System.out.println(" find any example " + anyName.get());


    }

    private static void streamApiFilterMethodExample() {
        List<String> myList = Arrays.asList("Sam", "Sophi", "Aarav", "Arjun");
        Stream<String> aStream =  myList.stream().filter(name -> name.startsWith("S"));
        aStream.forEach(System.out::println);
        List<String> afterFilter = myList.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
        System.out.println("after filter " + afterFilter);
    }

    private static void streamApiDistinctExample() {
        List<Integer> myList = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6);
        List<Integer> myListAfterFilter = myList.stream().distinct().collect(Collectors.toList());
        System.out.println(myListAfterFilter);
    }

    private static void streamApiCountExample() {
        List<Integer> myList = Arrays.asList(7, 18, 10, 24, 17, 5);
        long totalElements = myList.stream().count();
        System.out.println("total elements in the list " + totalElements);
        //get the count of elements less than 7
        Stream<Integer> aStreamGreaterThan10 = myList.stream().filter(i -> i > 10);
        aStreamGreaterThan10.forEach(System.out::println);
        long count = myList.stream().filter(i -> i > 10).count();
        System.out.println("count of elements whose value greater  than ten  " + count);
    }

    private static void streamApiConcatExample() {
        List<String> aStrList = Arrays.asList("a", "b", "c", "d", "e");
        String[] aStrArray = new String[]{"1", "2", "3"};
        Stream<String> concatenatedStream = Stream.concat(aStrList.stream(), Arrays.stream(aStrArray));
        concatenatedStream.forEach(System.out::print);

        System.out.println();

        List<String> aNameList1 = Arrays.asList("Aarav", "Uma", "Sam", "Aarati");
        List<String> aNameList2 = Arrays.asList("Sam", "Aakash");
        Stream<String> aNamesWithA = Stream.concat(aNameList1.stream().filter(name-> name.startsWith("A")), aNameList2.stream().filter(n ->n.startsWith("A")));
        aNamesWithA.forEach(System.out::println);
    }
}
