import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        int A = Scan.nextInt();
        int B = Scan.nextInt();

        int min = Math.min(A,B);
        int max = Math.max(A,B);

        Random RandomGen = new Random();

        for (int i = min; i <= max; i++){

            System.out.print(RandomGen.nextInt(max) + " ");
        }
    }
}
