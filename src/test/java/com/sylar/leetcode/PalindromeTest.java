package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PalindromeTest {
    @Test
    public void test_01_isPalindrome(){
        Palindrome pd = new Palindrome();
        Assert.assertEquals(true, pd.isPalindrome(121));
    }

    @Test
    public void test_02_isPalindrome(){
        Palindrome pd = new Palindrome();
        Assert.assertEquals(false, pd.isPalindrome(-121));
    }

    @Test
    public void test_03_isPalindrome(){
        Palindrome pd = new Palindrome();
        Assert.assertEquals(false, pd.isPalindrome(+20));
    }

    @Test
    public void test_04_isPalindrome(){
        Palindrome pd = new Palindrome();
        Assert.assertEquals(true, pd.isPalindrome(10201));
    }
}