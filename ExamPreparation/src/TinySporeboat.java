import java.util.Scanner;

public class TinySporeboat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int health = 5800;
        int glowCaps = 0;

        String line = scan.nextLine();

        while (!(line.equals("Sporeggar"))){
            char[] input = line.toCharArray();


            for (int i = 0; i < input.length -1; i++){

                char currentSign = line.charAt(i);

                if (currentSign == 'L'){
                    health += 200;
                }

                else {
                    int damage = currentSign;
                    health -= damage;
                }
            }

            int digit = Character.getNumericValue(line.charAt(line.length()-1));

            if (health <= 0){
                System.out.printf("Died. Glowcaps: %d", glowCaps);
                return;
            }
            glowCaps += digit;
            line = scan.nextLine();
        }

        System.out.printf("Health left: %d%n", health);

        if (glowCaps >= 30){
            System.out.printf("Bought the sporebat. Glowcaps left: %d%n", glowCaps - 30);
        }
        else {
            System.out.printf("Safe in Sporeggar, but another %d Glowcaps needed.",30 - glowCaps);
        }

    }
}
