import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        try {
            Path fromPath = Paths.get("../../src/lottery.csv");
            List<String> lines = Files.readAllLines(fromPath);
            HashMap<String,Integer> countInts = new HashMap<>();
            String[] arraysInput;
            for (String line : lines) {
               arraysInput = line.split("Ft;");
                for (String numberStr:  arraysInput[arraysInput.length-1].split(";")) {
                    if (countInts.containsKey(numberStr)){
                        countInts.put(numberStr,countInts.get(numberStr)+1);
                    } else countInts.put(numberStr,1);
                }
            }

            for (int i = 0; i < 5; i++) {
                Integer highest = 0;
                String highestKey="";
                for (Map.Entry<String,Integer> pair: countInts.entrySet()) {
                    if (pair.getValue()>highest) {
                        highest = pair.getValue();
                        highestKey = pair.getKey();
                    }
                }
                System.out.println(highestKey);
                countInts.remove(highestKey);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
