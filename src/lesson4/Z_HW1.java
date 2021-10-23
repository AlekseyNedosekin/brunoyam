package lesson4;

/*
Создать пустой (без полей и методов) класс Pet внутри класса Z_HW1
В методе main класса Z_HW1 создать два объекта pet1, pet2 класса Pet
Вывести их в консоль с помощью System.out.println()
 */
public class Z_HW1 {
    // Здесь написать код пустого класса Pet
    // перед ключевым словом class добавить слова private static
    private static class Pet{}
    public static void main(String[] args) {
        // Здесь создавать два объекта pet1 и pet2
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        System.out.println(pet1);
        System.out.println(pet2);
    }

}
