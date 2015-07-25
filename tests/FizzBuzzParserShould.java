import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzParserShould {

    /**
     * TODO:
     * A number divisible by 2 has to parse to Fizz
     * A number divisible by 3 has to parse to Buzz
     * A number divisible by 2 and 3 has to parse to FizzBuzz
     *
     * Examples:
     *
     * 6 -> 1\nFizz\nBuzz\nFizz\n5\nFizzBuzz
     */

    @Test
    public void not_parse_the_input_number() {
        assertThat(FizzBuzzParser.parse(1), is("1"));
    }

    @Test
    public void parse_the_number_divisible_by_two_to_fizz() {
        assertThat(FizzBuzzParser.parse(2), is("1\nFizz"));
    }

    @Test
    public void parse_the_number_divisible_by_three_to_buzz() {
        assertThat(FizzBuzzParser.parse(3), is("1\nFizz\nBuzz"));
    }

    @Test
    public void parse_the_number_divisible_by_two_and_three_to_fizzbuzz() {
        assertThat(FizzBuzzParser.parse(6), is("1\nFizz\nBuzz\nFizz\n5\nFizzBuzz"));
    }

}
