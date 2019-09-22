package StreamsFilesAndDirectoriesLAB;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String outputPath= "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input2.txt";

        List<Character> toExclude = new ArrayList<>();
        Collections.addAll(toExclude, '.', ',', '!', '?');

        FileInputStream fileInputStream = null;
        OutputStream outputStream = null;

        try {
            fileInputStream = new FileInputStream(inputPath);
            outputStream = new FileOutputStream(outputPath);

            int oneByte = 0;

            while (oneByte >= 0) {
                oneByte = fileInputStream.read();
                if (!toExclude.contains((char)oneByte)) {
                    outputStream.write(oneByte);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            Objects.requireNonNull(fileInputStream).close();
        }

    }
}
