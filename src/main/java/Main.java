

import myExceptions.AttemptsEndException;
import tools.Culc;
import tools.Reader;

import java.io.IOException;

public class Main {

    private static final int DEFAULT_ATTEMPT = 3;

    public static void main(String[] args) throws IOException {

        System.out.println("hello");

        Reader reader = new Reader();

        try {
            System.out.println("sum " + new Culc().plus(reader.readBigInteger(DEFAULT_ATTEMPT)));
        } catch (AttemptsEndException e) {
            System.out.println(e.getMessage());
        }

    }
}
