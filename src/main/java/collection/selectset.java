package collection;
import java.util.Scanner;


public class selectset{
	public static void start(){
		Scanner sc = new Scanner(System.in);
		int option;
		do{
		System.out.println("1. Hashmap \n2. Hashset\n3. Treeset\n4. Exit");
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
			}
		}while(option!=4);
	
		
	}
}