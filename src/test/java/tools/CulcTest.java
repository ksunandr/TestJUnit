package tools;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class CulcTest {

    @Test
    public void plus() {

        Culc culc =  new Culc();
      BigInteger actual =  culc.plus(BigInteger.valueOf(10), BigInteger.valueOf(2),BigInteger.valueOf(1));
      BigInteger expected = BigInteger.valueOf(13);
        Assert.assertEquals(expected, actual);
    }
}