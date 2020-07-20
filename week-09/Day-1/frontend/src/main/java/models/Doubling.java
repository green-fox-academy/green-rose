package models;


public class Doubling {
 private final int input;
 private final long doubled;

 public Doubling(int input) {
  this.input = input;
  this.doubled = input*2;
 }

 public int getInput() {
  return input;
 }

 public long getDoubled() {
  return doubled;
 }

}
