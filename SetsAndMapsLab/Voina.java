package SetsAndMapsLab;

import javax.security.sasl.SaslClient;
import java.util.*;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        for (int i = 0; i < 50; i++) {
            Integer first = firstPlayerCards.iterator().next();
            Integer second = secondPlayerCards.iterator().next();

            firstPlayerCards.remove(first);
            secondPlayerCards.remove(second);

            if (first > second) {
                firstPlayerCards.add(first);
                firstPlayerCards.add(second);
            } else if (second>first) {
                secondPlayerCards.add(first);
                secondPlayerCards.add(second);
            }else {
                firstPlayerCards.add(first);
                secondPlayerCards.add(second);
            }
        }
        if (firstPlayerCards.size() > secondPlayerCards.size()) {
            System.out.println("First player win!");
            return;
        } else if (secondPlayerCards.size()>firstPlayerCards.size()){
            System.out.println("Second player win!");
            return;
        }

        System.out.println("Draw");
    }
}
