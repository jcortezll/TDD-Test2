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
        assertEquals(esperado,brackets.verify("()()"));
        assertEquals(esperado,brackets.verify("(3+2)*(4+5)"));
        esperado=false;
        assertEquals(esperado,brackets.verify(")("));
        assertEquals(esperado,brackets.verify("())("));
        esperado=true;
        assertEquals(esperado,brackets.verify("(())"));
        assertEquals(esperado,brackets.verify("((3)^4)"));
        assertEquals(esperado,brackets.verify("((()()))"));
        assertEquals(esperado,brackets.verify("(((3*a)-(x+5)))"));
        esperado=false;
        assertFalse(brackets.verify(")()("));
        assertEquals(esperado,brackets.verify(")(3+2)("));
        assertEquals(esperado,brackets.verify("()())("));
    }
}