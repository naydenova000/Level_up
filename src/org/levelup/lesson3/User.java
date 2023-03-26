package org.levelup.lesson3;

public class User {
    String firstName;
    String lastName;
    String age;
    @Override
    public String toString(){
        return this.firstName + " " + lastName + " " + age;
    }
}
