import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Main9 {
    public static void main(String[] args) throws IOException {

        File workingDir = new File("C:\\Users\\nyste\\OneDrive\\Escritorio");
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        Process process = pb.start();
        pb.directory(workingDir);
        Map<String, String> env = pb.environment();
        for (String key : env.keySet()) {
            System.out.println(key + ": " + env.get(key));
        }

/*        String path = workingDir.getAbsolutePath();
        System.out.println("Path: " + path);*/

    }
}
