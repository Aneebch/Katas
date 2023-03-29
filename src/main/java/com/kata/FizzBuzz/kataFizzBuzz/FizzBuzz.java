package com.kata.FizzBuzz.kataFizzBuzz;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class FizzBuzz {

    public String execute(int i) {
        if (i % 3 == 0)  return "Fizz";
        return null;
    }
}
