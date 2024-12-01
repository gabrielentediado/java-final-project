package models;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails() {
        System.out.printf("ID: %d;\nNome: %s;\nIdade: %d.\n", this.id, this.name, this.age);
    }
}
