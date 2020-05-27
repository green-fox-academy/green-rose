import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        try {
            Path fromPath = Paths.get("../../src/duplicated-chars.txt");
            List<String> lines = Files.readAllLines(fromPath);
            for (String line: lines) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i)==line.charAt(i+1)) {
                        System.out.print(line.charAt(i));
                        i++;
                    }
                }
                System.out.println();
            }


        } catch (Exception e) {

        }

    }
}
