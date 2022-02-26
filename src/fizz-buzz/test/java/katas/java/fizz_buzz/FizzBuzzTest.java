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
    void should_return_number_when_number_is_not_multiple_of_three_nor_of_five(){
        assertEquals("2",FizzBuzz.fizzBuzz(2));
    }

    @Test
    void should_return_buzz_when_number_is_multiple_of_five(){
        assertEquals("buzz",FizzBuzz.fizzBuzz(5));
    }

    @Test
    void should_return_fizz_buzz_when_number_is_multiple_of_five_and_three(){
        assertEquals("fizzbuzz",FizzBuzz.fizzBuzz(15));
    }

    @Test
    void should_return_fizz_or_buzz_or_fizzbuzz_or_number_depends_on_number(){
        assertEquals(List.of("1: 1", "2: 2", "3: fizz", "4: 4", "5: buzz"),FizzBuzz.fizzBuzzNth(5));
    }




}

