package StreamsFilesAndDirectoriesEXC;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {

        String inputWords = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String textToCheck = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String outputPath = "C:\\Users\\Vasil\\Desktop\\SoftUni\\Java advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories_EXC-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input2.txt";
        Map<String, Integer> wordByCount = new HashMap<>();


        try (BufferedReader bufferedReaderWords = new BufferedReader(new FileReader(inputWords));
             BufferedReader bufferedReaderText = new BufferedReader(new FileReader(textToCheck))) {

            String line = bufferedReaderWords.readLine();
            String[] wordArray = line.split(" ");

            String textLine = bufferedReaderText.readLine();
            String[] textArray = textLine.split(" ");


            for (String wordToCheck : wordArray) {
                wordByCount.putIfAbsent(wordToCheck, 0);
                int counter = 0;
                for (String s : textArray) {
                    if (wordToCheck.equals(s)) {
                        counter++;
                        wordByCount.put(wordToCheck, wordByCount.get(wordToCheck) + counter);
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        LinkedHashMap<String, Integer> toPrint = wordByCount.entrySet()
                .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        try (BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(outputPath))) {

            for (Map.Entry<String, Integer> entry : toPrint.entrySet()) {
                bufferedWriter.write(entry.getKey() + " - " + entry.getValue());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
