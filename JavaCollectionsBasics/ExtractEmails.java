import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String text = Scan.nextLine();

        Pattern pattern = Pattern.compile("\\w[\\w.-]+@[\\w.]+\\w");
        Matcher matches = pattern.matcher(text);

        while (matches.find()){
            System.out.println(matches.group());
        }
    }
}
