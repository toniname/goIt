class SummaryCreator {
    public String create(String text) {
        if (text.length() <= 15) {
            return text;
        } else {
            String text2 = text.substring(0, 15);
            if (text.charAt(15) != ' ') {
                text2 += "...";
            }
            return text2;
        }
    }
}
class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}
