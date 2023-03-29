package com.kata.FizzBuzz.kataFizzBuzz;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class FizzBuzz {

    public String execute(int i, int i1) {
        if (i % 3 == 0) {return "Fizz";}
        if (i % 5 == 0) {return "Buzz";}
        if (i1 % 3 == 0 && i1 % 5 == 0) {return "FizzBuzz";}
        return null;
    }
}
