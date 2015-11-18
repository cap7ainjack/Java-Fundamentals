import java.util.*;
import java.util.ArrayList;

public class RubicMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();

        int[][] matrix = new int[rows][cols];

        int counter = 1;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {

                matrix[i][j] = counter;
                counter++;
            }
        }
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <n ; i++) {
            String command = scan.nextLine();
            String[] commandDetails = command.split(" ");
            int rowCol = Integer.parseInt(commandDetails[0]);
            String direction = commandDetails[1];
            int moves = Integer.parseInt(commandDetails[2]);

            if ((direction.equals("down") || direction.equals("up"))){
                //move columns
                List<Integer> colList =  new ArrayList<>();
                for (int j = 0; j <rows ; j++) {
                    colList.add(matrix[j][rowCol]);
                }

                moves %= colList.size();

                if (direction.equals("up")) {

                    List<Integer> leftPart = colList.subList(0, moves);
                    List<Integer> rightPart = colList.subList(moves, colList.size());
                    rightPart.addAll(leftPart);

                    //fill the matrix
                    for (int j = 0; j <rows ; j++) {
                        matrix[j][rowCol] = rightPart.get(j);
                    }
                }
                else {
                    List<Integer> leftPart = colList.subList(colList.size() - (moves), colList.size());
                    List<Integer> rightPart = colList.subList(0, colList.size() - (moves ));

                    leftPart.addAll(rightPart);

                    //fill the matrix
                    for (int j = 0; j <rows ; j++) {
                        matrix[j][rowCol] = leftPart.get(j);
                    }
                }
            }
            else if (moves > 0){
                //rotation %= borders.length();

                    List<Integer> rowList =  new ArrayList<>();
                    for (int j = 0; j <cols ; j++) {
                        rowList.add(matrix[rowCol][j]);
                    }

                moves %= rowList.size();

                if (direction.equals("left")){
                    List<Integer> leftPart = rowList.subList(0, moves);
                    List<Integer> rightPart = rowList.subList(moves, rowList.size());
                    rightPart.addAll(leftPart);

                    //fill the newLine in matrix
                    for (int j = 0; j <cols ; j++) {
                        matrix[rowCol][j] = rightPart.get(j);
                    }
                }
                else {
                    //right
                    List<Integer> leftPart = rowList.subList(rowList.size() - moves, rowList.size());
                    List<Integer> rightPart = rowList.subList(0, rowList.size() - moves);
                    leftPart.addAll(rightPart);

                    //fill the newLine in matrix
                    for (int j = 0; j <cols ; j++) {
                        matrix[rowCol][j] = leftPart.get(j);
                    }
                }
            }
        }
        getMatrixInOrder(matrix, rows,cols);

    }

    private static void getMatrixInOrder(int[][] matrix, int rows, int cols){
        int counter = 1;

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                int matrixPos = matrix[i][j];
                if (matrixPos == counter){
                    System.out.println("No swap required");
                }
                else {
                    for (int k = 0; k <rows ; k++) {
                        for (int l = 0; l <cols ; l++) {
                            if (counter == matrix[k][l]){
                                System.out.printf("Swap (%d, %d) with (%d, %d)%n", i,j,k,l);

                                int temp = matrix[i][j];
                                matrix[i][j] = matrix[k][l];
                                matrix[k][l] = temp;
                                break;
                            }
                        }
                    }
                }
                counter++;
            }
        }
    }
}
