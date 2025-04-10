public class Calculator {

    private static int result;

    public void add(int n) {
        result=result + n ;
    }


    public void substract(int n) {
        result=result - n ;
    }

    public int getResult() {
        return result;
    }

    public void clear() {
        result=0;
    }
}
