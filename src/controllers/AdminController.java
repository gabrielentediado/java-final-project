package controllers;

import models.User;

import java.util.ArrayList;

public class AdminController {
    private ArrayList<User> adminList;

    AdminController(ArrayList<User> userList){
        this.adminList = userList;
    }
    private void add_books(User user) {
        adminList.add(user);
    }
}
