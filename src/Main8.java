import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class Main8 {
    public static void main(String[] args) throws IOException {

        File workingDir = new File("C:\\Users\\nyste\\OneDrive\\Escritorio");
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        Process process = pb.start();
        System.out.println(pb.directory(workingDir));


/*        String path = workingDir.getAbsolutePath();
        System.out.println("Path: " + path);*/

    }
}
