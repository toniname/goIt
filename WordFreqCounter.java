class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        phrase = phrase.toLowerCase();
        word = word.toLowerCase();

        String[] parts = phrase.split(" ");//2
        //System.out.println(parts.length);
        int i = 0;
        for (String p : parts) {
            if (p.equals(word)) {
                i++;
            }
        }

        return (float) i / parts.length;
    }

}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));

        System.out.println(freqCounter.countFreq("sivabicinyz guynvarori lidufydoelz Zahuedacyg dutoad laadikgiab " +
                "Zahuedacyg ryzejycihu jucobubii nemojo Zahuedacyg kotewuho ti", "zahuedacyg"));
    }
}
