package katas.java.fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        String result = "";
        if(number%3 == 0)
            result = "fizz";
        if(number%5 == 0)
            result += "buzz";
        return result.isEmpty() ? Integer.toString(number) : result;
    }

    public static List<String> fizzBuzzNth(int number) {
        List<String> result = new ArrayList<>();
        for(int i = 1;i<=number;i++){
            result.add(fizzBuzz(i));
        }
        return result;
    }

}
