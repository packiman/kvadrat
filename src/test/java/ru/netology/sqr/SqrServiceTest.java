package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SqrService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SqrServiceTest {
    @ParameterizedTest
    // @CsvSource({
    //"3, 200, 300 , позитивный тест"
    //"6 ,200, 300 , негативный тест"
    //"10 , 200, 600 , позитивный тест с другим диапозоном"
    //"11, 200, 600 , негативный тест с другим диапозоном"
    //  })
    @CsvFileSource(files = "src/test/resources/numbersRange.csv")
    public void calcSqrPos(int expected, int start, int finish) {

        SqrService service = new SqrService();
        // int expected = 3;
        int actual = service.calcSqr(start, finish);

        Assertions.assertEquals(expected, actual);
    }
}
