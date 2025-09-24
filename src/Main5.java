import java.io.IOException;

public class Main5 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Finish the process, but not finished the program has launched
        Process process = Runtime.getRuntime().exec("notepad.exe");
        Thread.sleep(3000);
        process.destroy();
    }
}
