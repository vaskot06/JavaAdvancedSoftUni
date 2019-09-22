package SetsAndMapsEXC;

import com.sun.source.tree.Tree;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, List<Integer>>> dragons = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] dragonInput = scanner.nextLine().split(" ");

            String type = dragonInput[0];
            String name = dragonInput[1];
            int damage = dragonInput[2].equals("null") ? 45 : Integer.parseInt(dragonInput[2]);
            int health = dragonInput[3].equals("null") ? 250 : Integer.parseInt(dragonInput[3]);
            int armor = dragonInput[4].equals("null") ? 10 : Integer.parseInt(dragonInput[4]);


            if (!dragons.containsKey(type)) {
                TreeMap<String, List<Integer>> nameByCount = new TreeMap<>();

                if (!nameByCount.containsKey(name)) {
                    List<Integer> stats = new ArrayList<>();
                    stats.add(damage);
                    stats.add(health);
                    stats.add(armor);
                    nameByCount.put(name, stats);
                } else {
                    List<Integer> stats = nameByCount.get(name);
                    stats.remove(damage);
                    stats.remove(health);
                    stats.remove(armor);
                    stats.add(damage);
                    stats.add(health);
                    stats.add(armor);
                    nameByCount.put(name, stats);
                }
                dragons.put(type, nameByCount);
            } else {
                TreeMap<String, List<Integer>> nameByCount = dragons.get(type);

                if (!nameByCount.containsKey(name)) {
                    List<Integer> stats = new ArrayList<>();
                    stats.add(damage);
                    stats.add(health);
                    stats.add(armor);
                    nameByCount.put(name, stats);
                } else {
                    List<Integer> stats = nameByCount.get(name);
                    stats.clear();
                    stats.add(damage);
                    stats.add(health);
                    stats.add(armor);
                    nameByCount.put(name, stats);
                }
                dragons.put(type, nameByCount);

            }


//            int damage = 0;
//            int health = 0;
//            int armor = 0;
//            if (dragonInput[2] == null) {
//                damage = 45;
//            } else {
//                damage = Integer.parseInt(dragonInput[2]);
//            }
//            if (dragonInput[3] == null) {
//                health = 250;
//            } else {
//                health = Integer.parseInt(dragonInput[3]);
//            }
//            if (dragonInput[4] == null) {
//                armor = 10;
//            } else {
//                armor = Integer.parseInt(dragonInput[4]);
//            }

        }

        for (Map.Entry<String, TreeMap<String, List<Integer>>> entry : dragons.entrySet()) {
            String type = entry.getKey();
            TreeMap<String, List<Integer>> nameByCount = entry.getValue();

            System.out.print(type + "::(");

            double damageAvg = 0;
            double healthAvg = 0;
            double armorAvg = 0;
            int counter = 0;

            for (Map.Entry<String, List<Integer>> listEntry : nameByCount.entrySet()) {
                String name = listEntry.getKey();
                List<Integer> stats = listEntry.getValue();

                for (int i = 0; i < 1; i++) {
                    damageAvg += stats.get(0);
                    healthAvg += stats.get(1);
                    armorAvg += stats.get(2);
                }
                counter++;

            }
            System.out.printf("%.2f/%.2f/%.2f)\n", damageAvg / counter, healthAvg / counter, armorAvg / counter);

            for (Map.Entry<String, List<Integer>> listEntry : nameByCount.entrySet()) {
                String name = listEntry.getKey();
                List<Integer> stats = listEntry.getValue();

                int damage = stats.get(0);
                int health = stats.get(1);
                int armor = stats.get(2);


                System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n", name, damage, health, armor);
            }

        }

    }
}
