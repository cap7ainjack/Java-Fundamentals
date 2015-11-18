import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int WordCounter=0;

            String[] text = Scan.nextLine().trim().split("\\w+");
            WordCounter += text.length;

        System.out.println(text.length-1);
    }
}
