import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i<=n; i++){
            char[] inputLine = scan.nextLine().toCharArray();
            int lenght=0;

            //lenght calculation
            for (int z =0; z< inputLine.length; z++){
                int currentChar = inputLine[z];
                if ((inputLine[z] == ' ') || ( currentChar >= 48 && currentChar <= 57)){
                    continue;
                }
                else {
                    lenght++;
                }
            }

            int m = lenght/2;
            // X = k + m
            for (int index=0; index <inputLine.length; index++){
                char character = inputLine[index];

                if (character == ' '){
                    System.out.print(" ");
                    continue;
                }

                else {
                    int k = character;
                    if ( k >= 48 && k <= 57){
                        System.out.print(character);
                    }
                    else {
                        int x = k + m;
                        char letter = (char) x;

                        System.out.print(letter);
                    }
                }
            }
            System.out.println();
        }
    }
}
