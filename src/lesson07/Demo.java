package lesson07;

import lesson06.Car;
import lesson06.DbConnector;
import lesson06.User;

public class Demo {
    public static void main(String[] args) {
        //two options to create object
        //class name (type) object name = new class name ();
        //class name (type) object name = new class name (atttributes);

        User user = new User();
        User user1 = new User();
        User user2 = new User();

        User user3 = new User("Jack");


        Car car = new Car(10000, 2015, "Anton");
        //Car car1 = new Car();

        DbConnector dbConnector = new DbConnector();

    }
}
