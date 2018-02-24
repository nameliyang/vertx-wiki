package io.vertx.jdk8;

public class DefaultInterfaceDemo {

  public static void main(String[] args) {



  }



  interface  Defauable{
    default  String  info(){
      return "default implementation...";
    }
  }
}
