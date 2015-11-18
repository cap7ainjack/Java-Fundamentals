import java.util.Scanner;

public class ConvertFromBase7toDecimal {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        int Base7 = Scan.nextShort(7);

        System.out.print(Integer.toString(Base7,10));
    }
}
