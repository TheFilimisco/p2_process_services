package exercise10_2;

import java.io.*;
import java.util.Scanner;

public class Reader_2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting Reader...");
        ProcessBuilder pb = new ProcessBuilder("C:\\Users\\nyste\\.jdks\\corretto-21.0.6\\bin\\java.exe", "-classpath","C:\\Users\\nyste\\OneDrive\\Escritorio\\CFGSDAM2\\0490\\p2_process_services\\out\\production\\p2_process_services", "exercise10_2.Writer_2");

        Process process = pb.start();


        System.out.print("Reading lines from file, put how lines you want:");
        int amountLines = sc.nextInt();

        try (OutputStream os = process.getOutputStream();
             PrintWriter pw = new PrintWriter(os,true)) {
            pw.println(amountLines);
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Writer said: " + line);
            }
        }
        process.waitFor();
    }
}