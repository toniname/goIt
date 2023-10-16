class DigitText {

    public boolean detect(String text){

        for (char t : text.toCharArray()){
            if (!Character.isDigit(t) && t!= ' '){
                return false;
            }
        }
        return true;
    }
}
class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
