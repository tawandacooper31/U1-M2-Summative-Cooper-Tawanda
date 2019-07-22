public class Main {
    public static void main(String[] args){
        Farmer farmer = new Farmer("Farmer Fred");
        Constable constable = new Constable ("Constable Cindy");
        Warrior warrior = new Warrior("Wonder Woman");


        farmer.attack(warrior);
        warrior.attack(constable);
        constable.attack(farmer);


    }


}
