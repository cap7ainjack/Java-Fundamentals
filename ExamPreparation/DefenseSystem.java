import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefenseSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String texLine = scan.nextLine();
        double softUniLiters = 0;

        while (!(texLine.equals("OK KoftiShans"))){
            String alcoPattern = "[A-Z][a-z]+[A-Z]";
            String namePattern = "([A-Z][a-z]+)[\\d\\W\\s]";
            String litersPattern = "(\\d+)L";

            Pattern alcoPatt = Pattern.compile(alcoPattern);
            Pattern namePatt = Pattern.compile(namePattern);
            Pattern litersPatt = Pattern.compile(litersPattern);

            Matcher alcohol = alcoPatt.matcher(texLine);
            Matcher names = namePatt.matcher(texLine);
            Matcher liters = litersPatt.matcher(texLine);

            while (alcohol.find() && names.find() && liters.find()){

                System.out.println(names.group(1) + " brought " + liters.group(1) + " liters of " + alcohol.group(0).toLowerCase() + "!");
                softUniLiters += Double.parseDouble(liters.group(1));
            }

            texLine = scan.nextLine();
        }

        softUniLiters /= 1000;
        System.out.printf("%.3f softuni liters",softUniLiters);
    }
}
