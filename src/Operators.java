/**
 * service Operators class for calculator
 */
public class Operators {
    /**
     * calculator instance
     */
    private Calculable calculator;

    /**
     * constructor
     * @param calculator
     */
    Operators(Calculable calculator) {
        this.calculator = calculator;
    }

    /**
     * choosing an operation
     *
     * @param operator
     * @param args
     * @return
     */
    protected Calculable main(String operator, float[] args) {
        switch (operator) {
            case ("+"): {
                this.calculator.add(args);
                break;
            }
            case ("-"): {
                this.calculator.sub(args);
                break;
            }
            case ("*"): {
                this.calculator.mul(args);
                break;
            }
            case ("/"): {
                this.calculator.div(args);
                break;
            }
            case ("^"): {
                this.calculator.pow(args);
                break;
            }
        }
        return this.calculator;
    }
}
