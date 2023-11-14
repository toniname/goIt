class BigOrSmall {

    public String calculate(String text) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;

        // Перебираємо символи в рядку, ігноруючи пробіли
        for (char character : text.toCharArray()) {
            if (Character.isLowerCase(character)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(character)) {
                uppercaseCount++;
            }
        }

        if (lowercaseCount > uppercaseCount) {
            return "Small";
        } else if (uppercaseCount > lowercaseCount) {
            return "Big";
        } else {
            return "Same";
        }
    }

}
class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
