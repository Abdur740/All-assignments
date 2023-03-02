package collection;
import java.util.Scanner;
import java.util.logging.Logger;


public class Selectset{

protected selectset(){}
private static final Logger log = Logger.getLogger("InfoLogging");
	public static void start(){
	
		Scanner sc = new Scanner(System.in);
		int option;
		do{
		Logger.info("1. Hashmap \n2. Hashset\n3. Treeset\n4. Exit");
		option =  sc.nextInt();
		switch(option){
			case 1:
			//hashmap
			Hashmap.starthashmap();
			break;
			case 2:
			//hashset
			Hashset.starthashset();
			break;
			case 3:
			//Treeset
			Treeset.starttreeset();
			break;	
			default:
			break;
			}
		}while(option!=4);
	
		
	}
}
