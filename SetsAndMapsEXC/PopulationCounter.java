package SetsAndMapsEXC;

import java.util.*;
import java.util.stream.Collectors;

public class PopulationCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, LinkedHashMap<String, Integer>> countryData = new LinkedHashMap<>();


        while (!input.equals("report")) {
            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            int population = Integer.parseInt(tokens[2]);

            if (!countryData.containsKey(country)) {
                LinkedHashMap<String, Integer> cityData = new LinkedHashMap<>();
                cityData.putIfAbsent(city, population);
                countryData.put(country, cityData);
            } else {
                LinkedHashMap<String, Integer> cityData = countryData.get(country);
                cityData.putIfAbsent(city, population);
                countryData.put(country, cityData);
            }

            input = scanner.nextLine();
        }

        HashMap<String, Integer> countryByPop = new HashMap<>();

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : countryData.entrySet()) {
            String country = entry.getKey();
            LinkedHashMap<String, Integer> cityData = entry.getValue();
            LinkedHashMap<String, Integer> cityDataSorted = cityData.entrySet().stream()
                    .sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            int totalPop = 0;
            for (Map.Entry<String, Integer> cityEntry : cityData.entrySet()) {
                String city = cityEntry.getKey();
                int population = cityEntry.getValue();
                totalPop += population;
            }
            countryByPop.putIfAbsent(country, totalPop);
        }

        LinkedHashMap<String, Integer> countryByPopSorted = countryByPop.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<String, Integer> entry : countryByPopSorted.entrySet()) {
            System.out.printf("%s (total population: %s)\n", entry.getKey(), entry.getValue());

//            for (Map.Entry<String, LinkedHashMap<String, Integer>> entryCountry : countryData.entrySet()) {
//                LinkedHashMap<String, Integer> cityData = entryCountry.getValue();
//                LinkedHashMap<String, Integer> cityDataSorted = cityData.entrySet().stream()
//                        .sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toMap(
//                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//
//                for (Map.Entry<String, Integer> cityEntry : cityDataSorted.entrySet()) {
//                    String city = cityEntry.getKey();
//                    int population = cityEntry.getValue();
//
//                    if (entryCountry.getKey().equals(entry.getKey())) {
//                        System.out.printf("=>%s: %d\n", city, population);
//                    }
//                }
//
//            }

        }
    }
}
