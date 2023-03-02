package studentgpa;

import java.util.Scanner;
import java.util.logging.Logger;

class GPA{
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
    String name;
    String gradeLevel;
    double gpa1;

    GPA(){
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter student name: ");
        name = sc.nextLine();
        LOGGER.info("Enter Student grade: ");
        gradeLevel = sc.nextLine();
        LOGGER.info("Enter GPA: ");
        gpa1 = sc.nextDouble();
        
    }
    String display(){
        return name+" has a "+gpa1+" GPA.";
    }
    void update(){
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter new GPA: ");
        double newGPA = sc.nextDouble();        
        gpa1 = newGPA;
        LOGGER.info("Update successful.");
        String display = display();
        LOGGER.info(display);
    }
    void checkrecord(){
        Scanner sc =  new Scanner(System.in);
        while(true){
            LOGGER.info("Enter username: ");
            String userName = sc.nextLine();
        if (userName.equals(name)){
            update();
            break;
        }
        else{
            LOGGER.info("Invalid username, try again...");
        }
    }
    }   
}
