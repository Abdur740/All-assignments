package collection;

import java.util.TreeSet;
import java.util.logging.Logger;

public class Treeset {
protected Treeset(){}
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void starttreeset() {
            TreeSet<String> name = new TreeSet<String>();
            name.add("Ronaldo");
            name.add("Messi");
            name.add("Neymar");
            name.add("Debruyne");
            name.add("Kobe bryant");
            name.add("Shaq");
            name.add("Mbappe");
            name.add("Halland");
            name.add("Gavi");
            name.add("Gareth bale");
            String os="Original Set:" + name;
            log.info(os);
            String fs="First Name: "+ name.first();
            log.info(fs);
            String ls="Last Name: "+ name.last();
            log.info(ls);
            TreeSet<String> newplyset = (TreeSet<String>) name.subSet("Messi", "Ronaldo");
            String ss="Sub Set: "+ newplyset;
            log.info(ss);
    }
}
