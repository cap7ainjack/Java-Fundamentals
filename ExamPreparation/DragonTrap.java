import java.util.ArrayList;
import java.util.Scanner;

public class DragonTrap {
    private static ArrayList<int[]> positions;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        char[][] matrix = new char[n][];
        char[][] originalMatrix = new char[n][];

        for (int i = 0; i < n; i++){
           String line = scan.nextLine();
                matrix[i] = line.toCharArray();
                originalMatrix[i] = line.toCharArray();
           // System.out.println(originalMatrix[i]);
        }

        String command = scan.nextLine();

        while (!command.equals("End")){

            command = command.replaceAll("[)(]+", "");
            String[] commands = command.split("\\s+");

          //  System.out.println(command);

            int hitRow = Integer.parseInt(commands[0]);
            int hitCol = Integer.parseInt(commands[1]);
            int radius = Integer.parseInt(commands[2]);
            int rotations = Integer.parseInt(commands[3]);
           //System.out.println(hitRow + " " + hitCol + " " + radius + " " + rotations);

            int topBorder = hitRow - radius;
            int lowerBorder = hitRow + radius;
            int leftBorder = hitCol - radius;
            int rightBorder = hitCol + radius;

            String borders = getBorders(matrix,topBorder,lowerBorder,leftBorder,rightBorder);
            borders = rotateBorders(borders, rotations);
            //System.out.println(borders);

            for (int z = 0; z < borders.length(); z++) {
                int row = positions.get(z)[0];
                int col = positions.get(z)[1];
                int counter=0;
                matrix[row][col] = borders.charAt(z);
            }

            command = scan.nextLine();
        }

       printMatrix(matrix, originalMatrix);
    }

    private static String getBorders (char[][] matrix, int top, int bottom, int left, int right){
        StringBuilder borders = new StringBuilder();
        positions = new ArrayList<>();
        if (top >=0 && top < matrix.length){
            int minCol = Math.max(0, left);
            int maxCol = Math.min(right,matrix[0].length -1);
            for (int  i = minCol; i <= maxCol; i++){
                borders.append(matrix[top][i]);
                positions.add(new int[] {top, i});
            }
            top++;
        }

        if (right >=0 && right < matrix[0].length){
            int minRow = Math.max(0, top);
            int maxRow = Math.min(matrix.length - 1, bottom);
            for (int i = minRow; i<=maxRow; i++ ){
                borders.append(matrix[i][right]);
                positions.add(new int[] {i, right});
            }
            right--;
        }

        if (bottom >=0 && bottom < matrix.length){
            int minCol = Math.max(0,left);
            int maxCol = Math.min(matrix[0].length - 1, right);
            for (int  i = maxCol; i >= minCol; i--){
                borders.append(matrix[bottom][i]);
                positions.add(new int[] {bottom, i});
            }
            bottom--;
        }

        if (left >=0 && left < matrix[0].length){
            int minRow = Math.max(0, top);
            int maxRow = Math.min(matrix.length - 1, bottom);
            for (int i = maxRow; i>=minRow; i-- ){
                borders.append(matrix[i][left]);
                positions.add(new int[] {i, left});
            }
        }

        return borders.toString();
    }

    private static String rotateBorders (String borders, int rotation){
        //a b c f i h g d
        //d a b c f i h g  clockwise
        //b c f i h g d a backward clock

        if (rotation > 0 && borders.length() >0){
            rotation %= borders.length();
            String leftPart = borders.substring(0, borders.length() - rotation);
            String rightPart = borders.substring(borders.length() - rotation);
            return rightPart + leftPart;
        }
        else if (rotation < 0 && borders.length() > 0){
            rotation = Math.abs(rotation);
            rotation %= borders.length();
            String leftPart = borders.substring(0, rotation);
            String rightPart = borders.substring(rotation);
            return rightPart + leftPart;
        }
        return borders;
    }

    private static void printMatrix(char[][] matrix, char[][] originMatrix) {
        int changesMade=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != originMatrix[i][j]){
                    changesMade++;
                }
                System.out.print(matrix[i][j]);
            }
               System.out.println();
            
        }
            System.out.println("Symbols changed: " + changesMade);
        
    }
        
}
