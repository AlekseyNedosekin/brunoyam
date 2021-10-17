package HW;

import java.util.Random;

/*
Создать массив с большим количеством целых чисел типа long
Найти разницу, между максимальным и минимальным значениями массива
Код нахождения максимума и минимума есть в одном из файлов с занятия
 */
public class Z_HW2 {
    public static void ArrayLong() {
        long[] arrInt = new long[100];
        Random r = new Random();
        long maximum;
        long minimum;

        for (int i = 0; i < arrInt.length; i++) {
            long x = r.nextLong();
            arrInt[i] = x;
        }
        maximum = arrInt[0];
        minimum = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            maximum = Math.max(maximum,arrInt[i]);
            minimum = Math.min(minimum,arrInt[i]);
        }
        System.out.println("min = " + minimum);
        System.out.println("max = " + maximum);
        System.out.println(Raznica(maximum, minimum));

    }

    static long Raznica (long l1, long l2) {
        return l1 - l2;
    }
        /*
    static void add(int a, int b) {
        System.out.println(a + b);
        //i = a + b;
    }

    static int min(int a, int b) {
        return a - b;
    }*/
}