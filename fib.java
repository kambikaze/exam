class FibRec {
    static int fib_rec(int n, int a, int b) {
        if (n < 2) {
            return a;
        } else if (n == 2) {
            return b;
        } else {
            return fib_rec(n - 1, b, a + b);
        }
    }
    public static int fib_calc(int n) {
        return fib_rec(n, 0, 1);
    }
}
class FibIter {
    public static int fib_calc(int n) {
        int a, b, temp;
        a = temp = 0;
        b = 1;
        if (n < 2) {
            return a;
        } else if (n == 2) {
            return b;
        }
        for (int i = 2; i < n; i++) {
            temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }
}
class Fib {
    int n;
    Fib(int n) {
        this.n = n;
    }
    void calc() {
        System.out.println("Recursive Res : " + FibRec.fib_calc(this.n));
        System.out.println("Iterative Res : " + FibIter.fib_calc(this.n));
    }
}
class Main {
    public static void main(String[] args) {
        Fib f = new Fib(7);
        f.calc();
    }
}
