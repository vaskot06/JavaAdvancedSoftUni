package FunctionalPRogrammingEXC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nummbers = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        String command = bufferedReader.readLine();

        while (!command.equals("end")) {

            if (command.equals("add")) {
                nummbers = nummbers.stream().map(e->e + 1).collect(Collectors.toList());

            }else if (command.equals("multiply")) {
                nummbers = nummbers.stream().map(e->e * 2).collect(Collectors.toList());

            } else if (command.equals("subtract")) {
                nummbers = nummbers.stream().map(e->e - 1).collect(Collectors.toList());

            }else if (command.equals("print")) {
                nummbers.forEach(e-> System.out.print(e + " "));

            }

            command = bufferedReader.readLine();
        }
    }
}
