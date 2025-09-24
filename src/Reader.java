import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws InterruptedException, IOException {
        ProcessBuilder pb = new ProcessBuilder("C:\\Users\\nyste\\.jdks\\corretto-21.0.6\\bin\\java.exe", "-classpath","C:\\Users\\nyste\\OneDrive\\Escritorio\\CFGSDAM2\\0490\\p2_process_services\\out\\production\\p2_process_services", "Writer");
        Process process = pb.inheritIO().start();
        process.waitFor();
    }

}