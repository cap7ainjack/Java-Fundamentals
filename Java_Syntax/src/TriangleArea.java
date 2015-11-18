import java.util.Scanner;

/**
 * Created by  on 15.10.2015 ?..
 */
public class TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Ax = scanner.nextInt();
        int Ay = scanner.nextInt();
        int Bx = scanner.nextInt();
        int By = scanner.nextInt();
        int Cx = scanner.nextInt();
        int Cy = scanner.nextInt();

        //System.out.print(Ax + " " + Ay + " " + Bx + " " + By );

        int area = ((Ax*(By - Cy)) + (Bx*(Cy-Ay)) + (Cx*(Ay - By)))/2;
        System.out.print(area);
    }
}
