package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrCeilWithNormalNumbers() {
        SQRService service = new SQRService();
        int number1 = 200;
        int number2 = 300;
        int expected = 3;

        int actual = service.getSqrCount(number1, number2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCeilWithSameNumbers() {
        SQRService service = new SQRService();
        int number1 = 100;
        int number2 = 100;
        int expected = 1;

        int actual = service.getSqrCount(number1, number2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCeilWithNumberOverLimit() {
        SQRService service = new SQRService();
        int number1 = 1;
        int number2 = 100_001;
        int expected = 90;

        int actual = service.getSqrCount(number1, number2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCeilWithNumberUnderLimit() {
        SQRService service = new SQRService();
        int number1 = 1;
        int number2 = 99;
        int expected = 0;

        int actual = service.getSqrCount(number1, number2);

        assertEquals(expected, actual);
    }

}