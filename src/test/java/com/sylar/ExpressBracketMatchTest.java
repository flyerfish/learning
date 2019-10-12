package com.sylar;

import org.junit.Assert;
import org.junit.Test;

public class ExpressBracketMatchTest {

    @Test
    public void bracketTest0() {
        String result = ExpressBracketMatch.match("1+2");
        Assert.assertEquals("(1+2)", result);
    }

    @Test
    public void bracketTest1() {
        String result = ExpressBracketMatch.match("1+3*4+5");
        Assert.assertEquals("((1+(3*4))+5)", result);
    }

    @Test
    public void bracketTest2() {
        String result = ExpressBracketMatch.match("((1+3)*2");
        Assert.assertEquals("((1+3)*2)", result);
    }

    @Test
    public void bracketTest3() {
        String result = ExpressBracketMatch.match("(((1+3)*2-3");
        Assert.assertEquals("(((1+3)*2)-3)", result);
    }

    @Test
    public void bracketTest4() {
        String result = ExpressBracketMatch.match("1/2/3+3");
        Assert.assertEquals("(((1/2)/3)+3)", result);
    }

    @Test
    public void bracketTest5() {
        String result = ExpressBracketMatch.match("1/2/3+3*4");
        Assert.assertEquals("(((1/2)/3)+(3*4))", result);
    }

    @Test
    public void bracketTest6() {
        String result = ExpressBracketMatch.match("1/(2/3)+3*5");
        Assert.assertEquals("((1/(2/3))+(3*5))", result);
    }

    @Test
    public void bracketTest7() {
        String result = ExpressBracketMatch.match("1/(2/3)+3*5^3");
        Assert.assertEquals("((1/(2/3))+(3*(5^3)))", result);
    }

    @Test
    public void bracketTest8() {
        String result = ExpressBracketMatch.match("1+2)*3-4)*5-6)))");
        Assert.assertEquals("(((((1+2)*3)-4)*5)-6)", result);
    }
}