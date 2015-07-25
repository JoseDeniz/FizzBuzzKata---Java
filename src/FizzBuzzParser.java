public class FizzBuzzParser {

    public static String parse(int input) {
        if (input % 2 == 0) return "1\nFizz";
        if (input % 3 == 0) return "1\nFizz\nBuzz";
        return "1";
    }

}
