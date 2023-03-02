package dscollection;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
protected Main(){}
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void start() {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            log.info("Choose Options\n1. Array\n2.Linkedlist\n3.Exit");
            int option = sc.nextInt();
        if(option ==1){
            Array arrexecution = new Array();
            arrexecution.arrayexecution();
        }
        else if(option ==2){
            LinkedList llexecution = new LinkedList();
            llexecution.linkedlistexecution();
        }
        else if(option ==3){
            return ;
        }
        else{
            log.info("Enter a valid option.");
        }
        }
        
        
    }    
}
