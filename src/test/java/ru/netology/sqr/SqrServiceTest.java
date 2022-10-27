package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SqrService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SqrServiceTest {

    @Test
    public void calcSqrPos() {

        SqrService service = new SqrService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}
