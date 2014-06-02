import java.util.Scanner;


public class Battle{

    public static void fight(Pokemon attacker, Pokemon deffender){
        Scanner reader = new Scanner(System.in);

        //Status of Each
        int atkHP = attacker.getHP();
        int defHP = deffender.getHP();
        int defDef = deffender.getdef();
        Attack Tackle = new Attack("Tackle",6);
        Attack growl = new Attack("Growl",0);






        while(atkHP>0 && defHP>0){
            System.out.println("Attacker HP= " + atkHP);
            System.out.println("Deffender HP= " + defHP);
            System.out.println("What move would you like to use?");
            System.out.println("1. Tackle");
            System.out.println("2. Growl");
            System.out.println("3: Instert Move:");
            System.out.println("4: Instert Move:");
            System.out.println("5: Use Potion(HP+ 20");
            int move = reader.nextInt();
            if(move == 1){
                System.out.println("Bulbasaur uses Tackle!");
                defHP = defHP- (int)(Tackle.getDmg()-(defDef* .1));

            }
            if(move == 2){
                System.out.println("Bulbasaur uses Growl");
                atkHP= atkHP -(int)growl.getDmg();
                defDef = deffender.getdef() - 2;
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


    public static void main(String[] args) {
        Pokemon  attacker = new Pokemon("Bulbasuar","grass",33,10,14,15,11,9,"Tackle","Growl",null,null);
        Pokemon defender = new Pokemon("Squritle","water",29,10,13,16,10,10,"Tackle","Leer",null,null);
        Pokemon Charizard = new Pokemon("Charizard","fire",150,90,95,50,70,70,"Flamethrower","Dragon Breath","Fire Spin","Scorch");
        Pokemon Mewtwo = new Pokemon("Mewtwo","Psyhic",170,90,150,100,90,50,"Psychic","Recover","Psyskrike","Swift");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Javamon");
        System.out.println("Select Your Pokemon");
        System.out.println("Level 5 Bulbasur vs Level 5 Squritle - Press 1");
        System.out.println("Level 50 Charizard vs Level 50 Mewtwo - Press 2" );

        int start = scan.nextInt();
        if(start == 1){
            fight(attacker, defender);
        }
        if(start == 2){
            fight(Charizard,Mewtwo);
        }
    }

}