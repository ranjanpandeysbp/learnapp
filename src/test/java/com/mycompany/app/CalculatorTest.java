package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void test_add(){
        Integer result = calculator.add(5, 4);
        assertEquals(Integer.valueOf(9), result);
    }

    @Test
    public void test_subtract_num1_greaterthan_num2(){
        Double result = calculator.subtract(10.5, 5.5);
        assertEquals(Double.valueOf(5.0), result);
    }

    @Test
    public void test_subtract_num1_lessthan_num2(){
        Double result = calculator.subtract(2.8, 4.8);
        assertEquals(Double.valueOf(2.0), result);
    }

}
