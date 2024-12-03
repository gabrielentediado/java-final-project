package controllers;
import java.util.ArrayList;

import models.Book;
import models.User;

public class UserController {
    private ArrayList<User> userList;

    public UserController(ArrayList<User> userList){
        this.userList = userList;
    }
    private void addUser(User user) {
        userList.add(user);
    }
    public void displayUsers() { for (User user : userList) {
        System.out.println("ID: " + user.getId() + ", Nome: " + user.getName() + ", Idade: " + user.getAge());
        }
    }
}
