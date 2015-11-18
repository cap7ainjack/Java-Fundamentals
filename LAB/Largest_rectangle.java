import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Largest_rectangle {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        List<String[]> matrix = new ArrayList<>();
        String line = Scan.nextLine();

        while (!line.equals("END") ){

            matrix.add(line.replace(',', ' ').trim().split(" "));
            line = Scan.nextLine();
        }

       // printMatrix(matrix);

        for (int upperSide = 0; upperSide <matrix.get(0).length; upperSide++){

        }



    }

    public static void printMatrix(List<String[]> matrix){

        for (int i = 0; i < matrix.size(); i++) {
            String[] strings = matrix.get(i);
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
}
