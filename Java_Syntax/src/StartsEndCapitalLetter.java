import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsEndCapitalLetter {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String Line = Scan.nextLine();
        Pattern Patt = Pattern.compile("(\\b[A-Z][a-zA-Z]*[A-Z])\\b");
        Matcher Matches = Patt.matcher(Line);

        ArrayList<String> List = new ArrayList<>();

        while (Matches.find()){
            List.add(Matches.group(1));
        }

        List.forEach(w -> System.out.print(w + " "));
    }
}
