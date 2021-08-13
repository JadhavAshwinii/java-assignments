package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.util.Scanner;

public class EmployeeMain {
    static void menu() {
        System.out.println("1.insert");
        System.out.println("2.display");
        System.out.println("3.delete");
        System.out.println("4.update");
        System.out.print("Enter ur choice n : ");
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        int n;
        do {

            Employee e = new Employee();
            menu();
            n = s.nextInt();
            switch (n) {

                case 1:
                    System.out.print("Enter Employee Id : ");
                    e.setId(s.nextInt());
                    System.out.print("Enter Employee Name : ");
                    e.setName(s1.nextLine());
                    System.out.print("Enter Employee Age : ");
                    e.setAge(s.nextInt());
                    e.addNewEmployee(e);
                    list.add(e);
               break;
                case 2:
                    e.displayEmployee(list);
                break;
                case 3:
                    boolean found = false;
                    System.out.println("enter employee no. to delete: ");
                    int no = s.nextInt();
                    System.out.println("------------------------");
                    Iterator<Employee> i = list.iterator();
                    while (i.hasNext()){
                        Employee emp = i.next();
                        if(emp.getId()== no){
                            i.remove();
                            found=true;
                        }

                    }
                    System.out.println("------------------------");
                    if(!found){
                        System.out.println("No such Employee");
                    }else{
                        System.out.println("Deleted the Employee details");
                    }
                    System.out.println("------------------------");
                break;
                case 4:
                    found = false;
                    System.out.println("enter employee no. to Update: ");
                    no = s.nextInt();
                    System.out.println("------------------------");
                    ListIterator<Employee> li = list.listIterator();
                    while (li.hasNext()){
                        Employee emp= li.next();
                        if(emp.getId()== no){
                            li.remove();
                            System.out.print("Employee New Id : ") ;
                            e.setId(s.nextInt());
                            System.out.print("Employee New Name : ") ;
                            e.setName(s1.nextLine());

                            System.out.print("Employee New age : ") ;
                            e.setAge(s.nextInt());

                            e.addNewEmployee(e);
                            li.add(e);

                            found=true;
                        }

                    }

                    if(!found){
                        System.out.println("No such Employee");
                    }else{
                        System.out.println("Updated details");
                    }
                    System.out.println("------------------------");
                    break;


            }

        } while (n != 0);
    }

}