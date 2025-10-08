package exercise12;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        System.out.println("Starting Adder");

        Scanner sc = new Scanner(System.in);
        int  accum = 0;

        System.out.println("Enter number to add or exit to finish:");

        while (true) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                accum += num;
                System.out.println("Current accum: " + accum);
            } else{
                System.out.println("Final sum:" + accum);
                break;
            }
        }
        sc.close();
    }
}
