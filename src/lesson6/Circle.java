package lesson6;

public class Circle extends Figure {
    int radius;
    int x;
    int y;
    String color;

    Circle (int radius, int y, int x, String color) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    @Override
    public void draw() {
        System.out.printf("<circle x=%d y=%d radius=%d clr='%s'></circle>\n",x,y,radius,color);
    }
}
