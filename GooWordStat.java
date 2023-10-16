class GooWordStat {
    private final String word;
    private final int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        String freqString = null;
        if (getFreq() < 1000) {
            freqString = "LOW";
        } else if (getFreq() >= 1000 && getFreq() < 100000) {
            freqString = "MEDIUM";
        } else if (getFreq() >= 100000 && getFreq() < 10000000) {
            freqString = "HIGH";
        } else if (getFreq() >= 10000000) {
            freqString = "EXTRA HIGH";
        }
        return "Word is [" + getWord() + "], search freq is " + freqString;
    }
}
class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [Mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}
