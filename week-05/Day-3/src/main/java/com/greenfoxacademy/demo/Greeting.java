package com.greenfoxacademy.demo;

public class Greeting {

    private long greetCount;
    private String content;

    public Greeting(int greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public long getGreetCount() {
        return greetCount;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"greetCount\": " + greetCount +
                ",\n  \"content\": \"" + content + "\"}";
    }
}
