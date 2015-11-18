import java.util.Scanner;

/**
 * Created by on 14.10.2015 ?..
 */
public class GetAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        calcAverage(a,b,c);
    }

    public static void calcAverage(double a, double b, double c) {
        double result = (a + b + c)/3;
      //  System.out.print(String.format("%.2f", result));
        System.out.print(String.format("%.2f", result));
    }
}
