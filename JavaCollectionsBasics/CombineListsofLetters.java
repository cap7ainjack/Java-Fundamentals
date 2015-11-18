import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineListsofLetters {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

       ArrayList<Character> l1 = new ArrayList(Arrays.asList(Scan.nextLine().trim().split(" ")));
        ArrayList<Character> l2 = new ArrayList(Arrays.asList(Scan.nextLine().trim().split(" ")));

       for (int i = 0; i < l2.size(); i++){
           if (!(l1.contains(l2.get(i)))){
               l1.add(l2.get(i));
           }
       }

        for (int j=0; j < l1.size(); j++){
            System.out.print(l1.get(j) + " ");
        }
    }
}
