package FunctionalPRogrammingEXC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CustomMinFuncrtion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println(Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt).min().getAsInt());


    }
}
