import javax.naming.ldap.SortResponseControl;
import java.util.*;

public class ListIntroduction1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String name: names
             ) {
            System.out.println(name);
        }
        names.remove(1);
        for (int i = names.size()-1; i >=0; i++) {
            System.out.println(names.get(i));
        }

        names.clear();
        System.out.println(names.size());
    }
}
