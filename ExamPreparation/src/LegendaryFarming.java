import java.util.*;

public class LegendaryFarming {
    public static Boolean boughtItem = false;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String,Integer> keyMaterials = new TreeMap<String,Integer>() {{
            put("shards", 0);
            put("fragments", 0);
            put("motes", 0);
        }};

        TreeMap<String,Integer> junk = new TreeMap<>();

        while (scan.hasNextInt()){
            int quantity = scan.nextInt();
            String material = scan.next().toLowerCase();

            //junk
            if (!(material.equals("shards") || material.equals("fragments") || material.equals("motes")) ){

                if (!(junk.containsKey(material))){
                    junk.put(material,quantity);
                }
                else {
                    int previousQuantity = junk.get(material);
                    junk.put(material, previousQuantity + quantity);
                }
            }

            //key materials
            else {
                if (!(keyMaterials.containsKey(material))){
                    keyMaterials.put(material,quantity);
                }

                else {
                    int previousQuantity = keyMaterials.get(material);
                    keyMaterials.put(material,previousQuantity + quantity);
                }
            }

            checkKeyMaterials(keyMaterials,junk);
            if (boughtItem) return;
        }
    }

    private static void checkKeyMaterials(TreeMap<String,Integer> keyMaterials, TreeMap<String,Integer> junk){
        Boolean boughtSomething = false;

        for (Map.Entry<String, Integer> entry : keyMaterials.entrySet()) {
            String material = entry.getKey();
            Integer quantity = entry.getValue();

            if (quantity >= 250){
               //String boughtItem = material.substring(0, 1).toUpperCase() + material.substring(1);

                System.out.printf("%s obtained!%n", returnItem(material));
                keyMaterials.put(material, quantity - 250);
                boughtSomething = true;
            }
        }

        if (boughtSomething) {

            keyMaterials.entrySet().stream()
                    .sorted((k1, k2) -> k2.getValue().compareTo(k1.getValue()))
                    .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));

            junk.entrySet().stream()
                    .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
            boughtItem = true;

        }
    }

    private static String returnItem(String material){
        if (material.equals("shards")) return "Shadowmourne";
        if (material.equals("fragments")) return "Valanyr";

        return "Dragonwrath";
    }
}
