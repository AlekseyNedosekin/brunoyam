package lesson6;

public abstract class Figure implements Drawable{
    int x;
    int y;
    String color;

    Figure (int x, int y, String color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Figure() {

    }
}
