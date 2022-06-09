package com.employeWage;

public class MainClassEmployeeWage {
    public static void main(String[] args) {

        //adding company details by creating objects
        EmployeeWage object =new EmployeeWage();

        //adding comapnies to array
        object.addCompanyEmployeeWage("INFOSYS",20,100,40);
        object.addCompanyEmployeeWage("TCS",25,80,20);

        //calling method for computation
        object.computationOfEmployeeWage();
    }
}
