class FirNum {

    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {

    @Override
    public int calc(int n) {

        int zero = 0;
        int sum = 0;
        if (n == 0) {
            return sum;
        } else {
            do {
                zero += 1;
                sum = sum + zero;
            } while (zero < n);
            return sum;
        }
    }


}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }


}

class FirNumMultiplyOdd extends FirNum {

    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i += 2) {
            result *= i;
        }
        return result;
    }


}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 ^ i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }


}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum / 2;
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumSum();
        FirNumFizzBuzz firNumFizzBuzz = new FirNumFizzBuzz();
        System.out.println(firNumFizzBuzz.calc(20));
        FirNumBasis firNumBasis = new FirNumBasis();
        System.out.println(firNumBasis.calc(10));
    }
}
