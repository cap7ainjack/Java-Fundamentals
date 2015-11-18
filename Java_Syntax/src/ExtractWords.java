import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String Line = Scan.nextLine();

        Pattern Patt =  Pattern.compile("([A-Za-z]+)");
        Matcher Matches = Patt.matcher(Line);

        ArrayList<String> List = new ArrayList<>();

        while (Matches.find()){
            List.add(Matches.group(1));
        }

        List.forEach(word -> System.out.print(word + " "));
    }
}
