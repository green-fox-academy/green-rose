import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;

public class EnumTest {

    public enum Status{
        visible(1,"You can see it. It is visible."),
        invisible(0, "You cant see, but not trashed so far."),
        trashed(-1,"It is deleted.");
        private final int value;
        private final String desc;

        private Status(int value, String desc){
            this.value = value;
            this.desc = desc;
        }
        public static HashMap<Integer,String> byStatus(String s ){
            HashMap<Integer,String> results = new HashMap<>();
            for (Status val: Status.values()) {
                if (val.name().indexOf(s)>-1) results.put(val.value,val.name());
            }
            return results;
        }
        public static HashMap<Integer,String> byDesc(String s ){
            HashMap<Integer,String> results = new HashMap<>();
            for (Status val: Status.values()) {
                if (val.desc.indexOf(s)>-1) results.put(val.value,val.desc);
            }
            return results;
        }
        public static HashMap<Integer,String> byValue(Integer i ){
            HashMap<Integer,String> results = new HashMap<>();
            for (Status val: Status.values()) {
                if (val.value ==i) results.put(val.value,val.name());
            }
            return results;
        }
    }
    public static void main(String[] args) {

        Integer i = -1;
        System.out.printf(Status.byValue(i).toString());
        String s ="visible";
        System.out.printf(Status.byStatus(s).toString());
        s="It is";
        System.out.printf(Status.byDesc(s).toString());
    }
}
