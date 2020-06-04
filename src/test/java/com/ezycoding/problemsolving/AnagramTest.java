package com.ezycoding.problemsolving;

import com.ezycoding.problemsolving.hackerrank.Anagram;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AnagramTest {

    private Anagram anagram;
    @BeforeAll
    void init(){
        System.out.println("Before call");
        anagram = new Anagram();
    }
    @Test
    public void testAnagram(){
        Assertions.assertTrue(anagram.checkAnagram1("abc","abc"));
    }
    @AfterAll
    void cleanUp(){
        System.out.println("Clean Up");
    }
}
