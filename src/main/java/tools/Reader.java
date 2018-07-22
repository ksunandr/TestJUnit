package tools;

import myExceptions.AttemptsEndException;
import tools.impl.DataConverterImpl;

import java.io.IOException;
import java.math.BigInteger;

public class Reader {

    private DataConverter dataConverter = new DataConverterImpl();

    public BigInteger[] readBigInteger(int attempt) throws AttemptsEndException, IOException {
        do {
            attempt--;
            final BigInteger[] result = dataConverter.tryToConvert(attempt);
            if(result != null) {
                return result;
            }
        } while (attempt > 0);
        throw new AttemptsEndException();
    }
}
