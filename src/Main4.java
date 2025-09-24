import java.io.IOException;

public class Main4 {

    /* #4 */
/*    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("notepad.exe");
        int codiRetorn = process.waitFor();
        System.out.println("Procés \"" + "notepad.exe" + "\" finalitzat amb codi: " + codiRetorn);

    }*/

    /* #4.1 */
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("notepad.exe");
        int codeSaved = process.waitFor();
        System.out.println(codeSaved);
    }

}
