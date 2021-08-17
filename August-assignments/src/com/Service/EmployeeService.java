package com.Service;
import com.Details.*;

import java.util.*;

public class EmployeeService {


    Scanner s = new Scanner(System.in);
     Scanner s1 = new Scanner(System.in);
    List<Employees> d = new ArrayList<>();


    public Employees employeeDetails() {


        System.out.print("Enter Employee Id : ");
        int id = s.nextInt();     /*inserting employee Id*/
        System.out.print("Enter Employee Name : ");
        String name = s1.nextLine();  /*inserting employee Name (string)*/
        System.out.print("Enter Employee Age : ");
        int age = s.nextInt();      /*inserting employee age*/

       d.add(new Employees(id, name, age));   /*adding employee details to a list*/

        System.out.println("-----------------------------------");

        return new Employees(id,name,age); /*returns employee name,id,age*/
    }


    public  Employees displayallEmployee() {
        System.out.println("------------------------");
        Iterator<Employees> i= d.iterator();
        while (i.hasNext()){
            Employees e= i.next();
            System.out.println(e);    /*prints the employee details if present in the list*/
        }
        System.out.println("------------------------");
        return new Employees(23,"sony",23);
    }
        public Employees deleteEmployee() {
            boolean found = false;
            System.out.println("enter employee no. to delete: ");
            int no = s.nextInt();
            System.out.println("------------------------");
            Iterator<Employees> i= d.iterator();
            while (i.hasNext()){
                Employees e= i.next();
                if(e.getId()== no){    /*checks whether entered and listed ids are same or not*/
                    i.remove();
                    found=true;
                }         /*deletes the employee details when entered Id no. matches with employee Id in the list*/
            }
            System.out.println("------------------------");
            if(!found){
                System.out.println("No such Employee");
            }              /*executes when entered id doesnt matches with the listed ids*/
            else{
                System.out.println("Deleted the Employee details");
            }               /*executes when entered id  matches with the listed ids and after deleting id*/
            System.out.println("------------------------");
            return new Employees(234,"sony",34);
        }


    public Employees UpdateemployeeDetails(){

            boolean found = false;
            System.out.println("enter employee no. to Update: ");
            int no = s.nextInt();
            System.out.println("------------------------");
            ListIterator<Employees> li = d.listIterator();
            while (li.hasNext()){
                Employees e= li.next();
                if(e.getId()== no){
                    /*checks whether entered and listed ids are same or not*/
                    /* id matches then */
                    System.out.print("Employee New Id : ") ;
                    int Id= s.nextInt();
                    System.out.print("Employee New Name : ") ;
                    String Name= s1.nextLine();

                    System.out.print("Employee New age : ") ;
                    int Age = s.nextInt();

                    d.add(new Employees(Id,Name,Age));  /*adds new Employee details to the list*/

                    found=true;
                }      /*updates the old employee details with new one*/
            }
            if(!found){
                System.out.println("No such Employee");
            }
            else {
                System.out.println("Updated Employee details Successfully");
            }
            System.out.println("------------------------");

    return new Employees(234,"sony",23);
    }
    public Employees SearchEmployeeById(){
        boolean found = false;
        System.out.println("enter employee no. to search: ");
        int eno = s.nextInt();
        System.out.println("------------------------");
        Iterator<Employees>i = d.iterator();
        while (i.hasNext()){
            Employees e= i.next();
            if(e.getId()== eno){
                System.out.println(e);
                found=true;
            }           /*searches the employee details with id entered*/
        }
        System.out.println("------------------------");
        if(!found){
            System.out.println("No such Employee");
        }
        System.out.println("------------------------");

        return new Employees(8,"aaa",23);
    }


}




