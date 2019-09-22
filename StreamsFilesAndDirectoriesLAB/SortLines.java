package StreamsFilesAndDirectoriesLAB;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String outputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input2.txt";

        Path path = Paths.get(inputPath);


        try (BufferedReader bufferedReader = Files.newBufferedReader(path);
             PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath))) {

            List<String> list = Files.readAllLines(path);
            Collections.sort(list);

            for (String line : list) {
                printWriter.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
