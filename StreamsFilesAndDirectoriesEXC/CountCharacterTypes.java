package StreamsFilesAndDirectoriesEXC;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input2.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(outputPath))) {

            String line = bufferedReader.readLine();
            int vowelC = 0;
            int consonantC = 0;
            int punctC = 0;

            while (line != null) {

                for (int i = 0; i < line.length(); i++) {

                    char ch = line.charAt(i);

                    if (ch == 'a' || ch == 'u' || ch == 'o' || ch == 'i' || ch == 'e') {
                        vowelC++;
                    } else if (ch == '!' || ch == ',' || ch == '.' || ch == '?') {
                        punctC++;
                    } else if (ch != ' ') {
                        consonantC++;
                    }

                }

                line = bufferedReader.readLine();
            }

            System.out.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowelC, consonantC, punctC);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
