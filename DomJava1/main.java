package DomashkiJava.DomJava1;


public class Main {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите число n: ");
    int n = scanner.nextInt();

    long sum = 0;
    long fact = 1;
    
    for (int i = 0; i < n + 1; i++) {
        sum = sum + i;
    }

    for (int i = 1; i < n + 1; i++) {
        fact = fact * i;
    }
}
