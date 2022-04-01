import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    void test1(){
        int expected=0;
        assertEquals(expected,Zapping.cuantosClics(0,0));
    }
    @Test
    void test2(){
        int expected=1;
        assertEquals(expected,Zapping.cuantosClics(1,2));
    }
}