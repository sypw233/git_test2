public class FizzBuzz {
    private int number; // 输入数字

    public FizzBuzz(int num) {
        number = num;
    }

    public String fizzBuzz() {
        StringBuilder result = new StringBuilder();
        
        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        
        return result.length() > 0 ? result.toString() : String.valueOf(number);
    }
}