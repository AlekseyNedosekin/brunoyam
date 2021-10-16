package HW;
/*
Вывести на экран текст:
Привет, меня зовут <Имя>!
Я живу в Санкт-Петербурге.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HW1 {
    public static void HW1_1() throws IOException { //main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your name");
        String ansver = reader.readLine();
        System.out.println("Input your city");
        String ansver2 = reader.readLine();
        //Scanner ansver = new Scanner(System.in);
        //Scanner ansver2 = new Scanner(System.in);
        System.out.println("Hi, my name is " + ansver + "!");
        System.out.println("I live in " + ansver2 + ".");
    }
    /*
    Создать и инициализировать значениями три переменных: int, long и float
    Вывести на экран их произведение в одной строке, сумму - в другой
     */
    public static void HW1_3() {
        int i = 1;
        long l = 1000L;
        float f = 2.89f;
        System.out.println(i*l*f);
        System.out.println(i+l+f);
    }
}
