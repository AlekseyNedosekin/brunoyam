package HW;

/*
Спросить у пользователя два целых числа int
Вывести на экран их сумму, разность, произведение, деление и остаток от деления
Знаки операций: +, -, *, /, %
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2 {
    public static void HW2_1() throws IOException {//public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите какую операцию нужно выполнить?");
        System.out.println("1-sum|сумма|+, 2-umn|умножение|*, 3-del|деление|/ ");
        System.out.println("4-raz|разность|-, 5-mod|остаток от деления|* ");
        String operation = reader.readLine();
        int num = 0;
        int num2 = 0;

        System.out.println("Введите первое число");
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Вы ввели не число! Введите число без букв!");
            num = Integer.parseInt(reader.readLine());
        }
        System.out.println("Введите второе число");
        try {
            num2 = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Вы ввели не число! Введите число без букв!");
            num2 = Integer.parseInt(reader.readLine());
        }

        if (operation.equals("sum") || operation.equals("+") || operation.equals("1")){
            System.out.print("Операция сложения = ");
            System.out.println(sum(num, num2));
        }
        else if (operation.equals("umn") || operation.equals("*") || operation.equals("2")){
            System.out.print("Операция умножения = ");
            System.out.println(umn(num, num2));
        }
        else if (operation.equals("del") || operation.equals("/") || operation.equals("3")){
            System.out.print("Операция деления =");
            System.out.println(del(num, num2));
        }
        else if (operation.equals("raz") || operation.equals("разность") || operation.equals("4")){
            System.out.print("Операция разности =");
            System.out.println(raz(num, num2));
        }
        else if (operation.equals("mod") || operation.equals("остаток от деления") || operation.equals("5")){
            System.out.print("Операция находит остаток от деления =");
            System.out.println(mod(num, num2));
        }
        else System.out.println("Вы ввели не то что просили");
    }
    public static int sum(int number1, int number2){
        int res = number1 + number2;
        return res;
    }
    public static int umn(int number1, int number2){
        int res = number1 * number2;
        return res;
    }
    public static int del(int number1, int number2){
        int res = number1 / number2;
        return res;
    }
    public static int raz(int number1, int number2){
        int res = number1 - number2;
        return res;
    }
    public static int mod(int number1, int number2){
        int res = number1 % number2;
        return res;
    }
}
