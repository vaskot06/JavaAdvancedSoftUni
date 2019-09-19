package FunctionalPRogrammingEXC;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());


        Function<List<Integer>, Integer> function = e -> e.stream().mapToInt(Integer::intValue).min().getAsInt();


        int a = function.apply(numbers);

        System.out.println(numbers.lastIndexOf(a));


    }
}
