import java.util.Scanner;

public class LabyrinthDash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        char[][] inputMatrix = new char[n][];

        for (int i = 0; i < n ; i++) {
            inputMatrix[i] = scan.nextLine().toCharArray();
        }
            int currentRow = 0;
            int currentCol = 0;
            int movesMade = 0;
            int lifes = 3;

            char[] moves = scan.nextLine().toCharArray();

        for (int j = 0; j < moves.length; j++)            {
                char currentMove = moves[j];

            int tempRow = currentRow;
            int tempCol = currentCol;

            switch (currentMove){
                case 'v': currentRow++;
                    break;
                case '>': currentCol++;
                    break;
                case '<': currentCol--;
                    break;
                case '^': currentRow--;
            }

            if (dropOUTofTHElabyrint(currentRow,currentCol,inputMatrix)){
                movesMade++;
                System.out.println("Fell off a cliff! Game Over!");
                break;
            }

            else if (hitTHEwall(currentRow,currentCol,inputMatrix)) {
                System.out.println("Bumped a wall.");

                currentRow = tempRow;
                currentCol = tempCol;
            }
            else if (landOnAnObstacle(currentRow,currentCol,inputMatrix)){
                movesMade++;
                lifes--;
                if (lifes == 0){
                    System.out.printf("Ouch! That hurt! Lives left: %d%n", lifes);
                    System.out.println("No lives left! Game Over!");
                    break;
                }
                else {
                    System.out.printf("Ouch! That hurt! Lives left: %d%n", lifes);
                }
            }
            else if (getAnewLife(currentRow,currentCol,inputMatrix)){
                movesMade++;
                lifes++;
                System.out.printf("Awesome! Lives left: %d%n", lifes);
                inputMatrix[currentRow][currentCol] = '.';
            }

            else {
                movesMade++;
                System.out.println("Made a move!");
            }
            }

            System.out.printf("Total moves made: %d%n", movesMade);
    }

    private static boolean dropOUTofTHElabyrint(int row,int col, char[][] matrix){
       if (row < 0 || row >= matrix.length){
            return true;
        }
        if (col < 0 || col >=matrix[row].length){
            return  true;
        }
        return matrix[row][col] == ' ';
    }

    private static boolean hitTHEwall(int row,int col, char[][] matrix){
        return matrix[row][col] == '|' || matrix[row][col] == '_';
    }

    private static boolean landOnAnObstacle(int row,int col, char[][] matrix){
        return matrix[row][col] == '@' || matrix[row][col] == '#' ||
                matrix[row][col] == '*';
    }

    private static boolean getAnewLife (int row,int col, char[][] matrix){
        return matrix[row][col] == '$';
    }
}
