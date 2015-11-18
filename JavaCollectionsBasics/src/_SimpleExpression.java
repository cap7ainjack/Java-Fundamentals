import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _SimpleExpression {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       String input = scan.nextLine();

        Pattern numSign = Pattern.compile("(^|\\W+)(\\d\\.\\d+|\\d+)");
        Matcher numSignMatch = numSign.matcher(input);
        double result = 0;

        while (numSignMatch.find()) {
        //numSignMatch.group().replaceAll(".",",");

            if (numSignMatch.group().contains("-")){

                double number = Double.parseDouble(numSignMatch.group().replaceAll("[\\s\\-\\+]+", ""));
                result -= number;
            }

            else {
                double number = Double.parseDouble( numSignMatch.group().replaceAll("[\\s\\-\\+]+", ""));
                result += number;
            }
        }

        System.out.printf("%.7f",result);
    }
}
