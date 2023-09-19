

public class TrurlBank {
    public int sumQuads(int n) {
        int i = 1;
        int result = 0;

        while (i <= n) {
            result += i * i;
            i++;
        }
        return result;
    }
    public int countSumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        TrurlBank trurlBank = new TrurlBank();
        System.out.println(trurlBank.sumQuads(4));
        System.out.println(trurlBank.countSumOfDigits(111));
    }
}
