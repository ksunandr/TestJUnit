package tools;

import java.math.BigInteger;

public class Culc {

    private BigInteger resalt = BigInteger.ZERO;

    public BigInteger plus(BigInteger... args) {

        if (args == null) {
            return resalt;
        }

        for (BigInteger arg : args) {
            resalt = resalt.add(arg);
        }

        return resalt;
    }
}
