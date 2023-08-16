package org.learn.builder;

public class Dog {
    private String name;
    private String gender;
    private float age;
    private String breed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(DogBuilder dogBuilder){
        this.name = dogBuilder.name;
        this.gender = dogBuilder.gender;
        this.age = dogBuilder.age;
        this.breed = dogBuilder.breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static class DogBuilder{
        private String name;
        private String gender;
        private float age;
        private String breed;

        public float getAge() {
            return age;
        }

        public DogBuilder setAge(float age){
            this.age = age;
            return this;
        }

        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed){
            this.breed = breed;
            return this;
        }

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name){
            this.name = name;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public Dog build(){
            return new Dog(this);
        }
    }
}
