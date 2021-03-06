package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.ends(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.ends(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotEndWithPrefix1ThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'r', 'o'};
        boolean result = EndsWith.ends(word, post);
        assertThat(result, is(false));
    }
}