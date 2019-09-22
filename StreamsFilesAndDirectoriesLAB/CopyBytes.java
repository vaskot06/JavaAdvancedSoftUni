package StreamsFilesAndDirectoriesLAB;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String outputPath= "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input2.txt";

        try {
            try (FileInputStream fileInputStream = new FileInputStream(inputPath); OutputStream outputStream = new FileOutputStream(outputPath)) {

                int oneByte = 0;

                while (true) {
                    oneByte = fileInputStream.read();
                    if (oneByte == -1) {
                        break;
                    }
                    String digits = String.valueOf(oneByte);

                    if (oneByte != ' ' && oneByte != '\n') {
                        for (int i = 0; i < digits.length(); i++) {
                            outputStream.write(digits.charAt(i));
                        }
                    } else {
                        outputStream.write(oneByte);
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();

            }
        } catch (IOException e) {

        }
    }
}
