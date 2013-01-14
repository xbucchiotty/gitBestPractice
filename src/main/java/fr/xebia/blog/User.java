package fr.xebia.blog;

public class User {

    private final String lastName;
    private final String firstName;

    public User(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void print(){
        System.out.println(format());
    }

    private String format() {
        return String.format("Hello YOU %s, %s",lastName,firstName);
    }
}
