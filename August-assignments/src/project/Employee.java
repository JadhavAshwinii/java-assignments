package project;

import java.util.ArrayList;

public class Employee {
    private int Id;
    private String Name;
    private int Age;


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

    public void addNewEmployee(Employee e){
        this.Age= e.Age;
        this.Id=e.Id;
        this.Name=e.Name;
    }
    public void displayEmployee(ArrayList<Employee>arr){
        for(Employee employee:arr){
            System.out.println("==============================================");
            System.out.println("Employee name:" + employee.Id);
            System.out.println("Employee name:" + employee.Name);
            System.out.println("Employee name:" + employee.Age);
            System.out.println("==============================================");
        }
    }



}
