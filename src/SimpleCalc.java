/**
 * simple calculator
 */
public class SimpleCalc implements Calculable {
    /**
     * stores result
     */
    float result;

    /**
     * add
     * @param args
     */
    public void add(float[] args) {
        for (float arg : args) {
            this.result += arg;
        }
    }

    /**
     * sub
     * @param args
     */
    public void sub(float[] args) {
        for (float arg : args) {
            this.result -= arg;
        }
    }

    /**
     * div
     * @param args
     */
    public void div(float[] args) {
        this.result = args[0]*args[0];
        for (float arg : args) {
            this.result /= arg;
        }
    }

    /**
     * mul
     * @param args
     */
    public void mul(float[] args) {
        for (float arg : args) {
            this.result *= arg;
        }
    }

    /**
     * pow
     * @param args
     */
    public void pow(float[] args) {
        for (float arg : args) {
            this.result = (float) Math.pow(this.result, arg);
        }
    }

    /**
     * get result
     * @return
     */
    public float getResult() {
        return this.result;
    }

    /**
     * clean result
     */
    public void cleanResult() {
        this.result = 0;
    }
}
