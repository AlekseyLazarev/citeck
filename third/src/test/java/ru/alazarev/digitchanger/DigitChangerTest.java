package ru.alazarev.digitchanger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class DigitChangerTest
 * <p>
 * Date: 22.04.2020
 *
 * @author a.lazarev
 */
class DigitChangerTest {
    @Test
    public void whenNumberWithoutZeroOnTailThenInputNumberEqualsOutput() {
        int number = 19012;
        assertEquals(number, DigitChanger.changeRightZeroToOne(number));
    }

    @Test
    public void whenNumberWithZeroOnTailThenInputNumberPlusOneEqualsOutput() {
        int number = 1928370;
        assertEquals(number + 1, DigitChanger.changeRightZeroToOne(number));
    }

    @Test
    public void whenNegativeNumberWithZeroOnTailThenInputNumberMinusOneEqualsOutput() {
        int number = -10230;
        assertEquals(number - 1, DigitChanger.changeRightZeroToOne(number));
    }
}