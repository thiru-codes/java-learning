package implementstatic.practice;

class Game{
    // static variable
    static int gameCounter;
    static String staticMessage = "Welcome to Gaming System!";
    String gameName;

    // static initializer block
    static{
        System.out.println("Static initialising block running...");
        gameCounter = 0;
    }

    //static nested class
    static class Helper{
        static void staticDisplay(){
            System.out.println(staticMessage);
        }
        void display(){
            System.out.println(staticMessage);
        }
    }
   
    public Game(String gameName){
        this.gameName = gameName;
        gameCounter++;
    }

    // static method
    public static int getGameCount(){
        return gameCounter;
    }

}

public class GamingSystem {
    public static void main(String[] args){
        Game.Helper.staticDisplay();

        Game.Helper helper = new Game.Helper();
        helper.display();

        System.out.println(Game.gameCounter);

        Game game1 = new Game("COD");
        Game game2 = new Game("LOL");

        System.out.println(Game.gameCounter);
    }
}
