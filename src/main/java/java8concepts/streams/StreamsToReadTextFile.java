package java8concepts.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author piksel
 */
public class StreamsToReadTextFile {

    public static void main(String[] args) throws IOException {

        Stream<String> streamsNames = Files.lines(Paths.get("/Users/umashivalingaiah/dev/selflearning/src/main/resources/names.txt"));
        streamsNames.sorted().filter(n -> n.startsWith("s")).forEach(System.out::println);
        streamsNames.close();
    }
}
