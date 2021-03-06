import java.util.Scanner;
/**
 * Battle
 * Created by David Hudson on 5/28/14.
 */

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
            System.out.println("3: Use Potion(HP+ 20");
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
            if(move == 3){
                atkHP= atkHP+ 10;
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
                System.out.println(deffender.getName() + "has fainted");
                System.out.println("You win");
            }
            if(atkHP <=0){
                System.out.println("You Loose");
            }

        }




    }
    public static void fight50s (Pokemon attacker, Pokemon defender){
        int count = 0; /// turn counter;
        Scanner reader = new Scanner(System.in);

        //Status of Each
        int atkHP = attacker.getHP();
        int defHP = defender.getHP();
        int defenderDef = defender.getdef();
        int atkdef = attacker.getdef();
        boolean burned = false;
        boolean poisoned = false;
        //Moves
        Attack firespin = new Attack("Fire Spin",60);
        Attack flamethrower = new Attack("Flamethrower",70);
        Attack dragonbreath = new Attack("Dragon Breath",80);
        Attack scorch = new Attack("Scorch",30);
        Attack psychic = new Attack("Psychic",60);
        Attack psystrike = new Attack("Psystrike",80);
        Attack swift = new Attack("Swift", 70);
        Attack toxic = new Attack("Toxic",30);
        while(atkHP>0 && defHP>0){
            System.out.println(attacker.getName()+ " HP = " + atkHP);
            System.out.println(defender.getName()+  " HP= " + defHP);
            System.out.println("What move would you like to use?");
            System.out.println("1. "+ attacker.getMv1() );
            System.out.println("2. "+ attacker.getMv2() );
            System.out.println("3: "+ attacker.getMv3() );
            System.out.println("4: "+ attacker.getMv4() );
            System.out.println("5: Use Potion(HP+ 50");
            int move = reader.nextInt();
            if(move == 1){
                System.out.println(attacker.getName() + " uses "+ attacker.getMv1() );
                defHP = defHP - (int)(flamethrower.getDmg() - (defenderDef * .1));
            }
            if(move == 2){
                System.out.println(attacker.getName() + " uses "+ attacker.getMv2() );
                defHP = defHP - (int)(dragonbreath.getDmg() - (defenderDef * .1));
            }
            if(move == 3){
                System.out.println(attacker.getName() + " uses "+ attacker.getMv3() );
                defHP = defHP - (int)(firespin.getDmg() - (defenderDef * .1));
            }

            if(move == 4){
                System.out.println(attacker.getName() + " uses "+ attacker.getMv4() );
                defHP = defHP - (int)(scorch.getDmg() - (defenderDef * .1));
                burned = true;
            }
            if(move == 5){
                System.out.println("You use a Potion, and" + attacker.getName() + "recovers 30 HP");
                atkHP= atkHP+ 30;
            }
            if (burned){ // Applies to all Damage over Time effects

                defHP= defHP - 7;


            }




            ///basic AI
            if(defHP>0){
                System.out.println("Oponents Turn:");
                int chooseMove= (int)(Math.random() *4);
                if(chooseMove == 1 ){
                    System.out.println(defender.getName() + " uses "+ defender.getMv1() );
                    atkHP = atkHP - (int)(psychic.getDmg() - (atkdef * .1));
                }
                if(chooseMove == 2){
                    System.out.println(defender.getName() + " uses "+ defender.getMv2() );
                    atkHP = atkHP - (int)(psystrike.getDmg() - (atkdef * .1));
                }
                if(chooseMove == 3){
                    System.out.println(defender.getName() + " uses "+ defender.getMv3() );
                    atkHP = atkHP - (int)(swift.getDmg() - (atkdef * .1));
                }

                if(chooseMove == 4){
                    System.out.println(defender.getName() + " uses "+ defender.getMv4() );
                    atkHP = atkHP - (int)(toxic.getDmg() - (atkdef * .1));
                    poisoned = true;
                }

                if (poisoned){
                    System.out.println(attacker.getName()+ "takes damage from poison");
                    atkHP= atkHP- 7;
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
    public static void twoPlayer(Pokemon attacker, Pokemon defender){
        Scanner reader = new Scanner(System.in);

        //Status of Each
        int atkHP = attacker.getHP();
        int defHP = defender.getHP();
        int defenderDef = defender.getdef();
        int atkdef = attacker.getdef();
        boolean burned = false;
        boolean poisoned = false;
        //Moves
        Attack firespin = new Attack("Fire Spin",60);
        Attack flamethrower = new Attack("Flamethrower",70);
        Attack dragonbreath = new Attack("Dragon Breath",80);
        Attack scorch = new Attack("Scorch",30);
        Attack psychic = new Attack("Psychic",60);
        Attack psystrike = new Attack("Psystrike",80);
        Attack swift = new Attack("Swift", 70);
        Attack toxic = new Attack("Toxic",30);
        while(atkHP>0 && defHP>0){
            System.out.println(attacker.getName()+ " HP = " + atkHP);
            System.out.println(defender.getName()+  " HP= " + defHP);
            System.out.println("What move would you like to use?");
            System.out.println("1. "+ attacker.getMv1() );
            System.out.println("2. "+ attacker.getMv2() );
            System.out.println("3: "+ attacker.getMv3() );
            System.out.println("4: "+ attacker.getMv4() );
            System.out.println("5: Use Potion(HP+ 50");
            int move = reader.nextInt();
            if(move == 1){
                System.out.println(attacker.getName() + " uses "+ attacker.getMv1() );
                defHP = defHP - (int)(flamethrower.getDmg() - (defenderDef * .1));
            }
            if(move == 2){
                System.out.println(attacker.getName() + " uses "+ attacker.getMv2() );
                defHP = defHP - (int)(dragonbreath.getDmg() - (defenderDef * .1));
            }
            if(move == 3){
                System.out.println(attacker.getName() + " uses "+ attacker.getMv3() );
                defHP = defHP - (int)(firespin.getDmg() - (defenderDef * .1));
            }

            if(move == 4){
                System.out.println(attacker.getName() + " uses "+ attacker.getMv4() );
                defHP = defHP - (int)(scorch.getDmg() - (defenderDef * .1));
                burned = true;
            }
            if(move == 5){
                System.out.println("You use a Potion, and " + attacker.getName() + "recovers 30 HP");
                atkHP= atkHP+ 30;
            }
            if (burned){ // Applies to all Damage over Time effects
                System.out.println(defender.getName() + "takes damage from being burned");
                defHP= defHP - 7;


            }




            //Player 2

            System.out.println("Oponents Turn:");
            System.out.println(attacker.getName()+ " HP = " + atkHP);
            System.out.println(defender.getName()+  " HP= " + defHP);
            System.out.println("1. "+ defender.getMv1() );
            System.out.println("2. " + defender.getMv2());
            System.out.println("3: " + defender.getMv3());
            System.out.println("4: " + defender.getMv4());
            System.out.println("5: Use Potion(HP+ 50");

            int playerTwoMove = reader.nextInt();

            if(playerTwoMove == 1 ){
                System.out.println(defender.getName() + " uses "+ defender.getMv1() );
                atkHP = atkHP - (int)(psychic.getDmg() - (atkdef * .1));
            }
            if(playerTwoMove == 2){
                System.out.println(defender.getName() + " uses "+ defender.getMv2() );
                atkHP = atkHP - (int)(psystrike.getDmg() - (atkdef * .1));
            }
            if(playerTwoMove == 3){
                System.out.println(defender.getName() + " uses "+ defender.getMv3() );
                atkHP = atkHP - (int)(swift.getDmg() - (atkdef * .1));
            }

            if(playerTwoMove == 4){
                System.out.println(defender.getName() + " uses "+ defender.getMv4() );
                atkHP = atkHP - (int)(toxic.getDmg() - (atkdef * .1));
                poisoned = true;
            }
            if(playerTwoMove == 5){
                System.out.println("You use a Potion, and" + defender.getName() + "recovers 30 HP");
                atkHP= atkHP+ 30;
            }

            if (poisoned){
                System.out.println(attacker.getName()+ " takes damage from poison");
                atkHP= atkHP- 7;
            }



            ///Check to see if You are dead
            if(defHP <= 0){
                System.out.println("Player 1 wins");
            }
            if(atkHP <=0){
                System.out.println("Player 2  Wins");
            }

        }


    }







    public static void main(String[] args) {
        Pokemon  attacker = new Pokemon("Bulbasuar","grass",33,10,14,15,11,9,"Tackle","Growl",null,null);
        Pokemon defender = new Pokemon("Squritle","water",29,10,13,16,10,10,"Tackle","growl",null,null);
        Pokemon charizard = new Pokemon("Charizard","fire",150,90,95,50,70,70,"Flamethrower","Dragon Breath","Fire Spin","Scorch");
        Pokemon mewtwo = new Pokemon("Mewtwo","Psyhic",170,90,150,100,90,50,"Psychic","Psyskrike","Swift","Toxic");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Javamon");
        System.out.println("Select Your Pokemon and Game Type");
        System.out.println("Level 5 Bulbasur vs Level 5 Squritle - Press 1");
        System.out.println("Level 50 Charizard vs Level 50 Mewtwo - Press 2" );
        System.out.println("Two Player Game Level 50 Charizard vs Level 50 Mewtwo - Press 3 ");
        int start = scan.nextInt();
        if(start == 1){
            fight(attacker, defender);
        }
        if(start == 2){
            fight50s(charizard,mewtwo);
        }
        if(start == 3){
            twoPlayer(charizard,mewtwo);
        }
    }


}