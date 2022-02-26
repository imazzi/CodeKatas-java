package katas.java.fizz_buzz;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        String result = "";
        if(number%3 == 0)
            result = "fizz";
        if(number%5 == 0)
            result += "buzz";
        return result;
    }
}
