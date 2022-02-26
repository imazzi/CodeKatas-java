package com.calculator;

import java.util.Arrays;

public class Calculator {

    public static int add(String s) {
        if(s.length() == 0) {
            return 0;
        }

        if(s.startsWith("//")){
            char delimiter = s.charAt(2);
            int[] numbers = Arrays.stream(s.substring(4).split("["+delimiter+"\n]")).mapToInt(Integer::parseInt).toArray();
            return Arrays.stream(numbers).sum();
        }
        int[] numbers = Arrays.stream(s.split("[,\n ;]")).mapToInt(Integer::parseInt).toArray();
        for(int number:numbers){
            if(number<0){
                throw new IllegalArgumentException("negatives not allowed");
            }
        }
        return Arrays.stream(numbers).filter(i->i<1000).sum();
    }
}
