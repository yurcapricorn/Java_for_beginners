import java.util.Scanner;

/**
 * calculator main class
 */
public class Calculate {

    /**
     * program entry point
     *
     * @param args
     */
    public static void main(String[] args) {
        String exit;
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                String[] input = UserInput.process();
                float first = Float.valueOf(input[0]);
                float second = Float.valueOf(input[1]);
                String operator = input[2];
                Calculator calculator = new Calculator();
                calculator.doMath(operator, first, second);
                System.out.println("result = " + calculator.getResult());
                calculator.cleanResult();
                System.out.println("exit yes/no");
                exit = scanner.next();
            } while (!exit.equals("yes"));
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            scanner.close();
        }
    }
}
