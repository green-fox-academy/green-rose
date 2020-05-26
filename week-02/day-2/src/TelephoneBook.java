import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TelephoneBook {
    public TelephoneBook() {
    }

    public static void main(String[] args) {
        Map<String, String> phoneEntries = Stream.of(new Object[][] {
                { "William A. Lathan", "405-709-1865" },
                { "John K. Miller", "402-247-8568" },
                { "Hortensia E. Foster", "606-481-6467" },
                { "Amanda D. Newland", "319-243-5613" },
                { "Brooke P. Askew", "307-687-2982" },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (String) data[1]));
        System.out.println("John K. Miller's phone is "+ phoneEntries.get("John K. Miller"));
        for (String name: phoneEntries.keySet()){
            if (phoneEntries.get(name).contentEquals("307-687-2982"))
                System.out.println("307-687-2982 belongs to "+name);
            }
        System.out.println("Is there a record on Chris E. Myers? " +phoneEntries.containsKey("Chris E. Myers"));
    }
}
