import java.util.IntSummaryStatistics;
import java.util.Scanner;


/**
 * Created by jackie on 16.10.2015 ?..
 */
public class FormattingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());

        String hex = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);

        double b = Double.parseDouble(input.nextLine());
        double c = Double.parseDouble(input.nextLine());

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hex, Integer.parseInt(binary),b,c);

        //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
    }
}
