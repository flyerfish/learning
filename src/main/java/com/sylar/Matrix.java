package com.sylar;

public class Matrix<T> {
    private T ele[][];

    public Matrix(int rowCount, int colCount){
        ele = (T[][]) new Object[rowCount][colCount];
    }

    public int getRowCount(){
        return ele.length;
    }

    public int getColCount(){
        return ele[0].length;
    }
}
