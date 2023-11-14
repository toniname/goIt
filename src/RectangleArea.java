public class RectangleArea {
    int[] coords;

    public RectangleArea(int[] coords) {
        this.coords = coords;

    }

    public int getArea() {
        int x1 = coords[0];
        int y1 = coords[1];
        int x2 = coords[2];
        int y2 = coords[3];
        int width = Math.abs(y2 - y1);
        int height = Math.abs(x2 - x1);
        return width*height;
    }
}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
