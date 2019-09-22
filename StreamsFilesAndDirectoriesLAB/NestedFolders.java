package StreamsFilesAndDirectoriesLAB;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {

        String path = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams";
        File root = new File(path);


        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        int counter = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    dirs.offer(nestedFile);
                }
            }
            counter++;
            System.out.println(current.getName());

        }
        System.out.println(counter + " folders");
    }
}
