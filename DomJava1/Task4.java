package DomashkiJava.DomJava1;

import java.util.Scanner;
public class Task4{
    //* 4*. Задано уравнение вида q + w = e, q, w, e >= 0. 
    //Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
    //Требуется восстановить выражение до верного равенства. 
    //Предложить хотя бы одно решение или сообщить, что его нет.*//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        System.out.print("Введите второе число первого слагаемого d: ");
        int d = scanner.nextInt();
        System.out.println("Первое число равно " + d + "?");
        System.out.print("Введите первое число второго слагаемого e: ");
        int e = scanner.nextInt();
        System.out.println("Второе число равно " + "?" + e);
        System.out.print("Введите результат r: ");
        int r = scanner.nextInt();

        for (int i = 0; i <= 9; i++) {
            x = d * 10 + i;
            for (int j = 0; j <= 9; j++) {
                y = j * 10 + e ;
                
                if (r == x + y) { 
                    System.out.println("У задачи есть решение: первое число равно " + x + ", второе число равно " + y);
                    break;
                }
                          
            }
        }
    }
}