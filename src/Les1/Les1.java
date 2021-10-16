package Les1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Les1 {
    public static void Les1_1() throws IOException {
        System.out.println("Input your age");
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        String qwestion = reader.readLine();
        try {
            System.out.println("This is number: '" + parseInt(qwestion) + "'");
        } catch (NumberFormatException e) {
            System.out.print("This not number !!! ");
            System.out.println("This is text: '" + (qwestion) + "'"); //NumberFormatException
        }
/*
number,quantity=количество
figure,digit=цифра
count=подсчет
 */
    }
    public static void Les1_2() throws IOException {
        System.out.println("Input your age");
        Scanner qwestion = new Scanner(System.in);
        try {
            System.out.println("This is number: '" + qwestion + "'");
        } catch (NumberFormatException e) {
            System.out.print("This not number !!! ");
            System.out.println("This is text: '" + (qwestion) + "'"); //NumberFormatException
        }
    }

    public static void scanner(){
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println(A+B);
    }
    public static void scanner2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Name");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }

}
