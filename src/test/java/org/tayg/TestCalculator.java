package org.tayg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    public void testIncrement() {
        Calculator calculator = new Calculator();
        int n1 = 3;
        int n2 = 4;
        int trueResult = 7;
        int res = calculator.increment(n1, n2);
        assertEquals(res, trueResult);
    }

}
