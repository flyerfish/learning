package com.sylar.commons;

import java.util.Optional;

public abstract class Tuple {

    public static <T1> Tuple of(T1 t1) {
        return new Tuple1(t1);
    }

    public static <T1, T2> Tuple of(T1 t1, T2 t2) {
        return new Tuple2(t1, t2);
    }

    public static <T1, T2, T3> Tuple of(T1 t1, T2 t2, T3 t3) {
        return new Tuple3(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Tuple of(T1 t1, T2 t2, T3 t3, T4 t4) {
        return new Tuple4(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Tuple of(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return new Tuple5(t1, t2, t3, t4, t5);
    }

    public <T1> Optional<T1> _1() {
        return Optional.empty();
    }

    public <T2> Optional<T2> _2() {
        return Optional.empty();
    }

    public <T3> Optional<T3> _3() {
        return Optional.empty();
    }

    public <T4> Optional<T4> _4() {
        return Optional.empty();
    }

    public <T5> Optional<T5> _5() {
        return Optional.empty();
    }

    static class Tuple1<T1> extends Tuple {
        final protected T1 t1;

        Tuple1( T1 t1) {
            this.t1 = t1;
        }

        @Override
        public Optional<T1> _1() {
            return Optional.of(t1);
        }

        public String toString() {
            return "(" + t1 + ")";
        }

    }

    static class Tuple2<T1, T2> extends Tuple1 {
        final protected T2 t2;

        Tuple2(T1 t1, T2 t2) {
            super(t1);
            this.t2 = t2;
        }

        @Override
        public Optional<T2> _2() {
            return Optional.of(t2);
        }

        public String toString() {
            return "(" + t1 + ", " + t2 + ")";
        }
    }

    static class Tuple3<T1, T2, T3> extends Tuple2 {
        final protected T3 t3;

        Tuple3(T1 t1, T2 t2, T3 t3) {
            super(t1,t2);
            this.t3 = t3;
        }

        @Override
        public Optional<T3> _3() {
            return Optional.of(t3);
        }

        public String toString() {
            return "(" + t1.toString() + ", " + t2.toString() + ", " + t3.toString() + ")";
        }
    }

    static class Tuple4<T1, T2, T3, T4> extends Tuple3 {
        final protected T4 t4;

        Tuple4(T1 t1, T2 t2, T3 t3, T4 t4) {
            super(t1,t2, t3);
            this.t4 = t4;
        }

        @Override
        public Optional<T4> _4() {
            return Optional.of(t4);
        }

        public String toString() {
            return "(" + t1 + ", " + t2 + ", " + t3 + ", " + t4 + ")";
        }
    }

    static class Tuple5<T1, T2, T3, T4, T5> extends Tuple4 {
        final protected T5 t5;

        Tuple5(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            super(t1,t2, t3, t4);
            this.t5 = t5;
        }

        @Override
        public Optional<T5> _5() {
            return Optional.of(t5);
        }

        public String toString() {
            return "(" + t1 + ", " + t2 + ", " + t3 + ", " + t4 + ", " + t5 + ")";
        }
    }

}
