import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {


    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,Fizz",
            "5,Buzz",
            "15,FizzBuzz"
    })
    public void test(int input, String output) {

        assertEquals(output, Fizzbuzz.sayFb(input));

    }


}
