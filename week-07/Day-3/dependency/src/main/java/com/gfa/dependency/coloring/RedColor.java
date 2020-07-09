package com.gfa.dependency.coloring;

import org.springframework.stereotype.Service;


public class RedColor implements MyColor{

    @Override
    public void printColor() {
        System.out.println("RED!");
    }
}
