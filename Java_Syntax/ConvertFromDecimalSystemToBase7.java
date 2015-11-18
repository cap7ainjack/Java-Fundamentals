import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        int Decimal = Scan.nextInt();

        System.out.print(Integer.toString(Decimal,7));
    }
}
