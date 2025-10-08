package exercise12;

import java.io.*;

public class Manager {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Starting manager");


        ProcessBuilder pbAdder = new ProcessBuilder("C:\\Users\\nyste\\.jdks\\corretto-21.0.6\\bin\\java.exe", "-classpath", "C:\\Users\\nyste\\OneDrive\\Escritorio\\CFGSDAM2\\0490\\p2_process_services\\out\\production\\p2_process_services", "exercise12.Adder");


        Process processAdder = pbAdder.start();

        try ( BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(processAdder.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(processAdder.getInputStream()));) {

            for (int i = 0; i < 5; i++) {
                ProcessBuilder pbNumber = new ProcessBuilder("C:\\Users\\nyste\\.jdks\\corretto-21.0.6\\bin\\java.exe", "-classpath", "C:\\Users\\nyste\\OneDrive\\Escritorio\\CFGSDAM2\\0490\\p2_process_services\\out\\production\\p2_process_services", "exercise12.Number");

                Process numberProcess =  pbNumber.start();

                try (BufferedReader brNumber = new BufferedReader(new InputStreamReader(numberProcess.getInputStream()));) {
                    String line = brNumber.readLine();
                    if (line != null) {
                        System.out.println("Manager received number: " + line);
                        bw.write(line);
                        bw.newLine();
                        bw.flush();
                    }
                }
                numberProcess.waitFor();
            }
            bw.close();

            String out;
            while ((out = br.readLine()) != null) {
                System.out.println("Adder sent: " + out);
            }
        }
        processAdder.waitFor();
        System.out.println("Manager finished.");

    }
}
