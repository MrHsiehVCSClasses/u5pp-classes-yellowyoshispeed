package u5pp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class MyMathTests {

    @Test
    void myMathIntAbsTests() throws Exception {
        assertEquals(Math.abs(-5), MyMath.abs(-5));
        assertEquals(Math.abs(0), MyMath.abs(0));
        assertEquals(Math.abs(5), MyMath.abs(5));
    }

    @Test
    void myMathDoubleAbsTests() throws Exception {
        assertEquals(Math.abs(-5.0), MyMath.abs(-5.0));
        assertEquals(Math.abs(0.0), MyMath.abs(0.0));
        assertEquals(Math.abs(5.0), MyMath.abs(5.0));
    }

    @Test
    void myMathPowTests() throws Exception {
        assertEquals(Math.pow(-5, 3), MyMath.pow(-5, 3));
        assertEquals(Math.pow(.5, 3), MyMath.pow(.5, 3));
        assertEquals(Math.pow(0, 3), MyMath.pow(0, 3));
        assertEquals(Math.pow(5, 0), MyMath.pow(5, 0));
        assertEquals(Math.pow(125, 3), MyMath.pow(125, 3));
    }

    @Test
    void myMathPerfectSqrtTests() throws Exception {
        assertEquals(-1, MyMath.perfectSqrt(-25));
        assertEquals(0, MyMath.perfectSqrt(0));
        assertEquals(5, MyMath.perfectSqrt(25));
        assertEquals(-1, MyMath.perfectSqrt(26));
        assertEquals(7, MyMath.perfectSqrt(49));
        assertEquals(-1, MyMath.perfectSqrt(14883));
        assertEquals(122, MyMath.perfectSqrt(14884));
    }
}