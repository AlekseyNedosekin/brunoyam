package HW;

import java.util.Random;

/*
Создать массив с большим количеством значений типа long
С помощью цикла пройтись по всем элементам в массиве и,
в случае если элемент больше, чем максимальное значение int, вывести его на экран
Максимальное значение int = 2_147_483_647
 */
public class Z_HW1 {
    public static void ArrayLong() {
        long[] arrInt = new long[100];
        Random r = new Random();

        for (int i = 0; i < arrInt.length; i++) {
            long x = r.nextLong();
            arrInt[i] = x;
        }
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i]>2_147_483_647) {
                System.out.print(i + " индекс = ");
                System.out.println(arrInt[i]);
            }
        }
    }
}
