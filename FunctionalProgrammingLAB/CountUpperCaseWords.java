package FunctionalProgrammingLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Predicate<String> asd = x -> x.charAt(0) >= 'A' && x.charAt(0) <= 'Z';


        List<String> words = Arrays.stream(bufferedReader.readLine().split(" ")).filter(asd).collect(Collectors.toList());
        System.out.println(words.size());
        words.forEach(System.out::println);
    }
}
