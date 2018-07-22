package tools.impl;

import tools.ConsoleSpeaker;
import tools.DataConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DataConverterImpl implements DataConverter {

    private static final String DEFAULT_SPLIT_REGEX = " ";

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private ConsoleSpeaker consoleSpeaker = new ConsoleSpeaker();

    public BigInteger[] tryToConvert(final int attemptNumber) throws IOException {
        try{
            String[] strings = br
                    .readLine()
                    .split(DEFAULT_SPLIT_REGEX);
            BigInteger[] bigIntegers = new BigInteger[strings.length];

            for (int i = 0; i < strings.length; i++) {
                bigIntegers[i] = new BigInteger(strings[i]);
            }
            return bigIntegers;
        } catch (NumberFormatException e) {
            ///i have no idea how to do it more beautifully
            if (attemptNumber > 0) {
                consoleSpeaker.printTryAgain(attemptNumber);
            }
            return null;
        }
    }
}
