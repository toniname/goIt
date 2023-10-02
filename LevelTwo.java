public class LevelTwo{
        private int width;
        private int height;

        public LevelTwo(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
}
class LevelTooBigException extends Exception {
    public LevelTooBigException() {
        super("Level is too big");
    }
}

class LevelLoader1 {
    public void load(LevelTwo level) throws LevelTooBigException {
        int area = level.getWidth() * level.getHeight();
        if (area > 100000) {
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}

class LevelLoaderTest1 {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader1().load(new LevelTwo(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader1().load(new LevelTwo(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}