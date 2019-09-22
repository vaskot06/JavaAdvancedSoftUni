package SetsAndMapsEXC;
import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean isObtained = false;
        HashMap<String, Integer> keyReagents = new HashMap<>();
        keyReagents.put("motes", 0);
        keyReagents.put("fragments", 0);
        keyReagents.put("shards", 0);

        TreeMap<String, Integer> junkItems = new TreeMap<>();

        while (!isObtained) {

            String[] line = scanner.nextLine().split("\\s+");
            for (int i = 0; i < line.length - 1; i += 2) {
                if (isObtained == true) {
                    break;
                }
                int quantity = Integer.parseInt(line[i]);
                String item = line[i + 1].toLowerCase();

                if (item.equals("motes")) {
                    keyReagents.put(item, keyReagents.get(item) + quantity);
                    for (Map.Entry<String, Integer> motes : keyReagents.entrySet()) {
                        String reagent = motes.getKey();
                        int quant = motes.getValue();
                        if (quant >= 250) {
                            keyReagents.put(item, keyReagents.get(item) - 250);
                            System.out.println("Dragonwrath obtained!");
                            isObtained = true;
                            break;
                        }
                    }
                } else if (item.equals("fragments")) {
                    keyReagents.put(item, keyReagents.get(item) + quantity);
                    for (Map.Entry<String, Integer> fragments : keyReagents.entrySet()) {
                        String reagent = fragments.getKey();
                        int quant = fragments.getValue();
                        if (quant >= 250) {
                            keyReagents.put(item, keyReagents.get(item) - 250);
                            System.out.println("Valanyr obtained!");
                            isObtained = true;
                            break;
                        }
                    }
                } else if (item.equals("shards")) {
                    keyReagents.put(item, keyReagents.get(item) + quantity);
                    for (Map.Entry<String, Integer> shards : keyReagents.entrySet()) {
                        String reagent = shards.getKey();
                        int quant = shards.getValue();
                        if (quant >= 250) {
                            keyReagents.put(item, keyReagents.get(item) - 250);
                            System.out.println("Shadowmourne obtained!");
                            isObtained = true;
                            break;
                        }
                    }
                }else {

                    if (!junkItems.containsKey(item)){
                        junkItems.put(item, 0);
                    }
                    junkItems.put(item, junkItems.get(item) + quantity);
                }
            }
        }

//        Map<String, Integer> sortedReagents = keyReagents.entrySet().stream()
        //              .sorted(Map.Entry.comparingByValue())
        //            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e2, e1) -> e2, LinkedHashMap::new));

        Map<String, Integer> sortedReagents = keyReagents.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        for (Map.Entry<String, Integer> reagents : sortedReagents.entrySet()) {
            String reagent = reagents.getKey();
            int quant = reagents.getValue();

            System.out.println(reagent + ": " + quant);
        }
        for (Map.Entry<String, Integer> junk : junkItems.entrySet()){
            String reagent = junk.getKey();
            int quant = junk.getValue();

            System.out.println(reagent + ": " + quant);
        }
    }
}
