package com.sylar;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {

    @Test
    public void testMatrixCount() {
        Matrix<Integer> matrix = new Matrix<>(10,20);
        Assert.assertEquals(10, matrix.getRowCount() );
        Assert.assertEquals(20, matrix.getColCount() );
    }
}