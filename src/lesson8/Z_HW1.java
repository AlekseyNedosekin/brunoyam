package lesson8;

import java.util.ArrayList;
import java.util.Scanner;

/*
Спросить у пользователя число N
Затем спросить N целых чисел, добавить их в список
Подсчитать количество положительных чисел в списке, вывести эту информацию
 */
public class Z_HW1 {
    public static void main(String[] args) {
        HW1();
    }

    static void HW1() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Input digit N");
        int poloj = 0;
        int cash = 0;
        int in = scanner.nextInt();

        for (int i = 0; i < in; i++) {
            System.out.println("Input digit № " + (i+1));
            cash = scanner.nextInt();
            arr.add(cash);
            if (cash > 0)
                poloj = poloj + 1;
        }

        System.out.println(arr + " here " + poloj + " positive digit");
    }
}
