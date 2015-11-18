import java.util.Scanner;

public class PrintNums1toN_Recrsv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        printNumsDesc(n);
    }

    private static void printNumsDesc(int n){
        if (n < 1){
            return;
        }
            printNumsDesc(n - 1);
            System.out.println(n);
    }
}
