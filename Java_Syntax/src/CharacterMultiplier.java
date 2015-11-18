import java.lang.reflect.Array;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        String[] Words = Scan.nextLine().split(" ");


        stringMultiplier(Words);
    }

    public static void stringMultiplier(String[] Words) {

        int SmallerLenght = Math.min(Words[0].length(), Words[1].length());
        int BiggerLenght = Math.max(Words[0].length(), Words[1].length());

        int result = 0;
        for (int i = 0; i < SmallerLenght; i++) {

            char FirstLetter = Words[0].charAt(i);
            char SecondLetter = Words[1].charAt(i);

            result += FirstLetter * SecondLetter;
        }

        if (Words[0].length() != Words[1].length()) {

            String BiggerWord = null;
            if (Words[0].length() > Words[1].length()) {
                BiggerWord = Words[0];
            } else {
                BiggerWord = Words[1];
            }

            for (int j = SmallerLenght; j < BiggerLenght; j++) {
                result += BiggerWord.charAt(j);
            }
        }

        System.out.println(result);
    }
}
