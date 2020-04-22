package ru.alazarev.digitchanger;

/**
 * Class DigitChanger
 * <p>
 * Date: 22.04.2020
 *
 * @author a.lazarev
 */
public class DigitChanger {
    public static int changeRightZeroToOne(int n) {
        if (n % 10 == 0) {
            if (n < 0) {
                return n - 1;
            } else {
                return n + 1;
            }
        }
        return n;
    }
}
