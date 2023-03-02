package collection;

import java.util.HashMap;
import java.util.logging.Logger;

public class Hashmap {
    public static void starthashmap()
    {
        Logger log=Logger.getLogger("com-api-jar");
        HashMap<Integer,String> map=new HashMap<>();
        Logger logger=Logger.getLogger("com-api-jar");
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"Abdur");
        map1.put(2,"Jesinth");
        map1.put(3,"Prabhu");
        map1.put(4,"Sai");
        map1.put(6,"Jeeva");
        map1.put(7,"hari");
        map1.put(8,"hari");
        System.out.println(map1);
        logger.info(map1.get(7));
        String res = "Cloned hashmap"+map1.clone();
        log.info(res);
        logger.info(""+map1.isEmpty());
        String replace = ""+map1.replace(4,"naresh");
        log.info(replace);
        log.info(map1.get(4));
        String res1 = ""+map1.getClass();
        log.info(res1);
        String remove = "Removed: "+map1.remove(2);
        log.info(remove);
        String res3 = "Fetch"+map1.get(2);
        logger.info(res3);
        map.clear();
        String res4 = "Size of the hashmap: "+map1.size();
        log.info(res4);
    }
}