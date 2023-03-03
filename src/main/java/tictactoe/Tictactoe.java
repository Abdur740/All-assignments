package tictactoe;

public class Tictactoe{
    private Tictactor(){}
    public static void start() {
        Gamesetup gf=new Gamesetup();
        gf.gameBoard();
        gf.fillGameBoard();
    }
}
