import java.util.Scanner;

/**
 * Created by david on 6/2/14.
 */
public class BattleLvl50s {
    public void fightLvl50s(Pokemon attacker, Pokemon defender){
        Scanner reader = new Scanner(System.in);

        //Status of Each
        int atkHP = attacker.getHP();
        int defHP = defender.getHP();
        int defDef = defender.getdef();

        while(atkHP>0 && defHP>0){
            System.out.println(attacker.getName()+ " HP = " + atkHP);
            System.out.println(defender.getName()+  " HP= " + defHP);
            System.out.println("What move would you like to use?");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3: Instert Move:");
            System.out.println("4: Instert Move:");
            System.out.println("5: Use Potion(HP+ 20");
            int move = reader.nextInt();
            if(move == 1){

            }
            if(move == 2){

            }
            if(move == 3){
                System.out.println("add move");
            }

            if(move == 4){
                System.out.println("add move");
            }
            if(move == 5){
                atkHP= atkHP+ 20;
            }



            ///basic AI
            if(defHP>0){
                System.out.println("Oponents Turn:");
                if(atkHP <=100){
                    System.out.println("Squirtle uses Tackle");
                    atkHP = atkHP - 6;
                }
            }


            ///Check to see if You are dead
            if(defHP <= 0){
                System.out.println("You win");
            }
            if(atkHP <=0){
                System.out.println("You Loose");
            }

        }





    }
}
