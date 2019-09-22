package StreamsFilesAndDirectoriesLAB;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String outputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input2.txt";

        FileInputStream inputStream;
        OutputStream outputStream;
        FileWriter inputStream2;

        try {
            inputStream = new FileInputStream(inputPath);

            outputStream = new FileOutputStream(outputPath);
            Scanner scanner = new Scanner(inputStream);
            int oneByte = 0;
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    oneByte = scanner.nextInt();
                    String digits = String.valueOf(oneByte);

                    for (int i = 0; i < digits.length(); i++) {
                        outputStream.write(digits.charAt(i));
                    }
                    outputStream.write('\n');
                }

                scanner.next();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
