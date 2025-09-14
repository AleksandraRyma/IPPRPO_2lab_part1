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
        if (c > max) max = b;

        System.out.println("Максимальное число: " + max);
        if ((a == b && b == c)) {
            System.out.println("Все три числа равны.");
        } else if ((a == b && a == max) || (b == c && b == max) || (a == c && a == max)) {
            System.out.println("Есть равные максимальные числа.");
        }
    }
}
