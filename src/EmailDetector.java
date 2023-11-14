class EmailDetector {
    public boolean isPresent(String text) {
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (isValidEmail(word)) {
                return true;
            }
        }

        return false;
    }
    private boolean isValidEmail(String word) {
        int atSymbolCount = word.indexOf('@');
        if (word.length() < 5 || atSymbolCount == -1 || atSymbolCount < 2 || word.length() - atSymbolCount < 2) {
            return false;
        }
        return true;
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
