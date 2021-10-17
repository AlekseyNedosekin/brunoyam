package HW;

/*
Создать класс Client (написать его на одном уровне с классом Z_HW3, т.е. Client не находится внутри Z_HW3)
Задать ему два поля:
идентификатор типа long с именем uid
значение счёта double с именем balance
В методе main класса Z_HW3 создать двух клиентов, задать значения их полям
Попробовать вывести их через System.out.println()
 */
public class Z_HW3 {
    public static void main(String[] args) {
        Client Alex = new Client(100_000_000_001L,1_500_000.00);
        Client Andru = new Client(100_000_000_002L,1_000.00);
        System.out.println("Alex Balance equals = " + Alex.balance + " and Unique ID = " + Alex.uid);
        System.out.println("Andru Balance equals = " + Andru.balance + " and Unique ID = " + Andru.uid);
    }
}
