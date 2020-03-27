package com.sylar;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {

    private final double DOUBLE_DELTA = 0.000001;
    @Test
    public void testNumber() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("2");
        Assert.assertEquals(2, result, DOUBLE_DELTA);
    }

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("1+2");
        Assert.assertEquals(3, result, DOUBLE_DELTA);
    }

    @Test
    public void testMul() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("1*2*3");
        Assert.assertEquals(6, result, DOUBLE_DELTA);
    }

    @Test
    public void testBracket() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("(1+2)*3");
        Assert.assertEquals(9, result, DOUBLE_DELTA);
    }

    @Test
    public void testBracket2() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("((1+2))");
        Assert.assertEquals(3, result, DOUBLE_DELTA);
    }

    @Test
    public void testNegative() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("(1-2)");
        Assert.assertEquals(-1, result, DOUBLE_DELTA);
    }

    @Test
    public void testNegative2() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("-2");
        Assert.assertEquals(-2, result, DOUBLE_DELTA);
    }

//    @Test
//    public void testNegative3() throws Exception {
//        Calculator calculator = new Calculator();
//        double result = calculator.calcExpress("--2");
//        Assert.assertEquals(2, result, DOUBLE_DELTA);
//    }

    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("9/3+2");
        Assert.assertEquals(5, result, DOUBLE_DELTA);
    }

    @Test
    public void testDiv2() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("9/(1+2)");
        Assert.assertEquals(3, result, DOUBLE_DELTA);
    }

    @Test
    public void testDiv3() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("9/3/3");
        Assert.assertEquals(1, result, DOUBLE_DELTA);
    }

    @Test
    public void testMax() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("MAX(3,2)");
        Assert.assertEquals(3, result, DOUBLE_DELTA);
    }

    @Test
    public void testMax2() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("MAX(3,2) + MAX(3,4)");
        Assert.assertEquals(7, result, DOUBLE_DELTA);
    }

    @Test
    public void testMax3() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("MAX( MAX(3,4), MAX(5,6) )");
        Assert.assertEquals(6, result, DOUBLE_DELTA);
    }

    @Test
    public void testMin() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("MIN(3,2) + MIN(3,-1)");
        Assert.assertEquals(1, result, DOUBLE_DELTA);
    }

    @Test
    public void testPower() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("2^3");
        Assert.assertEquals(8, result, DOUBLE_DELTA);
    }

    @Test
    public void testAll() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress("1 + 2 - 8 * 6 / 2 ^ 3");
        Assert.assertEquals(-3, result, DOUBLE_DELTA);
    }

    @Test
    public void testAll2() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.calcExpress(".1+0.3");
        Assert.assertEquals(0.4, result, DOUBLE_DELTA);
    }
}