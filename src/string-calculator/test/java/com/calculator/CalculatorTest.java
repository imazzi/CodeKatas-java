package com.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void should_return_sum_zero_when_given_emptyString(){
        assertEquals(0,Calculator.add(""));
    }

    @Test
    public void should_return_sum_one_when_given_one(){
        assertEquals(2,Calculator.add("2"));
    }

    @Test
    public void should_return_sum_when_given_two_numbers(){
        assertEquals(3,Calculator.add("1,2"));
    }

    @Test
    public void should_return_sum_when_given_moreThanTwo_numbers(){
        assertEquals(6,Calculator.add("1,2,3"));
        assertEquals(16,Calculator.add("1,2,3,10"));
    }

    @Test
    public void should_return_sum_when_given_moreThanTwo_numbers_with_newLineDelimiter(){
        assertEquals(6,Calculator.add("1\n2\n3"));
        assertEquals(6,Calculator.add("1\n2,3"));
    }

    @Test
    public void should_return_sum_when_given_moreThanTwo_numbers_with_DiffDelimiters(){
        assertEquals(3,Calculator.add("//;\n1;2"));
        assertEquals(3,Calculator.add("//:\n1:2"));
    }

    @Test
    public void expected_exception_fail(){
        assertThrows(IllegalArgumentException.class,()->Calculator.add("1,-2"));
    }

    @Test
    public void should_ignore_1000(){
        assertEquals(6,Calculator.add("1,2,3,1001"));
    }

//    @Test
//    public void should_return_sum_when_given_moreThanTwo_numbers_with_Delimiters_of_any_length(){
//      assertEquals(6,Calculator.add("//***\n1***2***3"));
//    }

}