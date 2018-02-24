package io.vertx.jdk8.methodref;

import java.util.Arrays;
import java.util.Random;

public class StaticMethod {

  public static void main(String[] args) {

    Person[] persons =  buildPersons();
    System.out.println(Arrays.asList(persons));
//    Arrays.sort(persons, (p1, p2) -> {
//      if (p1 == null && p2 == null) {
//        return 0;
//      }
//      return p1.age.compareTo(p2.age);
//    });
    Arrays.sort(persons,Person::compareByAge);

    System.out.println(Arrays.asList(persons));
  }

  private static Person[] buildPersons( ) {
    Person[] persons = new Person[10];
    for(int i = 0;i<persons.length;i++){
      Person person = new Person();
      person.setName("name"+i);
      person.setAge(new Random().nextInt(100));
      persons[i]  = person;
    }
    return persons;
  }


}
