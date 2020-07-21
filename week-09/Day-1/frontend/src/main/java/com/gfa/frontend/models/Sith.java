package com.gfa.frontend.models;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;
import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Sith {
    private String text;
    private String sith_text;

    public Sith(String text) {
        this.text = text;
        this.sith_text = text;
    }

    public Sith() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.sith_text = this.yoda(text);
    }

    private String yoda(String text) {
        List<String> yodaErr = Arrays.asList("Err..err.err. ",  "Arrgh. Uhmm. ", "Err.. Uhmm. ");
        Random rand = new Random();
        String output ="";
        for (String sentence: text.split("[.]")) {
            ArrayList<String> words = new ArrayList<>(Arrays.asList(sentence.trim().split(" ")));
            for (int i = 0; i < words.size()-1 ; i+=2) {
                output+=(i==0)? StringUtils.capitalize(words.get(i+1)):words.get(i+1);
                output+=" ";
                output+=(i==0)? words.get(i).toLowerCase():words.get(i);
                output+=" ";
            }
            if (words.size()%2==1)  output+=words.get(words.size()-1);
            output=output.trim()+". "+yodaErr.get(rand.nextInt(yodaErr.size()));
        }
        return output.trim();
    }

    public String getSith_text() {
        return sith_text;
    }

    public void setSith_text(String sith_text) {
        this.sith_text = sith_text;
    }
}
