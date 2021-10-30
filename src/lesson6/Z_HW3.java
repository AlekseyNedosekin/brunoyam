package lesson6;

/*
Создать два класса Rectangle и Circle, наследующихся от Figure
В классе Rectangle:
    два дополнительных поля - целые width и length;
    конструктор, задающий значения всех полей;
    реализация метода draw - вывод в консоль в формате "<rec x=%d y=%d width=%d length=%d clr='%s'></rec>";
    На месте %d - значения x, y, width, length в таком же порядке, на месте %s - значение color.
    Например для объекта с x=1, y=1, width=3, length=4, color="pink"
        вывод в консоль "<rec x=1 y=1 width=3 length=4 clr='pink'></rec>".
В классе Circle:
    дополнительное поле - целое radius;
    конструктор, задающий значения всех полей;
    реализация метода draw - вывод в консоль в формате "<circle x=%d y=%d radius=%d clr='%s'></circle>";
    На месте %d - значения x, y, radius в таком же порядке, на месте %s - значение color.
    Например для объекта с x=1, y=1, radius=5, color="white"
        вывод в консоль "<circle x=1 y=1 radius=5 clr='white'></circle>".
В psvm создать объекты классов Rectangle и Circle и "нарисовать" их.
 */
public class Z_HW3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4,1,1,"pink");
        Circle circle = new Circle(5,1,1,"white");
        rectangle.draw();
        circle.draw();
    }
}
