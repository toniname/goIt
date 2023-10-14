import java.util.Arrays;

class TargetFinder {
    int[] aiCoords;
    int[][] targets;

    public int[] findTarget(int[] aiCoords, int[][] targets) {

        int minDistance = Integer.MAX_VALUE;
        int[] nearestTarget = null;

        for (int[] target : targets) {
            int x = target[0];
            //System.out.print(x);
            int y = target[1];
           //System.out.println(y);
            int distance = calculateDistance(aiCoords[0], aiCoords[1], x, y );

            if (distance < minDistance){
                minDistance = distance;
                nearestTarget = target;
            }
        }
        return nearestTarget;
    }
    private int calculateDistance(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return dx * dx + dy * dy;
    }
}
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
