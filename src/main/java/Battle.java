import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
///this is a test

public class Battle{

    public static void fight(Pokemon attacker, Pokemon deffender){
        Scanner reader = new Scanner(System.in);

        //Status of Each
        int atkHP = attacker.getHP();
        double defHP = deffender.getHP();
        double defDef = deffender.getdef();




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
                defHP= defHP - 5;
            }
            if(move == 2){
                System.out.println("add move");
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



//    public static double damage(Pokemon attacker, Pokemon deffender, int baseDmg){
//        String aType = attacker.getType();
//        String dType = deffender.getType();
//        double fdamage = 0;
//        //grass attacker
//        if(aType.equalsIgnoreCase("grass")&& dType.equalsIgnoreCase("water") || aType.equalsIgnoreCase("grass")&& dType.equalsIgnoreCase("rock")
//                || aType.equalsIgnoreCase("grass")&& dType.equalsIgnoreCase("rock")){
//            return baseDmg+(baseDmg *2) ;}else return baseDmg;
//
//        //water attacker
//        if(aType.equalsIgnoreCase("water")&& dType.equalsIgnoreCase("ground") || aType.equalsIgnoreCase("water")&& dType.equalsIgnoreCase("rock")
//                || aType.equalsIgnoreCase("water")&& dType.equalsIgnoreCase("fire")){
//            return baseDmg + (baseDmg *2) ;}else return baseDmg;
//
//        //Fire Attacker
//        if(aType.equalsIgnoreCase("Fire")&& dType.equalsIgnoreCase("bug") || aType.equalsIgnoreCase("fire")&& dType.equalsIgnoreCase("grass")
//                || aType.equalsIgnoreCase("fire")&& dType.equalsIgnoreCase("ice")){
//            return baseDmg+(baseDmg *2) ;}else return baseDmg;
//        //Normal Attacker
//        if(aType.equalsIgnoreCase("electric")&& dType.equalsIgnoreCase("flying") || aType.equalsIgnoreCase("electric")&& dType.equalsIgnoreCase("water")){
//            return baseDmg+(baseDmg *2) ;}else return baseDmg;
//        return fdamage;
//    }




    }

    public static void main(String[] args) {
        Pokemon  attacker = new Pokemon("Bulbasuar","grass",33,10,14,15,11,9,"Tackle","Growl",null,null);
        Pokemon defender = new Pokemon("Squritle","water",29,12,13,16,10,10,"Tackle","Leer",null,null);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Javamon");
        System.out.println("Press 1 to start ");
        String start = scan.nextLine();
        if(start.equalsIgnoreCase("1")){
            fight(attacker, defender);
        }
    }

}