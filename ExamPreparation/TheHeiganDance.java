import java.util.*;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int playerHealth = 18500;
        double heiganHealth = 3000000;
        double damage = Double.parseDouble(scan.nextLine());

        String lastSpell = "";
        int[] playerPosition = {7,7};

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            String[] inputLine = line.split(" ");
           if (line.equals("")){break;}
            String spell = inputLine[0];
            int dmgRow = Integer.parseInt(inputLine[1]);
            int dmgCol = Integer.parseInt(inputLine[2]);

            heiganHealth -= damage;


            if (lastSpell.equals("Cloud")){
                playerHealth -=3500;
               // lastSpell = "Eruption";
            }

            if (heiganHealth <=0 || playerHealth <= 0){
                break;
            }

            int movedRow = playerPosition[0];
            int movedCol = playerPosition[1];
            if (isInArea(dmgRow,dmgCol,movedRow, movedCol)){
                movedRow = playerPosition[0] - 1;
                if (isInArea(dmgRow,dmgCol,movedRow, movedCol)
                        || isNextMoveWall(movedRow,movedCol)) {
                    movedRow = playerPosition[0];
                    movedCol = playerPosition[1] + 1;
                    if (isInArea(dmgRow, dmgCol, movedRow, movedCol)
                            || isNextMoveWall(movedRow, movedCol)) {
                        movedRow = playerPosition[0] + 1;
                        movedCol = playerPosition[1];

                        if (isInArea(dmgRow, dmgCol, movedRow, movedCol)
                                || isNextMoveWall(movedRow, movedCol)) {
                            movedRow = playerPosition[0];
                            movedCol = playerPosition[1] - 1;

                            if (isInArea(dmgRow, dmgCol, movedRow, movedCol)
                                    || isNextMoveWall(movedRow, movedCol)) {

                                if (spell.equals("Cloud")){
                                    playerHealth -= 3500;
                                }
                                else {
                                    playerHealth -= 6000;
                                }
                                lastSpell = spell;
                            } else {
                                playerPosition[1]--;
                            }
                        } else {
                            playerPosition[0]++;
                        }
                    }else {
                        playerPosition[1]++;
                    }
                }else {
                    playerPosition[0]--;
                }
            }
        }

        if (heiganHealth <= 0){
            System.out.println("Heigan: Defeated!");
        }
        else {
            System.out.printf("Heigan: %.2f%n", heiganHealth);
        }
        if (playerHealth <= 0){
            if(lastSpell.equals("Cloud")){
                lastSpell = "Plague Cloud";
            }
            System.out.println("Player: Killed by " + lastSpell);
        } else {
            System.out.println("Player: " + playerHealth);
        }

        System.out.println("Final position: " + playerPosition[0] + ", " + playerPosition[1]);
    }
    static boolean isInArea(int dmgRow,int dmgCol, int playerRow, int playerCol){
        for (int row = dmgRow -1; row <= dmgRow + 1; row++){
            for (int col = dmgCol -1; col <=dmgCol + 1; col++){
                if (row == playerRow && col == playerCol){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isNextMoveWall (int plx, int plY){
        return plx < 0 || plx >= 15 || plY < 0 || plY >= 15;
    }
}
