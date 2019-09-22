package SetsAndMapsLab;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> shopByProduct = new TreeMap<>();
        Map<String, Double> productByPrice = new LinkedHashMap<>();


        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            List<String> prodcuts = new ArrayList<>();

            if (!shopByProduct.containsKey(shop)) {
                shopByProduct.put(shop, prodcuts);
                prodcuts.add(product);
            } else if (shopByProduct.containsKey(shop)) {
                shopByProduct.get(shop).add(product);
            }


                productByPrice.put(product, price);



            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : shopByProduct.entrySet()) {
            String shop = entry.getKey();
            List<String> products = entry.getValue();
            double priceToPrint = 0;
            System.out.println(shop + "->");

            for (Map.Entry<String, Double> price : productByPrice.entrySet()) {
                String product = price.getKey();
                priceToPrint = price.getValue();
                for (String product1 : products) {
                    if (product1.equals(product)) {
                        System.out.printf("Product: %s, Price: %.1f%n", product, priceToPrint);
                    }
                }

            }

        }

    }
}
