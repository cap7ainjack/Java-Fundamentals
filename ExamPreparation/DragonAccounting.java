import jdk.nashorn.internal.ir.WhileNode;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class DragonAccounting {
    private static LinkedHashMap<Integer, LinkedHashMap<Integer, Integer>> employees ;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double capital = Double.parseDouble(scan.nextLine());

        String inputLine = scan.nextLine();
            int daysCounter = 1;
        while (!(inputLine.equals("End"))){
            String[] line = inputLine.split(";");

            String newHires= line[0];
            String fired = line[1];
            String salary = line[2];

            employeesAccount(newHires, fired,salary,employees, capital,daysCounter);

            for (int i = 3; i < line.length; i++) {
                String s = line[i];

            }

            inputLine = scan.nextLine();
            daysCounter++;
        }
    }

    private static void employeesAccount(String newHires, String fired, String salary,
                                         LinkedHashMap<Integer, LinkedHashMap<Integer,Integer>> employees,
                                         double capital, int dayCounter){
        int hires = Integer.parseInt(newHires);
        int salaryAmount = Integer.parseInt(salary);

        employees.put(dayCounter, new LinkedHashMap<Integer,Integer>());
        employees.get(dayCounter).put(hires, salaryAmount);
    }
}
