
public class NameEncoderDecoder {
    public String encode(String name) {
        String encodedName = name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");

        encodedName = "NOTFORYOU" + encodedName + "YESNOTFORYOU";

        return encodedName;
    }

    public String decode(String name) {
        String decodedName = name.replaceFirst("NOTFORYOU", "")
                .replaceFirst("YESNOTFORYOU", "");

        decodedName = decodedName
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");

        return decodedName;
    }


    public String makeNamePositive(String name) {
        return name.replaceAll("(?i)no", "yes");
    }

    public static void main(String[] args) {
        NameEncoderDecoder nameEncoderDecoder = new NameEncoderDecoder();

        System.out.println(nameEncoderDecoder.encode("hjkjaaaa23"));
    }
}
