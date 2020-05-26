import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String,String> isbns = new HashMap<>();
        isbns.put("978-1-60309-452-8","A Letter to Jo");
        isbns.put("978-1-60309-459-7","Lupus");
        isbns.put("978-1-60309-444-3","Red Panda and Moon Bear");
        isbns.put("978-1-60309-461-0","The Lab");
        for (String isbn: isbns.keySet()){
            System.out.println(isbns.get(isbn)+ " (" +isbn+")");
        }
        isbns.remove("978-1-60309-444-3");
        isbns.values().remove("The Lab");
        isbns.put("978-1-60309-450-4","They Called Us Enemy");
        isbns.put("978-1-60309-453-5","Why Did We Trust Him?");
        System.out.println(isbns.containsKey( "478-0-61159-424-8"));
        System.out.println(isbns.get("978-1-60309-453-5"));

    }
}
