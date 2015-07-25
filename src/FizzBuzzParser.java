import java.util.stream.IntStream;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

public class FizzBuzzParser {

    private static final String EMPTY = "";

    public static String parse(int input) {
        return IntStream.rangeClosed(1, input)
                        .mapToObj(FizzBuzzParser::parseNumber)
                        .collect(joining("\n"));
    }

    private static String parseNumber(int number) {
        String parsedNumber = parseIsDivisibleByTwo(number).concat(parseIsDivisibleByThree(number));
        return parsedNumber.equals(EMPTY) ? valueOf(number) : parsedNumber;
    }

    private static String parseIsDivisibleByTwo(int number) {
        return number % 2 == 0 ? "Fizz" : EMPTY;
    }

    private static String parseIsDivisibleByThree(int number) {
        return number % 3 == 0 ? "Buzz" : EMPTY;
    }

}
