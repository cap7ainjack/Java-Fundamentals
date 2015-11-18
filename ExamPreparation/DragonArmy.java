import java.util.*;

public class DragonArmy {
    private static int DEFAULT_DAMAGE = 45;
    private static int DEFAULT_HEALTH = 250;
    private static int DEFAULT_ARMOR = 10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        LinkedHashMap<String,TreeMap<String,int[]>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){

            String[] line = scan.nextLine().split("\\s+");

            String type = line[0];
            String name = line[1];
            int damage = line[2].equals("null")
                    ? DEFAULT_DAMAGE
                    : Integer.parseInt(line[2]);

            int health = line[3].equals("null") ? DEFAULT_HEALTH : Integer.parseInt(line[3]);
            int armor = line[4].equals("null") ? DEFAULT_ARMOR : Integer.parseInt(line[4]);

            int[] stats = new int[3];
            stats[0] = damage;
            stats[1] = health;
            stats[2] = armor;

            if (!(dragons.containsKey(type))){
                dragons.put(type, new TreeMap<String, int[]>());
                dragons.get(type).put(name, stats);
            }

            else if (!(dragons.get(type).containsKey(name))){
                dragons.get(type).put(name,stats);
            }

            else if (dragons.get(type).containsKey(name)){
                dragons.get(type).put(name,stats);
            }


        }
        //Print result
        printHashMap(dragons);

    }

    private static void printHashMap(LinkedHashMap<String, TreeMap<String, int[]>> dragons){

        for (Map.Entry<String, TreeMap<String, int[]>> entry : dragons.entrySet()){
            //average

            // print all
            System.out.println(entry.getKey() + "::" + getAvergae(entry.getValue()));
            entry.getValue()
                    .entrySet()
                    .stream()
                    .forEach(innerPair -> System.out.printf(
                            "-%s -> damage: %d, health: %d, armor: %d%n",
                            innerPair.getKey(),
                            innerPair.getValue()[0],
                            innerPair.getValue()[1],
                            innerPair.getValue()[2]));

        }


    }

    private static String getAvergae(TreeMap<String, int[]> averageDragonsStats){
            double damage = 0;
            double health = 0;
            double armor = 0;
        int count = averageDragonsStats.size();

        for (Map.Entry<String, int[]> pair : averageDragonsStats.entrySet()) {
            damage += pair.getValue()[0];
            health += pair.getValue()[1];
            armor += pair.getValue()[2];
        }

        double averageDMG = damage/count;
        double averageHealth = health/count;
        double averageArmor = armor/count;

        return  String.format("(%.2f/%.2f/%.2f)",averageDMG,averageHealth,averageArmor);
    }
}
