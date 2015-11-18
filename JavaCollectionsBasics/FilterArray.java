import java.util.Scanner;
import java.util.stream.Stream;

public class FilterArray {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        Stream.of(Scan.nextLine().split(" ")).filter(x -> x.length() > 3).forEach(g -> System.out.print(g + " "));


    }
}
