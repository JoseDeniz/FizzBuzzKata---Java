import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzParserShould {

    @Test
    public void not_parse_the_input_number() {
        assertThat(FizzBuzzParser.parse(1), is("1"));
    }

    @Test
    public void parse_the_number_divisible_by_three_to_fizz() {
        assertThat(FizzBuzzParser.parse(3), is("1,2,Fizz"));
    }

    @Test
    public void parse_the_number_divisible_by_five_to_buzz() {
        assertThat(FizzBuzzParser.parse(5), is("1,2,Fizz,4,Buzz"));
    }

    @Test
    public void parse_the_number_divisible_by_three_and_five_to_fizzbuzz() {
        assertThat(FizzBuzzParser.parse(15), is("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz"));
    }

}
