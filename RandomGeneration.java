import java.util.Arrays;
import java.util.Random;

public class RandomGeneration {
    public void generate() {
        Random rand = new Random();
        int [] numbers = new int[5];
        System.out.println("Случайные числа от 1 до 100:");
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(100) + 1;
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        System.out.println("Отсортированные случайные числа:");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

}
