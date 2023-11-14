import java.util.Objects;

class QuarkeTrack {
    private final int[] lines;
    private int sum;

    public QuarkeTrack(int[] lines) {
        this.lines = lines;
       for (int i = 0; i< this.lines.length; i++){
            this.sum = this.sum + lines [i];
       }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return sum == that.sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum);
    }
}

    class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};
        int[] track4Data = {57, 1, 4, 1, 26};
        int[] track5Data = {14, 47, 28};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);
        QuarkeTrack track4 = new QuarkeTrack(track4Data);
        QuarkeTrack track5 = new QuarkeTrack(track5Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());

        System.out.println(track4.hashCode() == track5.hashCode());
    }
}
