
/**
 * Created by david on 5/27/14.
 */
public class Attack {
    String name;
    double dmg;


    public Attack(String nameIn, double dmgIn){

        name = nameIn;
        dmg = dmgIn;

    }

    public String getName() {
        return name;
    }

    public double getDmg() {
        return dmg;
    }

    public double getStatChange(double defense) {
        return dmg - defense;
    }
}







