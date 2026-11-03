abstract class Player{
    int XP;
    int coins;

    void spawn(){System.out.println("\nPlayer Spawned!");}

    abstract void attack();
    abstract void specialMove();
}

class Warrior extends Player{
    public Warrior(){
        XP = 100;
        coins = 200;
    }


    @Override
    void attack(){
        coins+=10;
        XP+=50;
    }

    @Override 
    void specialMove(){
        System.out.println("Power Strike!");
    }
}   

class Knight extends Warrior{
    public Knight(){
        XP = 250;
        coins = 400;
    }


    @Override
    void attack(){
        coins+=20;
        XP+=60;
    }
    
    @Override 
    void specialMove(){
        System.out.println("Shield Block!");
    }
}

class Champion extends Knight{
    public Champion(){
        XP = 500;
        coins = 800;
    }

    @Override
    void attack(){
        coins+=30;
        XP+=70;
    }
    
    @Override 
    void specialMove(){
        System.out.println("Battle Strike!");
    }
}

class Warlord extends Champion{
    public Warlord(){
        XP = 1000;
        coins = 1200;
    }
    @Override
    void attack(){
        coins+=40;
        XP+=80;
    }
    
    @Override 
    void specialMove(){
        System.out.println("Summon Troops!");
    }
}

class Vanguard extends Warlord{
    public Vanguard(){
        XP = 2000;
        coins = 2400;
    }
    @Override
    void attack(){
        coins+=50;
        XP+=100;
    }
    
    @Override 
    void specialMove(){
        System.out.println("Fatal Blow!");
    }
}



public class MultilevelPolymorphism {
    public static void main(String[] args) {
        Player p1 = new Knight();
        Player p2 = new Champion();
        Player p3 = new Warlord();
        Player p4 = new Vanguard();

        p1.spawn();
        p1.attack();
        p1.specialMove();

        p2.spawn();
        p2.attack();
        p2.specialMove();

        p3.spawn();
        p3.attack();
        p3.specialMove();

        p3.spawn();
        p4.attack();
        p4.specialMove();
    }
}
