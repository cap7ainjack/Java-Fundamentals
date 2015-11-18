import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String text = Scan.nextLine().toLowerCase();
        String NeededStr = Scan.nextLine().toLowerCase();

        int searchIndex = 0;
        int occurrences =0;
        int findindx;

        while ((findindx = text.indexOf(NeededStr,searchIndex)) >= 0){
            occurrences++;
            searchIndex = findindx + 1;
        }

        System.out.println(occurrences);
    }
}
