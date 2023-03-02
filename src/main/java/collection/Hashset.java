package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Logger;

public class Hashset {
protected Hashset(){}
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void starthashset() {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        log.info("Enter Set Size:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            log.info("Enter value:");
            hs.add(sc.nextInt());
        }
        String set="Hashset"+hs;
        log.info(set);
        log.info("Checking elements is present in set ");
        log.info("Enter value to check:");
        int v1= sc.nextInt();
        if (hs.contains(v1))
        {
            log.info("result found");
        }
        else
        {
            log.info("Not Found");
        }
        String sz="Size:"+hs.size();
        log.info(sz);
        log.info("enter value to remove");
        int v2=sc.nextInt();
        hs.remove(v2);
        String rem="After removing "+hs;
        log.info(rem);
        hs.clear();
        String clr="After cleraing "+hs;
        log.info(clr);
    }
}
