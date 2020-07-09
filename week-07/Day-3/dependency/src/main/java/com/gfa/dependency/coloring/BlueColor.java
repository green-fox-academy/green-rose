package com.gfa.dependency.coloring;

import com.gfa.dependency.helloworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor{

    @Autowired
    private Printer printer;

    @Override
    public void printColor() {

       printer.log("BLUE is new Black!");
    }
}
