import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        try {
            Path fromPath = Paths.get("../../src/reversed-lines.txt");
            List<String> lines = Files.readAllLines(fromPath);
            for (String line: lines) {

                    for (int i = line.length()-1; i >= 0; i--) {
                        System.out.print(line.charAt(i));
                    }
                    System.out.println();

            }


        } catch (Exception e) {

        }

    }
}
