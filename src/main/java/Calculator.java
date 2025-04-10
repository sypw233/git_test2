public class Calculator {
    private static int result;

    public void add(int n) {
        result += n;
    }

    public void substract(int n) {
        result -= n;
    }

    public void multiply(int n) {
        result *= n;
    }

    public void divide(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        result /= n;
    }

    public void square() {
        result *= result;
    }

    public int getResult() {
        return result;
    }

    public void clear() {
        result = 0;
    }
}