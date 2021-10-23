package lesson4;

/*
Скопировать класс Plant из Z_HW5
Сделать класс Plant абстрактным (добавить слово abstract как модификатор)
Убрать фигурные скобки и всё, что внутри у метода grow
Создать два класса Tree и Bush, наследующиеся от класса Growing
У обоих классов будут конструкторы работающие так же, как и конструктор Plant
Метод grow в классе Tree будет увеличивать поле с высотой
Метод grow в классе Bush будет увеличивать поле с шириной
В psvm создать объекты Tree и Bush, вывести их поля, вызвать метод grow и вывести поля ещё раз
 */
public class Z_HW6 {
    // Копировать Growing и Plant сюда
    class Growing  {}
    private abstract class Plant{
        double height;
        double width;
        Plant (double hight, double width) {
            this.height = hight;
            this.width = width;
        }
        void growing () {};
    }
    // Создать класс Tree и Bush здесь (сделать их private static)
    class Tree extends Growing {
        double height;
        double width;
        Tree (double hight, double width) {
            this.height = hight;
            this.width = width;
        }

        void grow ();
    }
    class Bush extends Growing {
        double height;
        double width;
        Bush (double hight, double width) {
            this.height = hight;
            this.width = width;
        }
    }
    public static void main(String[] args) {
        // Создание объектов

    }
}
