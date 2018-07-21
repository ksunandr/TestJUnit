package tools;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class CulcTest {

    private Culc culc;

    @Test
    public void plus_tenAndTwoAndOne() {
        culc = new Culc();
        BigInteger actual = culc.plus(BigInteger.valueOf(10), BigInteger.valueOf(2), BigInteger.valueOf(1));
        BigInteger expected = BigInteger.valueOf(13);
        assertEquals(expected, actual);
    }


    @Test
    public void plus_null_currentValue() {
        culc = new Culc();
        BigInteger actual = culc.plus(null);
        assertEquals(BigInteger.ZERO, actual);
    }


    @Test
    public void plus_nullAndTen_currentValue() {
        culc = new Culc();
        culc.plus(null);
        BigInteger actual = culc.plus(BigInteger.TEN);
        assertEquals(BigInteger.TEN, actual);
    }


}