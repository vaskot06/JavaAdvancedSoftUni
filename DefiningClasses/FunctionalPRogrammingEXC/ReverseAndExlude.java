package FunctionalPRogrammingEXC;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExlude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> nummbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        Collections.reverse(nummbers);
        int element = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> divisible = e -> e % element != 0;

        nummbers.stream().filter(divisible).forEach(e-> System.out.print(e + " "));


    }
}
