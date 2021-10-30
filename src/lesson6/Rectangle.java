package lesson6;

public class Rectangle extends Figure {
    int width;
    int length;
    int x;
    int y;
    String color;

    Rectangle (int width, int length, int y, int x, String color) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.printf("<rec x=%d y=%d width=%d length=%d clr='%s'></rec>\n",x, y, width, length, color);
    }
}
