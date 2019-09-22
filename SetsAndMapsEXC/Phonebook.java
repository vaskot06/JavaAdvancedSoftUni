package SetsAndMapsEXC;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();


        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];

            map.put(name,number);

            input = scanner.nextLine();
        }
        while (true) {
            String searchWord = scanner.nextLine();

            if (searchWord.equals("stop")) {
                return;
            }


                if (map.containsKey(searchWord)) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String name = entry.getKey();
                        String number = entry.getValue();
                        if (name.equals(searchWord)) {
                            System.out.printf("%s -> %s\n", name, number);
                        }
                        }
                }else {
                    System.out.printf("Contact %s does not exist.\n", searchWord);

                }

        }
    }
}
