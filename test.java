package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class StringManipulationTest {

    @Test
    public void testContains() {
        String str = "Hello, World!";
        assertTrue(str.contains("World"));
    }

    @Test
    public void testStartsWith() {
        String str = "TestNG Test";
        assertTrue(str.startsWith("TestNG"));
    }
}
