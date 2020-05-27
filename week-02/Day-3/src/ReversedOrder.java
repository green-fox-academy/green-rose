import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        try {
            Path fromPath = Paths.get("../../src/reversed-order.txt");
            List<String> lines = Files.readAllLines(fromPath);
            List<String> reversed = new ArrayList<>();
            for (String line: lines) {
                reversed.add(0,line);
            }
            for (String line: reversed) {
                System.out.println(line);
            }

        } catch (Exception e) {

        }

    }
}

