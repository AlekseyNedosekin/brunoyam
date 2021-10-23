package lesson4;
/*
Создать класс Plant
    Поля Plant:
    Дробное число height для высоты растения
    Дробное число width для ширины растения
Конструктор Plant:
    Входные данные - два дробных числа height и width
    Конструктор записывает в this.height и this.width значения входных данных
Метод grow:
    Нет входных, выходных данных
    Выводит в консоль строку "Я расту"
В psvm создать объект класса Plant, вывести поля объекта, вызвать метод grow
*/

public class Z_HW5 {
    // Код класса Plant (сделать его private static)
     private static class Plant{
        double height;
        double width;
        Plant (double hight, double width) {
            this.height = hight;
            this.width = width;
        }
        void grow1 () {
            System.out.println("I'm growing up");
        }
    }
    public static void main(String[] args) {
        // Создание объекта
        Plant plant = new Plant(12.1,6.1);
        System.out.println(plant.height + " " + plant.width);
        plant.grow1();
    }
}
