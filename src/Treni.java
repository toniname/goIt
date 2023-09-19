

import java.util.Arrays;
import java.util.Scanner;

public class Treni {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
    }

    public boolean isMoneyName(String name) {
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        return Character.isDigit(firstChar) && Character.isDigit(lastChar);
    }

    public boolean isInvisibleName(String name) {
        return !name.isEmpty() && name.isBlank();
    }

    public String makeNamePositive(String name) {
        return name.replaceAll("(?i)no", "yes");
    }

    public String makeNameClean(String name) {
        String namePres = name.strip();
        System.out.println(namePres);
        String rep = "CLEAN";
        return rep + namePres + rep;
    }

    public String makeHalfOfName(String name) {
        return name.substring(0, name.length() / 2);
    }

    public static String getNameCode(String name) {
        char firstChar = name.charAt(0);
        if (name.length() != 1) {
            char lastChar = name.charAt(name.length() - 1);
            String firstAndLast = String.valueOf(firstChar) + String.valueOf(lastChar);
            return firstAndLast.toUpperCase();
        }


        return name;
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println(sum + " " + sub + " " + multiply + " " + divide);

        scanner.close();
    }

    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();


    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {

        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
        System.out.println(Arrays.toString(names));

    }

    public String firstAndLastTogether(String[] names) {

        return names[0] + " AND " + names[names.length - 1] + "TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        String[] arr = new String[3];
        arr[0] = results[2];
        arr[1] = results[3];
        arr[2] = results[4];
        return arr;
    }

    public char[][] createKeyboard() {
        return new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }

    public void printKeyboard() {
        char[][] keyboard = createKeyboard();
        for (char[] row : keyboard) {
            System.out.println(Arrays.toString(row));
        }
    }

    public String[] makeCopy(String[] names) {
        String[] arrCopy = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return arrCopy;

    }

    public String[] getPlanets(String galaxy) {

        if (galaxy != null) {
            return new String[0];
        } else {
            return new String[0];
        }

    }

    public double[] solve(int a, int b, int c) {
        double d = b * b - 4 * a * c;

        if (d < 0) {
            return new double[0];
        } else if (d == 0) {
            double x1 = -b / 2.0 * a;
            return new double[]{x1};
        } else {
            double x2 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x3 = (-b - Math.sqrt(d)) / (2.0 * a);
            double maxValue, minValue;

            if (x3 > x2) {

                maxValue = x3;
                minValue = x2;

            } else {

                maxValue = x2;
                minValue = x3;

            }
            return new double[]{maxValue, minValue};
        }

    }

    public String evenOrOdd(int number) {
        String condition;
        return condition = number % 2 == 0 ? "even" : "odd";

    }

    public int findMin(int[] triple) {
        return (triple[0] <= triple[1]) ? ((triple[0] <= triple[2]) ? triple[0] : triple[2]) : ((triple[1] <= triple[2]) ? triple[1] : triple[2]);
    }

    public int translate(String romanNumber) {
        romanNumber = romanNumber.trim().toUpperCase();


        switch (romanNumber) {
            case "I":
                return 1;
            case "II":
                return 2;

            case "III":
                return 3;

            case "IV":
                return 4;

            case "V":
                return 5;

            case "VI":
                return 6;

            case "VII":
                return 7;

            case "VIII":
                return 8;

            case "IX":
                return 9;

            case "X":
                return 10;

            case "XI":
                return 11;

            case "XII":
                return 12;

            default:
                return -1;
        }

    }

    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
    }

    public static void main (String[] args) {
        Treni treni = new Treni();
        System.out.println(treni.makeNamePositive("Nolan"));
        System.out.println(treni.isInvisibleName("dsgdsg"));
        System.out.println(treni.makeNameClean(" dsdsd "));
        System.out.println(treni.makeNameClean(" dfd "));
        System.out.println(treni.makeHalfOfName("jhghjgjh"));
        treni.printKeyboard();

        String[] names = new String[]{"sdsdsd", "fdfdfd", "dfdff"};
        treni.makeCopy(names);
        System.out.println(Arrays.toString(treni.solve(3, -42, 147)));
        float [] prices = {2.45f, 4.232f};
        treni.printPrices(prices);


    }
}
