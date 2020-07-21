package com.gfa.frontend.models;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersHandling {
    private String what;
    private List<Integer> numbers;

    public NumbersHandling() {
        this.numbers = new ArrayList<>();
    }

    public Object runHandling(HttpServletResponse response){
        if (numbers.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return new java.lang.Error("No numbers");
        }
        switch (this.what) {
            case "sum":
                return Collections.singletonMap("result", numbers.stream().mapToInt(Integer::intValue)
                        .sum());
            case "multiply":
                return Collections.singletonMap("result", numbers.stream().reduce(1, (a, b) -> a * b));
            case "double":
                return Collections.singletonMap("result", numbers.stream().map(i->2*i).toArray(Integer[]::new));

            default:
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return new Error("Wrong Array of numbers");
        }
    }
    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "{" +
                "what='" + what + "'" +
                ", numbers=" + numbers +
                "}";
    }
}
