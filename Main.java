import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int choice;
    Scanner sc = new Scanner(System.in);
    System.out.println("Изменение из вветки maxThree");
    while (true) {
        System.out.println("Выберете номер задачи, которую хотите решить");
        System.out.println("1 - калькулятор");
        System.out.println("2 - таблица умножения");
        System.out.println("3 - генерация 5-ти случайных чисел");
        System.out.println("4 - поиск максимального числа");
        System.out.println("0 - завершить");
        choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.println("1 - калькулятор");
            System.out.print("Введите первое число num1 = ");
            double num1 = sc.nextDouble();
            System.out.println();
            System.out.print("Введите второе число num2 = ");
            double num2 = sc.nextDouble();
            System.out.println();
                System.out.println("Меню");
                System.out.println("1 - сложение");
                System.out.println("2 - вычитание");
                System.out.println("3 - умножение");
                System.out.println("4 - деление");
                System.out.print("Ваш выбор: ");
                int choice2 = sc.nextInt();
                System.out.println();
                double result = 0;
                Calculator calc = new Calculator();
                switch (choice2) {
                case 1:
                    result = calc.sum(num1, num2);
                break;
                case 2:
                    result = calc.delete(num1, num2);
                break;
                case 3:
                    result = calc.multiplication(num1, num2);
                break;
                case 4:
                    result = calc.division(num1, num2);
                break;
                }
                System.out.println("Ответ: " + result);

            break;
            case 2:
            MultiplicationTable mt = new MultiplicationTable();
            mt.multiplicationTablr();
            break;
            case 3:
                RandomGeneration rg = new RandomGeneration();
                rg.generate();
            break;
            case 4:
                MaxOfThree maxNum = new MaxOfThree();
                maxNum.maxNumber();
            break;
            case 0:
                return;
        }
    }

    }
}
