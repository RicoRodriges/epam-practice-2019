package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleTest {

    @Test
    public void testName() {

    }

    @Test
    public void testNameFail() {
        throw new RuntimeException("Something went wrong");
    }

    @Test(expected = RuntimeException.class)
    public void testNameFailExpected() {
        throw new RuntimeException("Something went wrong");
    }

    @Test
    public void testJUnitAssertions() {
        String actual = "1";
        Assert.assertEquals("1", actual);
    }

    @Test
    public void testAssertJAssertions() {
        List<String> strings = Stream.iterate(0, i -> i + 1)
                .limit(3)
                .map(String::valueOf)
                .collect(Collectors.toList());

        Assertions.assertThat(strings)
                .isNotEmpty()
                .hasSize(3)
                .containsExactly("0", "1", "2");

        Assertions.assertThatThrownBy(this::testNameFail)
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Something went wrong")
                .hasNoCause();
    }
}
