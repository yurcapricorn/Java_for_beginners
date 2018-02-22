import java.util.Scanner;

/**
 * User Input module for Operators
 */
class UserInput {
    /**
     * scans input stream for user input
     * @return
     */
    protected static String[] process() {
        Scanner scanner = new Scanner(System.in);
        String[] result = new String[3];
        try {
            System.out.println("enter first num");
            result[0] = scanner.next();
            System.out.println("enter second num");
            result[1] = scanner.next();
            System.out.println("enter an operator sign");
            result[2] = scanner.next();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return result;
    }
}
