package com.gfa.frontend.models;


public class Doubling {
 private final int received;
 private final long result;

 public Doubling(int received) {
  this.received = received;
  this.result = received*2;
 }

 public int getReceived() {
  return received;
 }

 public long getResult() {
  return result;
 }

}
