package ch.juventus.mocking;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String name;
    private final int age;
    private final List<String> hobbies;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>();
    }

    public User(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }
}
