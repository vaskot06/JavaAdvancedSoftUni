package StacksAndQueuesEXC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) throws IOException {
       // Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(bufferedReader.readLine());



        long[] numbers = Arrays.stream(bufferedReader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        ArrayDeque<Long> numbersStack = new ArrayDeque<>();
        ArrayDeque<Long> newNumbersStack = new ArrayDeque<>();
        ArrayDeque<Long> numbersStackToCheck = new ArrayDeque<>();
        long firstNumberInStack = 0;
        boolean toPrint = false;

        for (int i = 0; i < numbers.length; i++) {

            firstNumberInStack = numbers[0];
            numbersStack.offer(numbers[i]);
        }


        long counter = 0;


        while (numbersStack.size() > 0) {
            counter++;
            newNumbersStack.offer(firstNumberInStack);
            for (int i = 0; i < n; i++) {


                if (numbersStack.isEmpty()) {
                    break;
                }

                long firstNumber = numbersStack.poll();

                if (numbersStack.isEmpty()) {
                    break;
                }
                long secondNumber = numbersStack.peek();


                if (firstNumber >= secondNumber) {
                    newNumbersStack.offer(secondNumber);
                }
            }

            numbersStack = newNumbersStack.clone();
            newNumbersStack.clear();
            n = numbersStack.size();
            numbersStackToCheck = numbersStack.clone();

            for (int i = 0; i < n; i++) {

                if (numbersStackToCheck.isEmpty()) {
                    break;
                }

                long lastNumber = numbersStackToCheck.peek();
                long numberOne = numbersStackToCheck.poll();

                if (numbersStackToCheck.isEmpty()) {
                    break;
                }
                long numberTwo = numbersStackToCheck.peek();

                if (numberOne < numberTwo) {
                    toPrint = false;
                    break;
                }else {
                    toPrint = true;
                }
            }
            if (numbersStack.isEmpty() || numbersStack.size() == 1) {
                System.out.println(counter);
                return;
            }
            if (toPrint) {
                System.out.println(counter);
                return;
            }
        }

    }
}
