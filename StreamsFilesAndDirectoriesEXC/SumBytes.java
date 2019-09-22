package StreamsFilesAndDirectoriesEXC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {

        String path = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        int sum = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            while (true) {
                String line = bufferedReader.readLine();

                if (line == null) {
                    break;
                }

                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
