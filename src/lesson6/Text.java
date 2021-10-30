package lesson6;

public class Text implements Drawable{
    String value;
    String color;

    Text(String value,String color) {
        this.color = color;
        this.value = value;
    }

    @Override
    public void draw() {
        System.out.printf("<text clr='%s'>%s</text>\n", color, value );
    }
}
