import java.util.Scanner;

public class PalatkaConf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleComing = Integer.parseInt(scan.nextLine());
        int numberOfLines = Integer.parseInt(scan.nextLine());

        int beds=0;
        int meals = 0;
        for (int i = 0; i < numberOfLines; i++) {

            String[] line = scan.nextLine().split("\\s+");
            String foodOrBed = line[0];
            int count = Integer.parseInt(line[1]);
            String type = line[2];

            switch (foodOrBed){
                case "rooms":
                    if (type.equals("single")){
                        beds += count;
                    }
                    else if (type.equals("double")){
                        beds += (count*2);
                    }
                    else {
                        beds += (count*3);
                    }
                    break;

                case "tents":
                    if (type.equals("normal")){
                        beds += (count*2);
                    }
                    else {
                        beds += (count*3);
                    }
                    break;

                case "food":
                    if (type.equals("musaka")){
                        meals += (count*2);
                    }
                    break;
            }
        }

        if (beds >= peopleComing){
            System.out.printf("Everyone is happy and sleeping well. Beds left: %d%n", beds - peopleComing);
        }
        else {
            System.out.printf("Some people are freezing cold. Beds needed: %d%n", peopleComing - beds);
        }

        if (meals >= peopleComing){
            System.out.printf("Nobody left hungry. Meals left: %d%n", meals - peopleComing);
        }
        else {
            System.out.printf("People are starving. Meals needed: %d%n", peopleComing - meals);
        }

    }
}
