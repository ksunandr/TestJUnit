package tools;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.reflection.Whitebox;
import tools.impl.DataConverterImpl;

import java.io.BufferedReader;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DataConverterTest {

    private DataConverter sut;
    private BufferedReader bufferedReader;
    private ConsoleSpeaker consoleSpeaker;

    @Before
    public void setUp() {
        sut = new DataConverterImpl();
    }

    @Test
    public void tryToConvert_validStringData_returnArray() throws Exception {
        //arrange
        bufferedReader = mock(BufferedReader.class);
        Whitebox.setInternalState(sut, "br", bufferedReader);
        when(bufferedReader.readLine()).thenReturn("1 ");

        //act
        BigInteger[] result = sut.tryToConvert(1);

        //assert
        assertNotNull(result);
        assertEquals(BigInteger.ONE, result[0]);
    }

    //@Test
    public void tryToConvert_attemptBiggerThen0AndinvalidString_returnNull() {
        //TODO
    }

    //@Test
    public void tryToConvert_attemptIs0AndinvalidString_runConsoleSpeaker() {
        //TODO
    }




}
