package lesson4;

/*
Скопировать класс Pet из первого задания в класс Z_HW2
Добавить в этот класс:
    поле name с именем питомца
    поле age с возрастом питомца
В методе main класса Z_HW2 создать объект pet, задать значения его полям
 */
public class Z_HW2 {
    // Сюда скопировать класс Pet из Z_HW1
    private static class Pet{
        String name;
        int age;
    }
    public static void main(String[] args) {
        // Здесь создавать объект
        Pet pet = new Pet();
        pet.age = 11;
        pet.name = "Vasya";
    }
}
