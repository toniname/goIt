class NameParser {
    public String parse(String[] names) {
        String result = "";
        StringBuilder result1 = new StringBuilder();
        for(int i = 0; i < names.length; i++) {

            String firstName = names[i].split(" ")[0];
            result1.append(firstName);
            if (i != names.length - 1) {
                result1.append(", ");

            }
            result = String.valueOf(result1);
        }

        return result;
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
