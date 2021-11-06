package lesson8;

import java.util.ArrayList;
import java.util.Scanner;

/*
Спросить у пользователя число N
Затем спросить N строк, добавить их в список
Вывести пользователю сначала получившийся список,
а затем информацию о том, какие строки и сколько раз встречались в списке
 */
public class Z_HW2 {
    public static void main(String[] args) {
    HW2();
    }
    static void HW2() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("Input digit N");
        int peremennaya;
        int in = scanner.nextInt();

        for (int i = 0; i < in; i++) {
            System.out.println("Input string " + (i+1));
            arr.add(scanner.next()) ;
        }

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            peremennaya = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i).equalsIgnoreCase(arr.get(j)))
                    peremennaya = peremennaya+1;
            }
            System.out.println("String '" + arr.get(i) + "' contains " + peremennaya);
        }
    }
}
