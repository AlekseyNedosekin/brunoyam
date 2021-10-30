package lesson6;

import java.io.FileWriter;
import java.io.IOException;

/*
В psvm с помощью try с ресурсами создать FileWriter файла "drawingBoard.txt".
Создать по одному объекту классов Text, Rectangle, Circle,
каждый из них записать в файл по одному в строке
    в таком же формате, что и в draw() с помощью String.format()

            String s = String.format("%f, %1$+020.50f", Math.PI);
        System.out.println(s);
 */
public class Z_HW4 {
    public static void main(String[] args) {
        try (FileWriter out = new FileWriter("drawingBoard.txt")){
            Text text = new Text("This is string", "Black");
            Rectangle rectangle = new Rectangle(3,4,1,1,"pink");
            Circle circle = new Circle(5,1,1,"white");
            String t = String.format("<text clr='" + text.color +"'>"+ text.value + "</text>\n", Math.PI);
            out.write(t);
            String r = String.format("<rec x=" + rectangle.x + " y=" + rectangle.y + " width=" + rectangle.width + " length=" + rectangle.length + " clr='" + rectangle.color + "'></rec>\n", Math.PI);
            out.write(r);
            String c = String.format("<circle x=" + circle.x + " y=" + circle.y + " radius=" + circle.radius + " clr='" + circle.color + "'></circle>\n", Math.PI);
            out.write(c);
            //rectangle.draw();
            //circle.draw();
            //text.draw();
        }
        catch (IOException ex) {
            System.out.println("Ошибка");
        }
    }
}
