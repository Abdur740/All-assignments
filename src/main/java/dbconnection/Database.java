// "1. Design a class for a simple database connection pool. The class should have the following features:
//- A private constructor to prevent the class from being instantiated directly.
//- A static method that returns an instance of the class (following the singleton pattern).
//- A method that returns a new connection to the database.
//-A method that closes all open connections and releases them back to the pool.


package dbconnection;
import java.util.Scanner;
import java.util.logging.Logger;

public class Database{
protected Database(){}
   public static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void start() {
        
        Scanner sc = new Scanner(System.in);               
        int loop = 0;
            while (loop==0){
                try{
                Dbconnection.getInstance();
                LOGGER.info("select 1. To start a new connection\nselect 2. To close or get new a connection\nselect 3. Check connection. \nselect 4. To Exit a connection ");
                LOGGER.info("Enter choice: ");
                int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            Dbconnection.newconnection();
                            break;
                        case 2:
                            Dbconnection.closeconnection();
                            break;
                        case 3:
                            Dbconnection.checkconnection();
                            break;
                        case 4:
                            loop=1;
                            LOGGER.info("Exit.");
                            break;   
                        default:
                            LOGGER.info("Please select a valid choice (1/2): ");  
                            break;          
                    }
                }
                catch(Exception e){
                    String print = ""+e;
                    LOGGER.info(print);
                    sc.nextLine();
                }
        }
    }
}
