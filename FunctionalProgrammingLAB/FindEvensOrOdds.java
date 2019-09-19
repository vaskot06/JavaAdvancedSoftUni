package FunctionalProgrammingLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = bufferedReader.readLine().split(" ");
        int lowerBound = Integer.parseInt(numbers[0]);
        int upperBound = Integer.parseInt(numbers[1]);
        String type = bufferedReader.readLine();

        int[] intNumbers = IntStream.range(lowerBound, upperBound + 1).toArray();

        if (type.equals("odd")) {
            Arrays.stream(intNumbers).filter(n-> n % 2 == 1).forEach(p-> System.out.print(p + " "));
        }else if (type.equals("even")){
            Arrays.stream(intNumbers).filter(n-> n % 2 == 0).forEach(p-> System.out.print(p + " "));
        }
    }
}
