package models;

public class User extends Person{
    public User(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void printDetails() {
        super.printDetails();
    }

    public int getUserID(){
        return super.getId();
    }

    public String getUserName(){
        return super.getName();
    }
    public int getUserAge(){
        return super.getAge();
    }
}