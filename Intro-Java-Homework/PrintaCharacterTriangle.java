import java.util.Scanner;

/**
 * Created by  on 13.10.2015 ?..
 */
public class PrintaCharacterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character firstLetter = 'a';

        int a = scanner.nextInt();

        printHalf(a, firstLetter, "increase");
        printHalf(a, firstLetter, "decrease");
    }
    private static void printHalf(int n, char firstLetter, String command) {
        if ( command == "increase")
            for (int i = 0; i < n; i++){
                for (int j = 0; j <= i; j++){
                    System.out.print((char) (firstLetter + j) + " ");
                }
                System.out.println();
            }

        if (command == "decrease")
            for (int i = n - 1 ; i > 0; i--){
                for (int j = 0 ; j < i ; j++){
                    System.out.print((char)(firstLetter + j) + " ");
                }
                System.out.println();
            }
        }
    }


