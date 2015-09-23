import java.util.stream.IntStream;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

public class FizzBuzzGenerator {

    private static final String EMPTY = "";

    public static String generateFizzBuzzSequenceUpTo(int limit) {
        return IntStream.rangeClosed(1, limit)
                        .mapToObj(FizzBuzzGenerator::parseNumber)
                        .collect(joining(","));
    }

    private static String parseNumber(int number) {
        String parsedNumber = parseIsDivisibleByThree(number).concat(parseIsDivisibleByFive(number));
        return parsedNumber.equals(EMPTY) ? valueOf(number) : parsedNumber;
    }

    private static String parseIsDivisibleByThree(int number) {
        return number % 3 == 0 ? "Fizz" : EMPTY;
    }

    private static String parseIsDivisibleByFive(int number) {
        return number % 5 == 0 ? "Buzz" : EMPTY;
    }

}
