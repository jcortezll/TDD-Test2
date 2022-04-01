import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    public void test1(){
        int expected=0;
        assertEquals(expected,Zapping.cuantosClics(0,0));
    }

}