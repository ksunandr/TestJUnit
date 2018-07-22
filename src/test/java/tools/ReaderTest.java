package tools;

import myExceptions.AttemptsEndException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.reflection.Whitebox;
import tools.impl.DataConverterImpl;

import java.math.BigInteger;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReaderTest {

    private Reader sut;

    private DataConverter dataConverter;

    @Before
    public void setUp() {
        sut = new Reader();
    }

    @Test(expected = AttemptsEndException.class)
    public void readBigInteger_lastAttemptLessThen0_throwCustomException() throws Exception {
        //arrange
        dataConverter = new DataConverterStub();
        Whitebox.setInternalState(sut, "dataConverter", dataConverter);

        //act
        sut.readBigInteger(1);
    }

    @Test
    public void readBigInteger_validCase_returnArray() throws Exception {
        //arrange
        dataConverter = mock(DataConverterImpl.class);
        Whitebox.setInternalState(sut, "dataConverter", dataConverter);
        when(dataConverter.tryToConvert(99)).thenReturn(new BigInteger[1]);

        //act
        BigInteger[] result = sut.readBigInteger(100);

        //assert
        assertEquals(1, result.length);
    }
}