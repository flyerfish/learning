package com.sylar;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.*;

public class MatrixTest {
    private int index = 0;
    public int pubindex = 0;
    public static int sindex = 0;
    protected int pindex = 0;
    private static int ssindex = 0;


    @Test
    public void testMatrixCount() throws ClassNotFoundException {
        Matrix<Integer> matrix = new Matrix<>(10, 20);
        Assert.assertEquals(10, matrix.getRowCount());
        Assert.assertEquals(20, matrix.getColCount());


        String name = "java.lang.String";
        Class c1 = null;
        try{
            c1 = Class.forName(name);
            System.out.println(c1.getName());
        }catch(ClassNotFoundException e){
        }
    }
}