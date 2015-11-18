import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class LongestIncreasingSeq {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String[] InputLine = Scan.nextLine().split(" ");
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> LongestSeq = new ArrayList<>();

        for (int i = 0; i < InputLine.length-1 ; i++) {

            int CurrentNum = Integer.parseInt(InputLine[i]);
            int NextNum = Integer.parseInt(InputLine[i + 1]);


            if ((CurrentNum < NextNum)  ){
                System.out.print(CurrentNum + " ");
                List.add(CurrentNum);

                if (i == InputLine.length-2){
                    List.add(NextNum);
                    System.out.println(NextNum + " ");
                }
                if (List.size() > LongestSeq.size()){
                    LongestSeq = (ArrayList) List.clone();
                }
            }

            else {
                System.out.println(CurrentNum + " ");
                List.add(CurrentNum);

                if (i == InputLine.length-2){
                    List.add(NextNum);
                    System.out.println(NextNum + " ");
                }

                if (List.size() > LongestSeq.size()){
                    LongestSeq = (ArrayList) List.clone();
                }

                List = new ArrayList<>();
            }

        }

       // System.out.println(List);
            System.out.print("Longest: ");
        for (int softUni =0; softUni<LongestSeq.size(); softUni++){
            System.out.print(LongestSeq.toArray()[softUni] + " ");
        }
     //  System.out.println("Longest: " + LongestSeq);


    }
}
