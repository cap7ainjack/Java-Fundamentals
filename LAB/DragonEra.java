import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
class Dragon {
    private String name;
    private int age;
    private List<Egg> eggs;
    private boolean isAlive;
    private int AGE_DEATH = 6;
    private int AGE_LAY_EGGS_START = 3;
    private int AGE_LAY_EGGS_END = 4;
    private List<Dragon> children;

    public Dragon(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void lay(Egg egg) {
        if (this.age >= AGE_LAY_EGGS_START && this.age <= AGE_LAY_EGGS_END){

            this.eggs.add(egg);
        }
    }

    public void age(){
        if(this.isAlive){
            this.age++;
        }

        if (this.age == AGE_DEATH){
            this.isAlive = false;
        }
    }

    public  void increaseOffSpring(Dragon baby){
        children.add(baby);
    }

    public String getName() {
        return name;
    }
}

class Egg {
    private int age;
    private Dragon parent;
    private int AGE_HATCH = 2 ;


    public Egg(int age, Dragon parent) {
        this.age = age;
        this.parent = parent;
    }

    public void age() {
        this.age++;
    }

    public void hatch(){
        if (this.age == AGE_HATCH){
            Dragon baby = new Dragon(
                    this.parent.getName() + "/" + "Dragon_" + DragonEra.dragonsCount, 0
            );
            this.parent.increaseOffSpring(baby);
            DragonEra.dragonsCount++;
        }
    }


}


public class DragonEra {
    public static int dragonsCount = 0;

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int StartDragons = Integer.parseInt(Scan.nextLine());
        List<Dragon> dragons = new ArrayList<>();

        for (int i = 1; i <= StartDragons; i++) {
            Dragon dragon = new Dragon("Dragon_" + i,0);

            int eggs = Integer.parseInt(Scan.nextLine());

            for (int eggCount = 0; eggCount < eggs; eggCount++){
                Egg egg = new Egg(0,dragon);
                dragon.lay(egg);
            }

            dragons.add(dragon);

            // System.out.print(StartDragons);
        }

        dragonsCount = StartDragons + 1;

        int YearsOfWork = Integer.parseInt(Scan.nextLine());

        for (int year = 1; year <= YearsOfWork; year++){
            String YearType = Scan.nextLine();

            enum YearType{
                bad
            }
        }
    }

}
*/


