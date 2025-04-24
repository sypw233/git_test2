import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_Fizz_when_given_1()
    {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        String result = fizzBuzz.fizzBuzz();
        assertEquals("1", result);
    }

    @Test
    void should_return_Fizz_when_given_3()
    {
       FizzBuzz fizzBuzz = new FizzBuzz(3);
       String result = fizzBuzz.fizzBuzz();
       assertEquals("Fizz", result);
    }

    @Test
    void should_return_Fizz_when_given_5()
    {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        String result = fizzBuzz.fizzBuzz();
        assertEquals("Buzz", result);
    }

    @Test
    void should_return_Fizz_when_given_15() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        String result = fizzBuzz.fizzBuzz();
        assertEquals("FizzBuzz", result);
    }
}
