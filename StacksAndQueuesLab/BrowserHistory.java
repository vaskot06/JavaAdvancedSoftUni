package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();
        ArrayDeque<String> urls = new ArrayDeque<>();

        while (!url.equals("Home")) {

            if (url.equals("back")) {
                if (urls.size() <= 1) {
                    System.out.println("no previous URLs");
                }else {
                    urls.pop();
                    System.out.println(urls.peek());
                }
            }else {
                System.out.println(url);
                urls.push(url);
            }

            url = scanner.nextLine();
        }
    }
}
