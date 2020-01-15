public class Fizzbuzz {
    public static String sayFb(int input) {
        String result = "";
        if (input % 3 == 0) {
            result += "Fizz";
        }
        if (input % 5 == 0) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            result += input;
        }
        return result;
    }
}
