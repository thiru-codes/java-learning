abstract class Player{
    void gainXp(){System.out.println("XP gained!");}
    void attack(){System.out.println("Attack!");}
}

class Recruit extends Player{
    void spawn(){System.out.println("Spawned!");}
    void collectCoins(){System.out.println("Coins collected!"); }
}

class Warrior extends Recruit{
    void powerStrike(){System.out.println("Power Strike!");}
}   

class Knight extends Warrior{
    void shieldBlock(){System.out.println("Shield Block!");}
}

class Champion extends Knight{
    void battleStrike() {System.out.println("Battle Strike!");}
}

class Warlord extends Champion{
    void summonTroops() {System.out.println("Summon Troops!");}
}

class Vanguard extends Warlord{
    void fatalBlow() {System.out.println("Fatal Blow!");}
}

public class FamilyHierarchy{
    public static void main(String[] args) {

        Vanguard player = new Vanguard();

        player.gainXp();
        player.attack();
        player.spawn();
        player.collectCoins();
        player.powerStrike();
        player.shieldBlock();
        player.battleStrike();      
        player.summonTroops();
        player.fatalBlow();
    }
}
