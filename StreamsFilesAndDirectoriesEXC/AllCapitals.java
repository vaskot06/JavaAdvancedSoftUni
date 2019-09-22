package StreamsFilesAndDirectoriesEXC;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input2.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(outputPath))) {

            while (true) {
            String line = bufferedReader.readLine();

                if (line == null) {
                    break;
                }
                bufferedWriter.append(line.toUpperCase());
                bufferedWriter.newLine();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
