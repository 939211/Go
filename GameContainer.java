import java.util.ArrayList;

/**
 * Player class that is a child of the User class.
 * @author Oliver
 * @version 1.2
 * */
public class GameContainer {
    private static GameState g;
    private static GameGrid grid;
    private static Score s;
    private static ArrayList<GameRecord> gamesPlayed = new ArrayList<>();
    
    private GameContainer() {
    }
    
    public static GameState getG() {
        return g;
    }
    
    public static void setG(int gridSize, User player1, User player2) {
        g = new GameState(gridSize, player1, player2);
    }
    
    public static GameGrid getGrid() {
        return grid;
    }
    
    public static void setGrid(int gridSize) {
        grid = new GameGrid(gridSize);
    }
    
    public static Score getS() {
        return s;
    }
    
    public static void setS(int[][] board) {
        s = new Score(board);
    }
    
    public static ArrayList<GameRecord> getGamesPlayed() {
        return gamesPlayed;
    }
}