import java.util.*;

public class LogParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String,HashMap<String, ArrayList<String>>> errorArchive = new TreeMap<>();

        String line = scan.nextLine();

        while (!(line.equals("END"))){
            line = line.replaceAll("[{}\"\\[\\]\\s]","");
            line = line.replaceAll(":", ",");

            String[] lineParts = line.split(",");

            String projName = lineParts[1];
            String errorType = lineParts[3];
            String errorMessage = lineParts[5];

           // System.out.println(projName + " " + projType + " " + errorMassage);

            fillTreeMap(errorArchive, projName,errorType,errorMessage);

            line = scan.nextLine();
        }
        printErrorArchive(errorArchive);
    }

    private static void fillTreeMap (TreeMap<String,HashMap<String,ArrayList<String>>> errorArchive, String projName, String errorType, String errorMessage){

        if (!(errorArchive.containsKey(projName))){
            errorArchive.put(projName, new HashMap<String,ArrayList<String>>());

            errorArchive.get(projName).put(errorType,new ArrayList<String>());
            errorArchive.get(projName).get(errorType).add(errorMessage);
        }

        else {
            if (!(errorArchive.get(projName).containsKey(errorType))){
                errorArchive.get(projName).put(errorType,new ArrayList<String>());
                errorArchive.get(projName).get(errorType).add(errorMessage);
            }
            else {
                errorArchive.get(projName).get(errorType).add(errorMessage);
            }

        }

    }
    
    private static void printErrorArchive (TreeMap<String,HashMap<String,ArrayList<String>>> errorArchive){


            LinkedList<String> linkedList = new LinkedList<String>();
        for (Map.Entry<String, HashMap<String, ArrayList<String>>> entry : errorArchive.entrySet()) {
           linkedList.add(entry.getKey());
        }

        for (Map.Entry<String, HashMap<String, ArrayList<String>>> entry : errorArchive.entrySet()) {

        }

        }
        
    }


