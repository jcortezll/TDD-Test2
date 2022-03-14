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

    @Test
    void Test789(){
        assertEquals("7",FizzBuzz.genera(7));
        assertEquals("8",FizzBuzz.genera(8));
        assertEquals("Fizz",FizzBuzz.genera(9));
    }

    @Test
    void Test10(){
        assertEquals("Buzz",FizzBuzz.genera(10));
    }

    @Test
    void Test_11_12_13_14(){
        assertEquals("11",FizzBuzz.genera(11));
        assertEquals("Fizz",FizzBuzz.genera(12));
        assertEquals("13",FizzBuzz.genera(13));
        assertEquals("14",FizzBuzz.genera(14));
    }

    @Test
    void Test15(){
        assertEquals("FizzBuzz",FizzBuzz.genera(15));
    }
}