import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Weightlifting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lineNums = scan.nextInt();
        scan.nextLine();

        TreeMap<String, TreeMap<String, Long>> players = new TreeMap<>();

        for (int i = 0; i < lineNums; i++) {

            String[] inputLine = scan.nextLine().split("\\s+");

            String playerName = inputLine[0];
            String exercise = inputLine[1];
            long kilograms = Integer.parseInt(inputLine[2]);

            if (!(players.containsKey(playerName))) {
                players.put(playerName, new TreeMap<String, Long>());
                players.get(playerName).put(exercise,kilograms);
            } else {
                if (!(players.get(playerName).containsKey(exercise))) {

                    players.get(playerName).put(exercise, kilograms);
                } else {
                    long previousKilograms = players.get(playerName).get(exercise);
                    players.get(playerName).put(exercise, kilograms + previousKilograms);
                }
            }
        }

        //print the result
        Set<String> keys = players.keySet();

        for (String name : keys) {
            TreeMap<String, Long> results = players.get(name);
            System.out.printf("%s : ", name);

            Set<String> exercises = results.keySet();

            boolean isFirst = true;
            for (String exercise : exercises) {
                long totalWeights = results.get(exercise);
                if (!isFirst) {
                    System.out.print(", ");
                }

                isFirst = false;
                System.out.printf("%s - %d kg", exercise, totalWeights);
            }
            System.out.println();
        }
    }
}
