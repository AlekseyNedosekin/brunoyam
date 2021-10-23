package lesson4;

/*
Создать класс CircleMath параллельно классу Z_HW4
Добавить единственный пустой конструктор с модификатором доступа private
Добавить static поле со значением PI
Добавить static методы для вычисления длины окружности и площади окружности
У обоих методов входные данные - дробное число с радиусом окружности;
выходные данные - дробное число с результатом операции

В psvm проверить работу этого класса: использовать оба метода класса без создания объекта
 */
class CircleMath {
    static double PI;
    static double SCircle (double r) {
        //System.out.print("S = " + 3.1415926535 * r * r);//S=Pi*R^2
        return 3.1415926535 * r * r;
    }
    static double CCircle (double r) {
        //System.out.print("C = " + 2 * 3.1415926535 * r); //C=2Pi * R
        return 2 * 3.1415926535 * r;
    }
    private CircleMath () {
    }
}
// Код класса CircleMath
public class Z_HW4 {
    public static void main(String[] args) {
        // Проверка методов класса CircleMath
        System.out.println(CircleMath.CCircle(5.5));
        System.out.println(CircleMath.SCircle(5.5));
    }
}
