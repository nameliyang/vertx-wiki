package io.vertx.jdk8;

import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    Arrays.asList("a","b").forEach(e -> {
      System.out.println(e);
    });
    final List<Integer> nums = Arrays.asList(1, 2, 3, 4);



  }
}
