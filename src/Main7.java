import java.io.IOException;

public class Main7 {
    public static void main(String[] args) throws IOException {

        /*ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
        Process process = processBuilder.start();*/

       /* ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", "hola.txt");
        Process process = processBuilder.start();*/

        /*for (int i= 0; i < 6; i++){
            processBuilder.start();
        }
        */

        String[] listLinksChrome = new String[6];
        listLinksChrome[0] = "notepad.exe";
        listLinksChrome[1] = "notepad.exe";
        listLinksChrome[2] = "notepad.exe";
        listLinksChrome[3] = "notepad.exe";
        listLinksChrome[4] = "notepad.exe";
        listLinksChrome[5] = "notepad.exe";

        ProcessBuilder processBuilderChrome = new ProcessBuilder(listLinksChrome);
        for (int i = 0; i < listLinksChrome.length; i++) {
            processBuilderChrome.start();
        }

    }
}
