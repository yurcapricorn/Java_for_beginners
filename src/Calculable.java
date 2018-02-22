/**
 * calculable interface for calculators
 */
public interface Calculable {
    void add(float[] args);
    void sub(float[] args);
    void div(float[] args);
    void mul(float[] args);
    void pow(float[] args);
    float getResult();
    void cleanResult();
}
