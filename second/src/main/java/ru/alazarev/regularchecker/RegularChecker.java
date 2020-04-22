package ru.alazarev.regularchecker;

/**
 * Class App
 * <p>
 * Date: 22.04.2020
 *
 * @author a.lazarev
 */
public class RegularChecker {
    public static boolean areBalanced(String string) {
        int counter1 = 0;
        int counter2 = 0;
        char[] chars = string.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '[':
                    counter1++;
                    break;
                case ']':
                    if (counter1 == 0) {
                        return false;
                    }
                    counter1--;
                    break;
                case '(':
                    counter2++;
                    break;
                case ')':
                    if (counter2 == 0) {
                        return false;
                    }
                    counter2--;
                    break;
            }
        }
        return counter1 == 0 && counter2 == 0;
    }
}