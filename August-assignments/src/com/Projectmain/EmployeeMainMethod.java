package com.Projectmain;
import com.Details.Employees;
import com.Service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmployeeMainMethod {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        EmployeeService em = new EmployeeService();
        List<Employees> e= new ArrayList<>();

        int n;
        do {

            System.out.println("1.Add Employee details");
            System.out.println("2.Display All Employee details");
            System.out.println("3.Delete Employee details");
            System.out.println("4.Update Employee details");
            System.out.println("5.Search Employee by Id");
            System.out.println("0. Exit");

            System.out.print("Enter ur choice n : ");
            n = s.nextInt();
            switch (n) {

                case 1:
                    em.employeeDetails();   /*calling employeedetails method from EmployeeService*/
                break;
                case 2:
                    em.displayallEmployee();     /*calling display All Employees method from EmployeeService*/
                break;
                case 3:
                    em.deleteEmployee();         /*calling delete-employee  method from EmployeeService*/
                break;
                case 4:

                    em.UpdateemployeeDetails();         /*calling Update employee details method from EmployeeService*/
                break;
                case 5:
                    em.SearchEmployeeById();         /*calling Search employee details  by Id method from EmployeeService*/
                break;
            }

        }while (n!= 0);
    }

}