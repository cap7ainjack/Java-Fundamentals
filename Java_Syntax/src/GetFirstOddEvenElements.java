import java.util.Scanner;

public class GetFirstOddEvenElements {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String[] Numbers = Scan.nextLine().split(" ");
        String[] Command = Scan.nextLine().split(" ");

        GetEvenOrODDNums(Numbers,Command);
    }

    public static void GetEvenOrODDNums(String[] Nums, String[] Command){

        String OddEven = Command[2];
        int count = Integer.parseInt(Command[1]);
        int PrintedNums = 0;
        for (int i = 0; i < Nums.length; i++){
            int CurrentNum = Integer.parseInt(Nums[i]);

            if (PrintedNums >= count){
                break;
            }
            if (OddEven.equals("even") && CurrentNum % 2 == 0){

                    System.out.print(CurrentNum + " ");
                PrintedNums++;
            }

            if (OddEven.equals("odd") && CurrentNum % 2 != 0){

                System.out.print(CurrentNum + " ");
                PrintedNums++;
            }


        }

    }
}
