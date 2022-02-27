package com.katas.wrap.test;

import com.katas.wrap.main.WordWrap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapTest {

    @Test
    void should_return_same_text_when_text_length_is_less_than_maxLength(){
        assertEquals("test", WordWrap.wrap("test",7));

    }
}
