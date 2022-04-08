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
    @Test
    void test3(){
        int expected=20;
        assertEquals(expected,Zapping.cuantosClics(10,30));
    }
    @Test
    void test4(){
        int expected=2;
        assertEquals(expected,Zapping.cuantosClics(2,99));
    }
    @Test
    void test5(){
        int expected=41;
        assertEquals(expected,Zapping.cuantosClics(5,63));
    }
    @Test
    void test6(){
        int expected=41;
        assertEquals(expected,Zapping.cuantosClics(63,5));
    }
    @Test
    void test7(){
        int expected=49;
        assertEquals(expected,Zapping.cuantosClics(1,51));
    }
}