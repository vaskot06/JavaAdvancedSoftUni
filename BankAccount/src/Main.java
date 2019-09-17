import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        HashMap<Integer, BankAccount> map = new HashMap<>();


        while (!"End".equals(line = bufferedReader.readLine())) {

            String[] tokens = line.split(" ");
            String action = tokens[0];

            if (action.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                map.put(bankAccount.getId(), bankAccount);
                System.out.println("Account ID" + bankAccount.getId() + " created");

            } else if (tokens.length == 3) {
                if (action.equals("Deposit")) {
                    int id = Integer.parseInt(tokens[1]);
                    if (map.containsKey(id)) {
                        double amount = Double.parseDouble(tokens[2]);
                        map.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    }else {
                        System.out.println("Account does not exist");
                    }
                } else if (action.equals("GetInterest")) {
                    int id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (map.containsKey(id)) {
                        System.out.printf("%.2f%n", map.get(id).getInterest(years));
                    }else {
                        System.out.println("Account does not exist");
                    }
                }
            } else if (action.equals("SetInterest")) {
                double newInterestRate = Double.parseDouble(tokens[1]);
                BankAccount.setInterestRate(newInterestRate);
            }
        }
    }
}



