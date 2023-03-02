package shapes;

import java.util.Scanner;
import java.util.logging.Logger;

public class Shapes {
protected Shapes(){}
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void start() {
        int option;
        Scanner sc=new Scanner(System.in);
        do{
        LOGGER.info("Select any one of the shapes\n1. Triangle\n2. Rectangle\n3. Circle\n4. Exit");   
        option = sc.nextInt();
        switch(option){
            case 1:
            LOGGER.info("Enter dimensions for Triangle");
            Triangle t1=new Triangle();
            t1.perimeter();
            t1.area();
            break;
            case 2:
            LOGGER.info("Enter dimensions for  Rectangle");
            Rectangle r1=new Rectangle();
            r1.perimeter();
            r1.area();
            break;
            case 3:
            LOGGER.info("Enter dimensions for  circle");
            Circle c1=new Circle();
            c1.perimeter();
            c1.area();
            break;
            case 4:
            LOGGER.info("Exit");
            break;
            default:
            LOGGER.info("Please enter a valid dimensions.");
            break;
        }
        }while(option!=4);
    }
}
