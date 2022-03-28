import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void Test(){
        assertEquals(0,OperacionesTDD.suma(""));
        assertEquals(1,OperacionesTDD.suma("1"));
        assertEquals(3,OperacionesTDD.suma("1,2"));
        assertEquals(4,OperacionesTDD.suma("1,1,2"));
        assertEquals(-1,OperacionesTDD.suma("1,2,"));
    }
}