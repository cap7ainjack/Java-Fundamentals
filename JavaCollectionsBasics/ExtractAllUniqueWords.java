import java.util.*;
import java.util.stream.Stream;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        TreeSet<String> line1 = new TreeSet<>(Arrays.asList(Scan.nextLine().toLowerCase().trim().split("\\W+")));

        // Collections.sort(line1);

        for (String counter : line1){
                System.out.print(counter + " ");
        }

    }
}

/*
TreeSet<String> line1 = new TreeSet<>(Arrays.asList(Scan.nextLine().toLowerCase().trim().split("\\W+")));

// Collections.sort(line1);

for (String counter : line1){
        System.out.print(counter + " ");
        }
        */