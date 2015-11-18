import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        List<String> nums = new ArrayList<>();

    nums.addAll(Arrays.asList(Scan.nextLine().trim().split(" ")));
        String command = Scan.nextLine();

        if (command.equals("Ascending")){
            nums.stream()
                    .map(s -> Integer.parseInt(s))
                    .sorted((num1,num2) -> num1.compareTo(num2))
                    .forEach(num -> System.out.print(num + " "));
        }

        else {
            nums.stream()
                    .map(s -> Integer.parseInt(s))
                    .sorted((num1,num2) -> num2.compareTo(num1))
                    .forEach(num -> System.out.print(num + " "));


        }
}
}
