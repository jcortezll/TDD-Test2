import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    @Test
    void verifyTest1() {
        boolean esperado=true;
        Brackets brackets = new Brackets();
        assertEquals(esperado,brackets.verify(""));
        assertEquals(esperado,brackets.verify("()"));
        esperado=false;
        assertEquals(esperado,brackets.verify("("));
        assertEquals(esperado,brackets.verify(")"));
        esperado=true;
        assertEquals(esperado,brackets.verify("(2+3)"));
    }
}