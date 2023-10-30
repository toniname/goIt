class WaterCounter {

    public double count(String text) {
        if (text.isEmpty()) {
            return 0.0;
        }

        int spaceCount = 0;
        int totalCharCount = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
            totalCharCount++;
        }

        return (double) spaceCount / totalCharCount;
    }
}


class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
