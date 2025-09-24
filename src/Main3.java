import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    /* #3 */
   /* public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("notepad");
    }*/

    /* #3.1 */
   /* public static void main(String[] args) throws IOException{
        openProgram("notepad");
    }*/

    /* #3.2 */
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("notepad.exe");
        Runtime.getRuntime().exec(new String[]{"C:\\\\Program Files\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe", "https://www.facebook.com"});
    }

    // Methods
    public static void openProgram(String inputName) throws IOException{
        // New Form
        /*ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", inputName);
        Process p = pb.start();*/
        Process process = Runtime.getRuntime().exec(inputName);
    }
}
