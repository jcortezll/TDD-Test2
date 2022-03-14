import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void Test123(){
        String res = FizzBuzz.genera(1);

        assertEquals("1",res);
        assertEquals("2",FizzBuzz.genera(2));
        assertEquals("Fizz",FizzBuzz.genera(3));
    }

    @Test
    void Test456(){
        assertEquals("4",FizzBuzz.genera(4));
        assertEquals("Buzz",FizzBuzz.genera(5));
        assertEquals("Fizz",FizzBuzz.genera(6));
    }
}