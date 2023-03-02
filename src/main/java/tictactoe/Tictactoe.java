package tictactoe;

public class Tictactoe{
    public static void start() {
        protected start(){
        
        }
        int playertime = 0;
        Gamesetup gs = new Gamesetup();
        do{
            gs.playgame();
            gs.displayRes();
            gs.verticalcheck();
            gs.horizontalcheck();
            gs.diagonalcheck();
            playertime++;
        }while(playertime!=9);
    }
}
