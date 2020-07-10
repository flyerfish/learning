package com.sylar.leetcode;

public class FizzBuzz {
    private int n;
    private volatile int i = 1;
    private volatile int f = 0;  //fizz block
    private volatile int b = 0;  //buzz block
    private volatile int bf = 0; //fizzbuzz block
    private volatile int nu = 1; //number unblock. at first, number = 1， begin here

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (i <= n) {
            while (f == 0 && i <= n) {
            } //block thread,looks like fizz is waitting
            if (i > n) {
                break;
            }
            printFizz.run();
            i++;
            f = 0;  //fizz block
            nu = 1;  //number unblock
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (i <= n) {
            while (b == 0 && i <= n) {
            } //block thread,looks like buzz is waitting
            if (i > n) {
                break;
            }
            printBuzz.run();
            i++;
            b = 0;  //buzz block
            nu = 1;  //number unblock
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (i <= n) {
            while (bf == 0 && i <= n) {
            } //block thread,looks like fizzbuzz is waitting
            if (i > n) {
                break;
            }
            printFizzBuzz.run();
            i++;
            bf = 0;  //fizzbuzz block
            nu = 1;   //number unblock
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (i <= n) {
            while (nu == 0 && i <= n) {
            } //bblock thread,looks like number is waitting
            if (i > n) {
                break;
            }
            if (i % 5 != 0 && i % 3 != 0) {
                printNumber.accept(i);
                i++;
            } else {
                nu = 0; // number block
                if (i % 3 == 0 && i % 15 != 0) {
                    f = 1;  //fizz unblock
                }

                if (i % 5 == 0 && i % 15 != 0) {
                    b = 1;  //buzz unblock
                }

                if (i % 15 == 0) {
                    bf = 1;  //fizzbuzz unblock
                }
            }
        }
    }


    public class IntConsumer {
        public void accept(int i) {

        }
    }
}
