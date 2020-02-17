package tasks.employee;

import java.util.Random;

public class Employee {
    private String name;
    private String surname;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name,String surname){
        this.name = name;
        this.surname = surname;
        int random = new Random().nextInt();
        id = random < 0 ? -random : random;
    }

    public Employee(){
        int random = new Random().nextInt();
        id = random < 0 ? -random : random;
    }

    public void print(){
        System.out.println("name='" + name + '\'' + ", surname='" + surname + '\'' + ", id=" + id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}

