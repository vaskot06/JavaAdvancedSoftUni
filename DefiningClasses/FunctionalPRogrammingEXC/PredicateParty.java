package FunctionalPRogrammingEXC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> peopleComming = Arrays.stream(bufferedReader.readLine().split(" ")).collect(Collectors.toList());
        List<String> toAdd = new ArrayList<>();


        String line = bufferedReader.readLine();

        while (!"Party!".equals(line)) {
            String[] tokens = line.split(" ");

            if (tokens[0].equals("Double")) {
                if (tokens[1].equals("Length")) {
                    int lenght = Integer.parseInt(tokens[2]);
                    toAddLength(toAdd, peopleComming, lenght);
                }else if (tokens[1].equals("StartsWith")) {
                    String sequence = tokens[2];
                    toAdd = peopleComming.stream().filter(e->e.startsWith(sequence)).collect(Collectors.toList());
                    peopleComming.addAll(toAdd);
                    toAdd.clear();
                }else if (tokens[1].equals("EndsWith")) {
                    String sequence = tokens[2];
                    toAdd = peopleComming.stream().filter(e->e.endsWith(sequence)).collect(Collectors.toList());
                    peopleComming.addAll(toAdd);
                    toAdd.clear();
                }
            } else if (tokens[0].equals("Remove")) {
                if (tokens[1].equals("Length")) {
                    int lenght = Integer.parseInt(tokens[2]);
                    toAdd = peopleComming.stream().filter(e->e.length() == lenght).collect(Collectors.toList());
                    toRemove(toAdd, peopleComming);

                } else if (tokens[1].equals("StartsWith")) {
                    String sequence = tokens[2];
                    toAdd = peopleComming.stream().filter(e->e.startsWith(sequence)).collect(Collectors.toList());
                    toRemove(toAdd,peopleComming);
                }else if (tokens[1].equals("EndsWith")) {
                    String sequence = tokens[2];
                    toAdd = peopleComming.stream().filter(e->e.endsWith(sequence)).collect(Collectors.toList());
                    toRemove(toAdd,peopleComming);
                }


            }
            line = bufferedReader.readLine();
        }

        if (peopleComming.isEmpty()) {
            System.out.println("Nobody is going to the party!");
            return;
        }

        Collections.sort(peopleComming);

        for (int i = 0; i < peopleComming.size(); i++) {
            if (i == peopleComming.size() - 1) {
                System.out.println(peopleComming.get(i) + " are going to the party!");
            }else {
                System.out.print(peopleComming.get(i) + ", ");
            }
        }

    }

    private static void toRemove(List<String> toAdd, List<String> peopleComming) {
        peopleComming.removeAll(toAdd);
        toAdd.clear();
    }

    private static void toAddLength(List<String> toAdd, List<String> peopleComming, int length) {
        toAdd = peopleComming.stream().filter(e -> e.length() == length).collect(Collectors.toList());
        peopleComming.addAll(toAdd);
        toAdd.clear();
    }
}