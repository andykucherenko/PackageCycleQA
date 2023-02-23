package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestModelTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void shouldCalculateMonthsFirstYear(int income, int threshold, int expences, long expected) {
        RestModel service = new RestModel();

        //int income = 10_000;
        //int threshold = 20_000;
        //int expences = 3_000;
        //long expected = 3;

        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }

    /*@Test
    public void shouldCalculateMonthsSecondYear() {

        RestModel service = new RestModel();

        int income = 100_000;
        int threshold = 150_000;
        int expenses = 60_000;
        long expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }*/
}
