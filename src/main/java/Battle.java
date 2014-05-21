import java.util.Scanner;



public class Battle{




public static void fight(pokemon attacker, pokemon defender){
    Scanner reader = new Scanner(System.in);
    int atkHP = attacker.getHP();
    int defHP = defender.getHP();
    int defDef = defender.getdef();



    while(atkHP>0 && defHP>0){
        System.out.println("What move would you like to use?");
        System.out.println("1. Tackle");
        System.out.println("2. Growl");
        int move = reader.nextInt();
        if(move == 1){
            defHP= defHP -6;
        }
        if(move ==2){
            defDef = defender.getdef()- 5;

        }
        if(defHP<=0){
            System.out.println("You win");

        }
    }


}



public static void main(String[] args) {
pokemon  attacker = new pokemon("Bulbasuar","grass",33,10,14,15,11,9,"Tackle","Growl",null,null);
pokemon defender = new pokemon("derp","derp",29,12,13,16,10,10,"Tackle","Leer",null,null);
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Javamon");
    System.out.println("Press 1 to start ");
    String start = scan.nextLine();
    if(start.equalsIgnoreCase("1")){
        System.out.println("dadasdasd");
        Battle.fight(attacker,defender);
    }



}

}