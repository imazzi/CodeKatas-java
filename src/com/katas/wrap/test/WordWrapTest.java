package com.katas.wrap.test;

import com.katas.wrap.main.WordWrap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapTest {
// ("test", 7)            -> "test"
//         ("hello world", 7)     -> "hello\\world"
//         ("a lot of words for a single line", 10) -> "a lot of\\words for\\a single\\line"
//
//         ("this is a test", 4)  -> "this\\is a\\test"
//         ("a longword", 6)      -> "a long\\word"
//         ("areallylongword", 6) -> "areall\\ylongw\\ord"
//
//         ("greedy whenthewordistoolong", 6) -> "greedy\\whenth\\ewordi\\stoolo\\ng"
//         ("greedy whenthewordistoolong", 7) -> "greedy\\whenthe\\wordist\\oolong"   (=> no trailing space)
    @Test
    void should_return_same_text_when_text_length_is_less_than_maxLength(){
        assertEquals("test", WordWrap.wrap("test",7));

    }

    @Test
    void should_return_text_with_breaks_when_text_length_is_more_than_maxLength(){
        assertEquals("hello\\world", WordWrap.wrap("hello world",7));

    }
}
