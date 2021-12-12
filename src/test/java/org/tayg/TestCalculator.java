package org.tayg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    public void testIncrement() {
        int n1 = 3;
        int n2 = 4;
        int trueResult = 7;
        int res = calculator.increment(n1, n2);
        assertEquals(res, trueResult);
    }

    @Test
    public void testDecrement() {
        int n1 = 10086;
        int n2 = 10087;
        int trueResult = -1;
        int res = calculator.decrement(n1, n2);
        assertEquals(res, trueResult);
    }

}
