

public class TriangleDrawer {

    public String drawTriangle(int side) {

        String result = "";
        int currentSide = side;
        while (currentSide > 0) {
            int starsNumber = currentSide;
            while (starsNumber > 0) {
                result += '*';
                starsNumber--;
            }
            result += "\n";
            currentSide--;
        }
        return result;
    }




    public static void main(String[] args) {
        TriangleDrawer triangleDrawer = new TriangleDrawer();
        System.out.println(triangleDrawer.drawTriangle(4));
    }

}

