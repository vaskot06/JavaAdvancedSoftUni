package StreamsFilesAndDirectoriesLAB;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String outputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input2.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath))) {

            int counter = 1;

            String s = bufferedReader.readLine();


            while (s != null) {
                if (counter % 3 == 0) {
                    printWriter.println(s);
                }
                s = bufferedReader.readLine();
                counter++;
            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
