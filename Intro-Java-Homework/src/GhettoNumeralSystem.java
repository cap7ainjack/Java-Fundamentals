import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by  on 14.10.2015 ?..
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        //ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        String NumAsString = scanner.nextLine();


        for (int i = 0; i < NumAsString.length(); i++){
            char digit = NumAsString.charAt(i);

            switch (digit){
                case '0': System.out.print("Gee");
                    break;
                case '1': System.out.print("Bro");
                    break;
                case '2': System.out.print("Zuz");
                    break;
                case '3': System.out.print("Ma");
                    break;
                case '4':System.out.print("Duh");
                    break;
                case '5':System.out.print("Yo");
                    break;
                case '6':System.out.print("Dis");
                    break;
                case '7':System.out.print("Hood");
                    break;
                case '8':System.out.print("Jam");
                    break;
                case '9':System.out.print("Mack");
                    break;
                default:break;
            }
        }
    }
}
