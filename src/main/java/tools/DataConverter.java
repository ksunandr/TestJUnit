package tools;

import java.io.IOException;
import java.math.BigInteger;

public interface DataConverter {

    BigInteger[] tryToConvert(final int attemptNumber) throws IOException;
}
