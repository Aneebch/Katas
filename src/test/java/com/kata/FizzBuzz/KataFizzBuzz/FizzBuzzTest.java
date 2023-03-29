package com.kata.FizzBuzz.KataFizzBuzz;

import com.kata.FizzBuzz.kataFizzBuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void cuandoSeaMultiploPor3DevuelveFizz() {
       // GIVEN FOR THE TEST
       var fizzBuzz = new FizzBuzz();
       // WHEN
        var sut = fizzBuzz.execute(3);
        // THEM
        assertEquals("Fizz", sut);
    }

    @Test
    void cuandoSeaMultiploPor5DevuelveBuzz() {
        // GIVEN FOR THE TEST
        var fizzBuzz1 = new FizzBuzz();
        // WHEN
        var sut = fizzBuzz1.execute(5);
        // THEM
        assertEquals("Buzz", sut);
    }


}
