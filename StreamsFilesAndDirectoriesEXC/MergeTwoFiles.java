package StreamsFilesAndDirectoriesEXC;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) {


        String inputOne = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String inputTwo = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String outputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input2.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputOne));
             BufferedReader bufferedReaderTwo = new BufferedReader(new FileReader(inputTwo));
             BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(outputPath))) {


            String firstLine = bufferedReader.readLine();

            while (firstLine != null) {

                bufferedWriter.write(firstLine);
                bufferedWriter.newLine();

                firstLine = bufferedReader.readLine();
            }


            String secondLine = bufferedReaderTwo.readLine();

            while (secondLine != null) {

                bufferedWriter.write(secondLine);
                bufferedWriter.newLine();

                secondLine= bufferedReaderTwo.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
