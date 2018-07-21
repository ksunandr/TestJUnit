package tools;

import myExceptions.AttemptsEndException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Reader {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private String[] readString() throws IOException {

        return br.readLine().split(" ");
    }

    public BigInteger[] readBigInteger() throws IOException, AttemptsEndException {
        int attempt = 3;

        do {
            attempt--;
            try{
                String[] strings = readString();
                BigInteger[] bigIntegers = new BigInteger[strings.length];

                for (int i = 0; i < strings.length; i++) {
                    bigIntegers[i] = new BigInteger(strings[i]);
                }
                return bigIntegers;
            } catch (NumberFormatException e) {

                if (attempt > 0) ///i have no idea how to do it more beautifully
                    System.out.println("Try again. You have only " + attempt + (attempt == 1 ? " attempt" : " attempts"));
            }

        } while (attempt > 0);

        throw new AttemptsEndException();

    }
}
