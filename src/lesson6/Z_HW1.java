package lesson6;

/*
Создать интерфейс Drawable, в котором задан один метод void draw()
Создать класс Text, реализующий интерфейс Drawable, в котором:
    два поля - строка value и строка color;
    один конструктор, задающий значения value и color;
    реализация метода draw - вывод в консоль в формате "<text clr='%s'>%s</text>".
    На месте %s - значения color и value в таком же порядке;
    Например для объекта с value="Это строка" и color="black"
        вывод в консоль "<text clr='black>Это строка</text>".
В psvm класса Z_HW1 создать два объекта класса Text и "нарисовать" их.
*/

/*
ВАЖНО: все интерфейсы и классы в этом и последующих заданиях
создавать в отдельных файлах по одному на файл
Например, интерфейс Drawable - единственное содержимое файла Drawable.java,
класс Text - единственное содержимое файла Text.java
 */
public class Z_HW1{
    public static void main(String[] args) {
        Text text = new Text("This is string", "Black");
        text.draw();
    }
}
