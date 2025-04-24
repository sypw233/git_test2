public class FizzBuzz {
    private int number; // 输入数字
    public FizzBuzz(int num) {
        number = num;
    }
    public String fizzBuzz() {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

}