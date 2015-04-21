package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
        assertEquals(3, calculator.sum(1,2));
    }
}