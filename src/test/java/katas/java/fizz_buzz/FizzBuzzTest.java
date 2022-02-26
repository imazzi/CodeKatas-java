package katas.java.fizz_buzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {

    @Test
    void should_return_fizz_when_number_is_multiple_of_three(){
        assertEquals("fizz",FizzBuzz.fizzBuzz(3));
    }

    @Test
    void should_return_empty_string_when_number_is_not_multiple_of_three_nor_of_five(){
        assertEquals("",FizzBuzz.fizzBuzz(2));
    }

    @Test
    void should_return_buzz_when_number_is_multiple_of_five(){
        assertEquals("buzz",FizzBuzz.fizzBuzz(5));
    }

    @Test
    void should_return_fizz_buzz_when_number_is_multiple_of_five_and_three(){
        assertEquals("fizzbuzz",FizzBuzz.fizzBuzz(15));
    }



}

