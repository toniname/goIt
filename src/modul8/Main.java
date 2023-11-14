package modul8;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape rhombus = new Rhombus();

        DrawingEditor editor = new DrawingEditor();
        editor.editShape(circle);
        editor.editShape(quad);
        editor.editShape(rhombus);

    }
}

