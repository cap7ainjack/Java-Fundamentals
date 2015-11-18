import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class _LogsAggregator {
    public static void main(String[] args) {

        Locale locale = Locale.ROOT;

        Scanner scan= new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.print(a + b);
    }
}
