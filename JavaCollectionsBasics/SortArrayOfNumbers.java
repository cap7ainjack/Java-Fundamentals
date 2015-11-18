import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int[] NumsArray = new int[Scan.nextInt()];

        for (int i = 0; i < NumsArray.length; i++){
            NumsArray[i] = Scan.nextInt();
        }

        Arrays.sort(NumsArray);

        for (int j = 0; j < NumsArray.length; j++){
            System.out.print(NumsArray[j] + " ");
        }
    }
}
