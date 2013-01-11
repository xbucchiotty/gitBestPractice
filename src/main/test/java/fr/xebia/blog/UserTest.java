package fr.xebia.blog;

import org.junit.Test;

public class UserTest {

    @Test
    public void should_print_user() {
        new User("T", "Mister").print();
    }
}
