import java.util.Scanner;

/**
 * calculator main class
 */
public class Calculator {

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
                float[] arguments = new float[]{first, second};
                String operator = input[2];
                SimpleCalc calc = new SimpleCalc();
                Operators operators = new Operators(calc);
                Calculable calculator = operators.main(operator, arguments);
                System.out.println("result = " + calculator.getResult());
                calculator.cleanResult();
                System.out.println("exit yes/no");
                exit = scanner.next();
            } while (!exit.equals("yes"));
        }  catch (Exception e) {
            System.out.println(e.toString());
        }finally {
            scanner.close();
        }
    }
}
