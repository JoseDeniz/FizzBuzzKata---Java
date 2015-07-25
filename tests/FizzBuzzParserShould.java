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
     * 1 -> 1
     * 2 -> 1\nFizz
     * 3 -> 1\nFizz\nBuzz
     * 6 -> 1\nFizz\nBuzz\nFizz\n5\nFizzBuzz
     */

    @Test
    public void not_parse_the_input_number() {
        assertThat(FizzBuzzParser.parse(1), is("1"));
    }

}
