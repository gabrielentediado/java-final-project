package models;

public class Autor extends Person{
    public Autor(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void printDetails() {
        super.printDetails();
    }
}
