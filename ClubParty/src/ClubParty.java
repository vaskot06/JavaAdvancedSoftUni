import java.util.*;

public class ClubParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //21:58 - 23:10

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String[] line = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String s : line) {
            stack.push(s);
        }

        Map<String, List<Integer>> hallsByCount = new LinkedHashMap<>();
        Map<String, List<Integer>> dummyHallsByCount = new LinkedHashMap<>();

        for (int i = 0; i < line.length; i++) {

            dummyHallsByCount.clear();
            dummyHallsByCount.putAll(hallsByCount);

            String currentChar = stack.pop();
            if (!Character.isDigit(currentChar.charAt(0))) {
                if (!hallsByCount.containsKey(currentChar)) {
                    hallsByCount.put(currentChar, new ArrayList<>());
                }
            } else {
                if (!hallsByCount.isEmpty()) {
                    for (Map.Entry<String, List<Integer>> entry : dummyHallsByCount.entrySet()) {
                        String hall = entry.getKey();
                        List<Integer> people = entry.getValue();
                        int sum = 0;
                        for (Integer integer : people) {
                            sum += integer;
                        }
                        if (maxCapacity > sum && sum + Integer.parseInt(currentChar) <= maxCapacity) {
                            people.add(Integer.parseInt(currentChar));
                            hallsByCount.put(hall, people);
                            break;
                        } else {
                            System.out.print(hall + " -> ");
                            for (int j = 0; j < people.size(); j++) {

                                if (j == people.size() - 1) {
                                    System.out.println(people.get(j));
                                } else {
                                    System.out.print(people.get(j) + ", ");
                                }
                            }
                            hallsByCount.remove(hall, people);
                        }
                    }
                }
            }
        }
    }
}
