package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Let a list of List objects of type User{String fName, String lName, int age } be given.
//        All users under 18 years old must be excluded from the list.
        User user1 = new User("Jack", "Uarabei", 100);
        User user2 = new User("Angelina", "Joli", 25);
        User user3 = new User("Laracika", "Kroft", 18);
        User user4 = new User("Andrei", "Daiscazati", 15);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        System.out.println(userList);

        System.out.println(chooseAge(userList));

    }

    public static List<User> chooseAge(List<User> userList) {
        List<User> ageList = new ArrayList<>();
        if (userList == null || userList.isEmpty()) {
            return userList;
        }
        for (User u : userList) {
            if (u.getAge() >= 18) {
                ageList.add(new User(u.getfName(), u.getlName(), u.getAge()));
            }
        }
        return ageList;
    }
}

