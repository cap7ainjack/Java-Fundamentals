import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImplementRecursiveBinarySearch {
    static  List<Integer> inputNums;
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int findNum = Scan.nextInt();
        Scan.nextLine();

        inputNums = Stream.of(Scan.nextLine().split(" "))
                                .map(num -> Integer.parseInt(num))
                                .sorted()
                                .collect(Collectors.toList());

        int neededIndex = binarySearch(findNum,0,inputNums.size() - 1);
        System.out.print(neededIndex);
    }

    private static int binarySearch(int wantedNum, int start,int end){

        if (end < start){
            return -1;
        }

        int middle = (start + end)/2;

        if (inputNums.get(middle) < wantedNum){
            return binarySearch(wantedNum,middle + 1, end);
        }

        if (inputNums.get(middle) > wantedNum){
            return binarySearch(wantedNum,start,middle + 1);
        }

        return middle;

    }
}
