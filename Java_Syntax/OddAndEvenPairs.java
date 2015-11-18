import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        //System.out.print(Scan.nextLine().length());
        String[] InputLine = Scan.nextLine().split(" ");
        int LineLenght = InputLine.length;


            for (int i = 0; i < LineLenght; i++){
                int A = Integer.parseInt(InputLine[i]);
                int B = Integer.parseInt(InputLine[i + 1]);

                if (LineLenght % 2 != 0) {
                    System.out.print("Invalid input");
                    break;
                }
                if ((A % 2 == 0) && (B % 2 == 0)) {
                    System.out.println(A + ", " + B + " -> both are even");
                    i++;
                  continue;
                }
                if ((A % 2 != 0) && (B % 2 != 0)) {
                    System.out.println(A + ", " + B + " -> both are odd");
                    i++;
                    continue;
                } else {
                    System.out.println(A + ", " + B + " -> different");
                    i++;
                }

            }
        }
}