import java.util.Scanner;

public class MaxOfThree {
    public void maxNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Максимальное число: " + max);
    }
}
