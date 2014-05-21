/**
 * Created by david on 5/20/14.test
 */


    public class pokemon {
        String name;
        int hitpoints;
        String type;
        int attack;
        int spAttack;
        int spDeff;
        int deff;
        int speed;
        String mv1;
        String mv2;
        String mv3;
        String mv4;

        public pokemon(){
            String name= "Bulbasaur";
            String type = "Grass";
            int hitpoints= 21;
            int attack = 11;
            int spAttack =13;
            int spDeff = 14;
            int deff = 11;
            int speed = 11;
            String mv1 = "Tackle";
            String mv2= "Growl";
            String mv3 = null;
            String mv4 = null;

        }


        public pokemon(String name,String type,int hitpoints,int attack,int spAttack,int spDeff,int deff,int speed, String mv1, String mv2, String mv3,String mv4){
            this.name = name;
            this.type= type;
            this.hitpoints = hitpoints;
            this.attack = attack;
            this.spAttack = spAttack;
            this.spDeff = spDeff;
            this.deff = deff;
            this.speed = speed;
            this.mv1 = mv1;
            this.mv2 = mv2;
            this.mv3 = mv3;
            this.mv4 = mv4;
        } /// creates a pokemon using a arg con method

///Hitpoints Get & Set

        public int getHP(){

            return hitpoints;

        }
        public void setHP(int hp){

            hitpoints = hp;
        }
/// Type to go here

/// Attack get & set

        public int getAtk(){
            return attack;

        }
        public void setAtk(int atk){
            attack = atk;

        }
        /// SP Attack get & Set
        public int getSpAtk(){
            return spAttack;

        }
        public void setSpAtk(int spAtk){
            spAttack= spAtk;

        }

///Special Deffense Get and Set

        public int getdef(){
            return deff;

        }
        public void setDeff(int setdeff){
            deff= setdeff;

        }

        ///Speed Get & Set
        public  int getSpeed(){
            return speed;
        }
        public void setSpeed(int spd){
            spd = speed;
        }


    }


