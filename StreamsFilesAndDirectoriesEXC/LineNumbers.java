package StreamsFilesAndDirectoriesEXC;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String outputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input2.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(outputPath))) {

            String line = bufferedReader.readLine();
            int counter = 0;

            while (line != null) {
                counter++;

                bufferedWriter.write(counter + ". " + line);
                bufferedWriter.newLine();

                line = bufferedReader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
