package io.vertx.jdk8;

import java.util.function.Supplier;

public class MethodRefTest {
  public static void main(String[] args) {
      Supplier<Car> t = Car::new;

  }

}

class Car{

  private String color;

  public Car(String color){
    this.color = color;
  }

  public Car(){
  }

  public String getColor(){
    return this.color;
  }
}
