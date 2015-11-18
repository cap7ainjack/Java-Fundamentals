import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeirdScript {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        n = n -1;
        int charCode = n % 26;

        char keyLetter = (n / 26) % 2 == 0
                ? (char)('a' + charCode)
                : Character.toUpperCase((char)('a' + charCode));

        String key = keyLetter + "" +keyLetter;

        StringBuilder builder = new StringBuilder();
        String input = scan.nextLine();
        while (!(input.equals("End"))){
            builder.append(input);
            input = scan.nextLine();
        }

        String pattern = key + "(.*?)" + key;
        Pattern pat = Pattern.compile(pattern);

        Matcher matcher = pat.matcher(builder);

        while (matcher.find()){
            if (matcher.group(1).length() > 0){
                System.out.println(matcher.group(1));
            }
        }

    }
}