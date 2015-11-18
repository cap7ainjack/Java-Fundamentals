import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String[] text = Scan.nextLine().trim().split("[^a-zA-Z]+");
        String word = Scan.nextLine().toLowerCase();
        int matches = 0;
        for (int i=0; i < text.length; i++){
            if (text[i].toLowerCase().equals(word)){
                matches++;
            }
        }

        System.out.print(matches);
    }
}
