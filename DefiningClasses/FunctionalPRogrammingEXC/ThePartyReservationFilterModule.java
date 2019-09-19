package FunctionalPRogrammingEXC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> guestList = Arrays.stream(bufferedReader.readLine().split(" ")).collect(Collectors.toList());
        List<String> backupGuestList = new ArrayList<>();
        backupGuestList.addAll(guestList);
        LinkedHashSet<String> checkGuestList = new LinkedHashSet<>();
        checkGuestList.addAll(guestList);

        String input = bufferedReader.readLine();



        while (!"Print".equals(input)) {
            String[] tokens = input.split(";");
            String command = tokens[1];

            if (tokens[0].equals("Add filter")) {
                if (command.equals("Starts with")) {
                    String sequence = tokens[2];
                    guestList = guestList.stream().filter(e->!e.startsWith(sequence)).collect(Collectors.toList());
                }else if (command.equals("Ends with")) {
                    String sequence = tokens[2];
                    guestList = guestList.stream().filter(e->!e.endsWith(sequence)).collect(Collectors.toList());
                }else if (command.equals("Contains")) {
                    String sequence = tokens[2];
                    guestList = guestList.stream().filter(e->!e.contains(sequence)).collect(Collectors.toList());
                }else if (command.equals("Length")) {
                    int sequence = Integer.parseInt(tokens[2]);
                    guestList = guestList.stream().filter(e->e.length()!=(sequence)).collect(Collectors.toList());
                }
            }else if (tokens[0].equals("Remove filter")) {
                if (command.equals("Starts with")) {
                    String sequence = tokens[2];
                    backupGuestList = backupGuestList.stream().filter(e->e.startsWith(sequence)).collect(Collectors.toList());
                    guestList.addAll(backupGuestList);
                    backupGuestList.clear();
                    backupGuestList.addAll(checkGuestList);
                }else if (command.equals("Ends with")) {
                    String sequence = tokens[2];
                    backupGuestList = backupGuestList.stream().filter(e->e.endsWith(sequence)).collect(Collectors.toList());
                    guestList.addAll(backupGuestList);
                    backupGuestList.clear();
                    backupGuestList.addAll(checkGuestList);
                }else if (command.equals("Contains")) {
                    String sequence = tokens[2];
                    backupGuestList = backupGuestList.stream().filter(e->e.contains(sequence)).collect(Collectors.toList());
                    guestList.addAll(backupGuestList);
                    backupGuestList.clear();
                    backupGuestList.addAll(checkGuestList);
                }else if (command.equals("Length")) {
                    int sequence = Integer.parseInt(tokens[2]);
                    backupGuestList = backupGuestList.stream().filter(e->e.length()==sequence).collect(Collectors.toList());
                    guestList.addAll(backupGuestList);
                    backupGuestList.clear();
                    backupGuestList.addAll(checkGuestList);
                }
            }


            input = bufferedReader.readLine();
        }
        List<String> toPrint = new ArrayList<>();

        for (String guest : checkGuestList) {
            if (guestList.contains(guest)) {
                toPrint.add(guest);
            }
        }
        toPrint.forEach(e-> System.out.print(e + " "));
    }
}
