import java.util.Scanner;

public class SequencesOfEqualsStrings {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        String[] InputArray = Scan.nextLine().split(" ");
        for (int i = 0; i < InputArray.length ; i++){

            if ( ((i != InputArray.length - 1)  &&(InputArray[i].equals(InputArray[i+1])))
                   ) {

                System.out.print(InputArray[i] + " " );

            }
                else{
                    System.out.println(InputArray[i]);
                }

        }
    }
}

