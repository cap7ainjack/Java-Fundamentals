import java.util.Scanner;

public class _StuckNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        scan.nextLine();
        Boolean haveMatch = false;

        String[] inputLine = scan.nextLine().trim().split(" ");

        for (int a =0; a < count; a++){
            for (int b = 0; b<count; b++){
                for (int c=0; c < count; c++){
                    for (int d=0; d < count; d++){

                        if  (
                                !(inputLine[a].equals(inputLine[b]))
                             && !(inputLine[a].equals(inputLine[c]))
                             && !(inputLine[a].equals(inputLine[d]))
                             && !(inputLine[b].equals(inputLine[c]))
                             && !(inputLine[b].equals(inputLine[d]))
                             &&! (inputLine[c].equals(inputLine[d]))
                        )  {

                            String leftPart = inputLine[a] + inputLine[b];
                            String rightPart = inputLine[c] + inputLine[d];

                            if (leftPart.equals(rightPart)) {
                              //  System.out.print(leftPart + " == " + rightPart);
                              //  System.out.println();
                                System.out.printf("%s|%s==%s|%s\n",inputLine[a],inputLine[b],inputLine[c],inputLine[d]);
                                haveMatch = true;
                            }
                        }
                    }
                }
            }
        }

        if (haveMatch == false){
            System.out.println("No");
        }
    }
}
