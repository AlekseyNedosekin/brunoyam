package lesson4;

/*
Скопировать класс Pet из второго задания в класс Z_HW3
Добавить в этот класс:
    метод sayName: у него нет входных/выходных данных; метод выводит имя в консоль
    метод getAge: у него нет входных данных; метод возвращает (с помощью return) возраст питомца
    метод doCommand: нет выходных данных; входные данные - строка с командой; метод выводит команду в консоль
В методе main класса Z_HW3 создать объект pet, задать значения его полям и проверить работу всех трёх методов
 */
public class Z_HW3 {
    // Сюда скопировать класс Pet из Z_HW2
    private static class Pet{
        String name;
        int age;

    void setName () {
        System.out.println("My name " + name);
        }

    int getAge () {
            return this.age;
        }
    void doCommand ( String s) {
        System.out.println(s);
    }
    }
    public static void main(String[] args) {
        // Здесь создавать объект
        Pet pet = new Pet();
        pet.age = 11;
        pet.name = "Vasya";
        pet.setName();
        System.out.println(pet.getAge());
        pet.doCommand("Gav-Gav");
    }
}
