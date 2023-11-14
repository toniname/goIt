class AvgWordLength {

    public double count(String phrase) {

        String[] words = phrase.split(" ");
        int count = 0;
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
            count++;
        }
        if (words.length > 0) {
            return (double) totalLength / count;
        } else {
            return 0.0;
        }

    }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }

}
