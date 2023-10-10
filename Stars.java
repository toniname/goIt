
public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String[] symbols = {"*", "Z", "ZZ", "ZZZ", "ZZZZ", "ZZZZZ", "ZZZZZZ", "ZZZZZZZ", "ZZZZZZZZ", "ZZZZZZZZZ"};
        String result = "";

        int remainingCount = count;

        while (remainingCount >= 1000) {
            result += "X";
            remainingCount -= 1000;
        }

        if (remainingCount >= 100) {
            int hundreds = remainingCount / 100;
            result += "Y".repeat(hundreds);
            remainingCount %= 100;
        }

        if (remainingCount >= 10) {
            int tens = remainingCount / 10;
            result += "Z".repeat(tens);
            remainingCount %= 10;
        }

        if (remainingCount > 0) {
            int digit = remainingCount;
            result += "*".repeat(digit);
        }

        return result;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.count = 1255;


        System.out.println(stars.toString());
    }
}
