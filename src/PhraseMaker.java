public class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result1 = new StringBuilder();
        String result2 = "";
        //System.out.println(result2);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }
            result1.append(word);
            if (i != words.length - 1) {
                result1.append(" ");
            }
            result2 = String.valueOf(result1);

        }
        return result2;
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        //String[] words = {"Life", "is", "great", "thing"};
        String[] words = {};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));

    }
}