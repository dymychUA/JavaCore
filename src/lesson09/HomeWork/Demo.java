package lesson09.HomeWork;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User(1, "Den", "0001");
        User user2 = new User(2, "Ben", "0002");
        User user3 = new User(3, "Zen", "0003");
        User user4 = null;
        User user5 = new User(5, "Asd", "0007");


        User[] users = {user1, user2, user3, user4};
        UserRepository repository = new UserRepository(users);

        //UserRepository repository = null;

        System.out.println(Arrays.toString(repository.getUserNames()));
        System.out.println(Arrays.toString(repository.getUserIds()));
        System.out.println(repository.getUserNameById(3));
        System.out.println(repository.save(user5));

    }
}
