import java.io.IOException;

public class Main6 {
    public static void main(String[] args) throws IOException, IllegalArgumentException {
        //  pid(), info() and exitValue()

        Process process = Runtime.getRuntime().exec("notepad.exe");
        long savePid = process.pid();
        String saveInfo = process.info().toString();

        //You need destroy the process
        process.destroy();
        int saveCode = process.exitValue();

        System.out.println("PID: " + savePid);
        System.out.println("Info: " + saveInfo);
        System.out.println("Code: " + saveCode);
    }
}
