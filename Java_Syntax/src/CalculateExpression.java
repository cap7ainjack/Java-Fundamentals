import java.util.Scanner;


public class CalculateExpression {
    public static void main(String[] args) {

        //((a2 + b2) / (a2 – b2))(a + b + c) / ?c             (a2 + b2 - c3)(a – b)
       // Average (a, b, c) – Average (f1, f2)

        Scanner Scan = new Scanner(System.in);

        double A = Scan.nextDouble();
        double B = Scan.nextDouble();
        double C = Scan.nextDouble();

        double Asquare= Math.pow(A,2);
        double Bsquare = Math.pow(B,2);
        double Csquare = Math.pow(C,2);

        double F1 = Math.pow(((Asquare + Bsquare) / (Asquare - Bsquare)), ((A+B+C) / Math.sqrt(C)));
        double F2 = Math.pow((Asquare + Bsquare - Math.pow(C,3)), (A-B)) ;

        double AverageABC = (A+B+C) / 3;
        double AverageF1F2 = (F1 + F2) /2;

            System.out.printf("F1 Result: %.2f; F2 Result: %.2f; Diff: %.2f",F1,F2,Math.abs(AverageABC - AverageF1F2));
        }
}
