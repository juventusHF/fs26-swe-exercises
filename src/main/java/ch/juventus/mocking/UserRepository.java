package ch.juventus.mocking;

import java.util.List;

public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        users = List.of(
                new User("Alice Chen", 28, List.of("photography", "hiking", "pottery")),
        new User("Marcus Johnson", 34, List.of("woodworking", "cycling", "cooking")),
        new User("Sofia Reyes", 22, List.of("painting", "yoga", "reading")),
        new User("James Okafor", 41, List.of("chess", "gardening", "fishing")),
        new User("Emma Lindström", 19, List.of("knitting", "bouldering", "gaming")),
        new User("Raj Patel", 36),
        new User("Chloe Dubois", 25, List.of("dancing", "journaling", "surfing")),
        new User("Noah Kimura", 30),
        new User("Isabelle Tremblay", 45, List.of("quilting", "wine tasting", "running")),
        new User("Diego Morales", 17)
        );
    }

    public List<User> getUsers() {
        return users;
    }
}