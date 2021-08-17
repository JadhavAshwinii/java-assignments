package com.Details;


public class Employees {

    private int Id;
    private String Name;
    private int Age;

    public  Employees ( int Id, String Name,int Age) {
        this.Age = Age;
        this.Id = Id;
        this.Name = Name;
    }



    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age ;
    }
}
