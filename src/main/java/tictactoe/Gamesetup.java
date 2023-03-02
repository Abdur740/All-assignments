package tictactoe;

import java.util.Scanner;
import java.util.logging.Logger;

class Gamesetup{
    private static final Logger log = Logger.getLogger("InfoLogging");
    StringBuilder sb =  new StringBuilder("\n");
    Scanner sc = new Scanner(System.in);
    char [][] arr = new char[3][3];
    String dia1="";
    String dia2="";
    String row1="";
    String row2="";
    String row3="";
    String playerX = "Player x wins!";
    String playerO = "Player o wins!";
  
    Gamesetup(){
        char value = 49;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = value;
                value++;
                sb.append(arr[i][j]+" | ");
            }
            sb.append("\n");
        }log.info(""+sb);
    }
    void playgame(){
        log.info("Enter 'x' or 'o' in the rows and columns to play.\n");
        log.info("Select the box number: ");
        char boxvalue = sc.next().charAt(0);   
        log.info("Enter 'x' or 'o': ");
        char player = sc.next().charAt(0);   

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(boxvalue == arr[i][j]) {
                arr[i][j] = player;       
            }
        }
    }
}
void verticalcheck()
{
    String col1 = "";
    String col2 = "";
    String col3 = "";
    
    for(int i=0;i < 3;i++){
        for(int j=0;j<3;j++){
            if(i==0){
                col1 = col1+arr[j][i];
            }
            else if(i==1){
                col2 = col2+arr[j][i];
            }
            else{
                col3 = col3+arr[j][i];
            }
        }if(col1.equals("xxx")){
            log.info(playerX);
        }else if(col1.equals("ooo")){
            log.info(playerO);
        }
        if(col2.equals("xxx")){
            log.info(playerX);
        }else if(col2.equals("ooo")){
            log.info(playerO);
        }
        if(col3.equals("xxx")){
            log.info(playerX);
        }else if(col3.equals("ooo")){
            log.info(playerO);
        }
        col1 = "";
        col2 = "";
        col3 = "";
    }
}
    void horizontalcheck(){
        for(int i=0;i < 3;i++){
            for(int j=0;j < 3;j++){
                if(i==0){
                    row1 = row1+arr[i][j];
                }
                else if(i==1){
                    row2 = row2+arr[i][j];
                }
                else{
                    row3 = row3+arr[i][j];
                }
            }if(row1.equals("xxx")){
                log.info(playerX);
            }else if(row1.equals("ooo")){
                log.info(playerO);
            }
            if(row2.equals("xxx")){
                log.info(playerX);
            }else if(row2.equals("ooo")){
                log.info(playerO);
            }
            if(row3.equals("xxx")){
                log.info(playerX);
            }else if(row3.equals("ooo")){
                log.info(playerO);
            }
            row1 = "";
            row2 = "";
            row3 = "";
        }
    }
   
    void diagonalcheck()
    {
        int j=0;
        dia1="";
        dia2="";
    
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    dia1=dia1+arr[i][j];
                  
                }
                if(i+j==2)
                {
                    dia2=dia2+arr[i][j];
                }
            }
            if(dia1.equals("xxx"))
            {
             log.info(playerX);
            }
            else if(dia1.equals("ooo")){
                log.info(playerO);
            }
            if(dia2.equals("xxx"))
            {
             log.info(playerX);
            }else if(dia2.equals("ooo")){       
            log.info(playerO);
            }
        }
    }
    void displayRes(){
        sb =  new StringBuilder("\n");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                sb.append(arr[i][j]+" | ");
            }
            sb.append("\n");    
        }
        String print = " "+sb;
        log.info(print);
    }
}
