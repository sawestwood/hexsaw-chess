package uk.org.hexsaw.chess;

public class Game {

    private static Game instance = new Game(); // Eagerly Loading of singleton instance

    private Game(){
        // private to prevent anyone else from instantiating
    }

    public static Game getInstance() {
        return instance;
    }

}