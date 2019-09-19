package FunctionalProgrammingLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        Map<String, Integer> nameByAge = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] ageName = bufferedReader.readLine().split(", ");
            nameByAge.put(ageName[0], Integer.parseInt(ageName[1]));
        }

        String type = bufferedReader.readLine();
        int ageLine = Integer.parseInt(bufferedReader.readLine());
        String whatToPrint = bufferedReader.readLine();

        if (type.equals("older")) {
            nameByAge = nameByAge.entrySet().stream().filter(p -> p.getValue() >= ageLine).collect(Collectors.toMap(
                    Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            if (whatToPrint.equals("name")) {
                namePrint(nameByAge);
            } else if (whatToPrint.equals("age")) {
                agePrint(nameByAge);
            }else {
                toPrint(nameByAge);
            }
        } else if ("younger".equals(type)) {
            nameByAge = nameByAge.entrySet().stream().filter(p-> p.getValue() <= ageLine)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));
            if (whatToPrint.equals("name")) {
                namePrint(nameByAge);
            } else if (whatToPrint.equals("age")) {
                agePrint(nameByAge);
            }else {
                toPrint(nameByAge);
            }
        }
    }

    private static void toPrint(Map<String, Integer> both) {
        both.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    private static void agePrint(Map<String, Integer> byAge) {
        byAge.forEach((key, value) -> System.out.println(value));
    }

    private static void namePrint(Map<String, Integer> byName) {
        byName.forEach((key, value) -> System.out.println(key));
    }

}
