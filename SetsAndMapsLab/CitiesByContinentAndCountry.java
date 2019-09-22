package SetsAndMapsLab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!map.containsKey(continent)) {
                map.put(continent, new LinkedHashMap<>() {{
                    put(country, new ArrayList<>() {{
                        add(city);
                    }});
                }});
            }else {
                if (!map.get(continent).containsKey(country)) {
                    map.get(continent).put(country, new ArrayList<>(){{add(city);}});
                }else {
                    map.get(continent).get(country).add(city);
                }
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : map.entrySet()) {
            String continent = entry.getKey();
            LinkedHashMap<String, List<String>> countryByCity = entry.getValue();

            System.out.println(continent + ":");

            for (Map.Entry<String, List<String>> stringListEntry : countryByCity.entrySet()) {
                String country = stringListEntry.getKey();

                System.out.print(country + " -> ");

                List<String> cities = stringListEntry.getValue();

                for (int i = 0; i < cities.size(); i++) {
                    if (i == cities.size() - 1) {
                        System.out.println(cities.get(i));
                    }else {
                        System.out.print(cities.get(i) + ", ");
                    }


                }
            }

        }
    }
}