public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int a, int b) {
        this.width = a;
        this.height = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {


        return (width <= anotherRect.width && height <= anotherRect.height)||(width <= anotherRect.height && height <= anotherRect.width);
    }

}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}
