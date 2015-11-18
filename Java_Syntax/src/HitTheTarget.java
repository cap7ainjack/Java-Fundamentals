import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int Target = Scan.nextByte();

        for (int FirstNum = 1; FirstNum <= 20; FirstNum++){
            for (int SecondNum = 1; SecondNum<=20; SecondNum++){

                if (FirstNum + SecondNum == Target){
                    System.out.println(FirstNum + " + " + SecondNum + " = " + Target);
                }
                if (Math.max(FirstNum,SecondNum) - Math.min(FirstNum,SecondNum) == Target){
                    System.out.println(Math.max(FirstNum,SecondNum) + " - " + Math.min(FirstNum,SecondNum) + " = " + Target);
                }
            }
        }
    }
}
