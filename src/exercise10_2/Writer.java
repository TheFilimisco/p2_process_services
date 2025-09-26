package exercise10_2;

import java.io.OutputStream;
import java.util.Scanner;

public class Writer {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Writer...");

        Scanner input = new Scanner(System.in);

        if (input.hasNextInt()) {
                int numLines = input.nextInt();
            System.out.println("Number of lines: " + numLines);

            for (int i = 1; i <= numLines; i++) {
                System.out.println("Writing line " + i);
            }
        } else {
            System.out.println("Number of lines is empty");
        }

    }
}
