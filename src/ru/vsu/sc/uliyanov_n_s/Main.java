package ru.vsu.sc.uliyanov_n_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printFirstPhrase();

        int n = readNumber();
        int sum = findSumOfEvenNumbersOfFibonacci(n - 1);

        printResult(n, sum);
    }

    static int findSumOfEvenNumbersOfFibonacci(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 0; i <= n;) {
            i = a + b;
            if (i % 2 == 0)
                sum += i;
            a = b;
            b = i;
        }

        return sum;
    }

    static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int n;

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Invalid value! Number can't be negative. Try again.");
                return readNumber();
            }

        } else {
            System.out.println("Invalid value! You need to enter a INTEGER NUMBER. Try again.");
            return readNumber();
        }

        return n;
    }

    static void printFirstPhrase(){
        System.out.print("Enter a number:");
    }

    static void printResult(int n, int sum){
        System.out.printf("The sum of all even Fibonacci numbers less than or equal to %d is equal to: %d", n, sum);
    }
}
