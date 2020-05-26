import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("../../src/ZZeenn.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line: lines
                 ) {
                System.out.println(line);
            }
            System.out.println(lines.get(0));
        } catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
    }
}