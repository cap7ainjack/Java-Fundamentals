import java.util.Scanner;

/**
 * Created by  on 14.10.2015 ?..
 */
public class Sumnumbersfrom1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int result =0;
        for (int i = 0; i <=count; i++){
            result += i;
        }

        System.out.println(result);
    }
}
