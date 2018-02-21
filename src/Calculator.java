/**
 * service Calculator class for calculator
 */
public class Calculator {
    /**
     * result storage
     */
    protected float result;

    /**
     * get result method
     * @return
     */
    protected float getResult() {
        return this.result;
    }

    /**
     * clean result method
     */
    protected void cleanResult() {
        this.result = 0;
    }

    /**
     * calculation method
     * @param operator
     * @param first
     * @param second
     */
    protected void doMath(String operator, float first, float second) {
        switch (operator) {
            case ("+"): {
                result = first + second;
                break;
            }
            case ("-"): {
                result = first - second;
                break;
            }
            case ("*"): {
                result = first * second;
                break;
            }
            case ("/"): {
                result = first / second;
                break;
            }
            case ("%"): {
                result = first % second;
                break;
            }
        }
        this.result = result;
    }
}
