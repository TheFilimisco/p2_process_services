import java.util.Scanner;

public class Main2 {


    /* #2 */
    /*public static void main(String[] args) {
        System.out.println("Hola!");
        System.exit(200);
    }*/

    /* #2.1 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine();

        if (inputData.equalsIgnoreCase("BYE")) {
            System.exit(0);
        } else if (inputData.equalsIgnoreCase("ERROR")) {
            System.exit(200);
        } else {
            sc.close();
        }
    }
}
