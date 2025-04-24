public class FizzBuzz {
    public static void main(String[] args) {
        
        // 打印 1 到 100 的 FizzBuzz 结果
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
        
    }

    /**
     * 根据 FizzBuzz 规则返回相应的字符串
     * @param number 输入数字
     * @return FizzBuzz 结果字符串
     */
    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}