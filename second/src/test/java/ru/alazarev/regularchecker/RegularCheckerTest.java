package ru.alazarev.regularchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class RegularCheckerTest
 * <p>
 * Date: 22.04.2020
 *
 * @author a.lazarev
 */
class RegularCheckerTest {
    static boolean areBalanced(String string) {
        return RegularChecker.areBalanced(string);
    }

    @Test
    public void whenBalancedThenTrue() {
        assertTrue(areBalanced("()"));
        assertTrue(areBalanced("[]"));
        assertTrue(areBalanced("(())"));
        assertTrue(areBalanced("([])"));
        assertTrue(areBalanced("((()))"));
        assertTrue(areBalanced("([()])"));
        assertTrue(areBalanced("([)]"));
    }

    @Test
    public void whenNotBalancedThenFalse() {
        assertFalse(areBalanced("("));
        assertFalse(areBalanced(")"));
        assertFalse(areBalanced(")("));
        assertFalse(areBalanced("())"));
    }

}