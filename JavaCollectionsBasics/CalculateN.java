import java.util.Scanner;

public class CalculateN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        int result = factorial(number);
        System.out.printf("The factorial of %d is %d", number, result);

    }

    private static int factorial (int number){
        if (number== 1 || number == 0){
            return 1;
        }

        return number*factorial(number - 1);
    }

}
