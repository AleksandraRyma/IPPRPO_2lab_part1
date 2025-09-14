import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int choice;
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("Выберете номер задачи, которую хотите решить");
        System.out.println("1 - калькулятор");
        System.out.println("2 - задача2");
        System.out.println("3 - задача3");
        System.out.println("4 - задача4");
        System.out.println("0 - завершить");
        choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.println("1 - калькулятор");
            break;
            case 2: System.out.println("2");
            break;
            case 3: System.out.println("3");
            break;
            case 4: System.out.println("4");
            break;
            case 0:
                return;
        }
    }
    }
}
