import java.util.Random;

public class RandomGeneration {
    public void generate() {
        Random rand = new Random();
        System.out.println("Случайные числа от 1 до 100:");
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(100) + 1;
            System.out.print(num + ", ");
        }
        System.out.println();
    }

}
