import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzParser {

    public static String parse(int input) {
        return IntStream.rangeClosed(1, input)
                        .mapToObj(FizzBuzzParser::parseNumber)
                        .collect(Collectors.joining("\n"));
    }

    private static String parseNumber(int number) {
        if (number % 2 == 0) return "Fizz";
        if (number % 3 == 0) return "Buzz";
        return String.valueOf(number);
    }

}
