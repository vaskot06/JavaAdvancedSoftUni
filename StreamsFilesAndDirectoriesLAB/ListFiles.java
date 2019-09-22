package StreamsFilesAndDirectoriesLAB;

import java.io.*;
import java.util.Arrays;

public class ListFiles {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams");

        File[] files1 = file.listFiles();

        for (File file1 : files1) {
            if (!file1.isDirectory())
            System.out.printf("%s: [%d]%n", file1.getName(), file1.length());
        }

    }
}
