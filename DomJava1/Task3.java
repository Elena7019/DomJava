package DomashkiJava.DomJava1;

import java.util.Scanner;
public class Task3 {
    /*Реализовать простой калькулятор*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double res;
        System.out.print("Введите число n: ");
        double n = scanner.nextDouble();
        System.out.print("Введите действие (+, -, /, *): ");
        char q = scanner.next().charAt(0);
        System.out.print("Введите число m: ");
        double m = scanner.nextDouble();

        switch(q){
            case '+': res = n + m;
               break;
            case '-': res = n - m;
               break;
            case '*': res = n * m;
               break;
            case '/': res = n / m;
               break;
            default:  System.out.println("Недопустимое действие");
               return;
         }
         System.out.printf(n + " " + q + " " + m + " = " + res);
}
    
    
}
