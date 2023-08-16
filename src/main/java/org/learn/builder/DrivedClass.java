package org.learn.builder;

public class DrivedClass {
    public static void main(String[] args) {
        Dog dog = new Dog.DogBuilder().setName("jack").setAge(4).build();

        Dog dog3 = new Dog.DogBuilder().setName("gama").setGender("male").build();

        System.out.println(dog);
        System.out.println(dog3);

    }
}
