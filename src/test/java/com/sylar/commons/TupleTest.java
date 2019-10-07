package com.sylar.commons;

import org.junit.Test;

public class TupleTest {

    @Test
    public void testTuple1(){
        Tuple tuple1 = Tuple.<String>of("hello");
        System.out.println( tuple1._1().get() );
        System.out.println( tuple1.toString() );
    }

    @Test
    public void testTuple2(){
        Tuple tuple2 = Tuple.<String, Integer>of("hello", 1);
        System.out.println( tuple2._1().get() + "|" + tuple2._2().get() );
        System.out.println( tuple2.toString() );
    }

    @Test
    public void testTuple3(){
        Tuple tuple3 = Tuple.of("hello", "zhang", "chunbing");
        System.out.println( tuple3._1().get() + "|" + tuple3._2().get() + "|" + tuple3._3().get() );
        System.out.println( tuple3.toString() );
    }
}