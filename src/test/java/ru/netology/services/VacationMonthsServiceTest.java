package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VacationMonthsServiceTest {
    @Test
    public void calcNumberOfMonthsTest1() {
        VacationMonthsService service = new VacationMonthsService();

        int actual = service.calculate(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcNumberOfMonthsTest2() {
        VacationMonthsService service = new VacationMonthsService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}