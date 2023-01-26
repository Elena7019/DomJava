package DomashkiJava.DomJava1;

import java.util.Scanner;
public class Task1 {
    /* 1.	Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
    (произведение чисел от 1 до n)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        long sum = 0;
        long fact = 1;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Сумма первых " + n + " чисел: " + sum);
        System.out.println("Факториал числа "+ n + ": " + fact);
    }
}
    



