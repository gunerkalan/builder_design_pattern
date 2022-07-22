package com.guner.designpattern;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person.Builder()
                .identityNumber("12345")
                .name("Güner")
                .surname("KALAN")
                .age(37)
                .gender(1)
                .build();

        System.out.println(person);

        Person person1 = new Person.Builder("123456","Nisan")
                .surname("KALAN")
                .age(5)
                .gender(2)
                .build();

        System.out.println(person1);

    }
}
