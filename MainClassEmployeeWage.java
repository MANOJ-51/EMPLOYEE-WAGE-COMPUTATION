package com.employeWage;

public class MainClassEmployeeWage {
    public static void main(String[] args) {

        //adding company details by creating objects
        InterfaceCompanyEmployeeWage object = new EmployeeWage();   //creating obj of sub class with reference of super class interface

        //adding comapnies to array
        object.addCompanyEmployeeWage("INFOSYS", 20, 100, 40);
        object.addCompanyEmployeeWage("TCS", 25, 80, 20);

        //calling method for computation
        object.computationOfEmployeeWage();

        //UC14 GET TOTAL WAGE WHEN QUIRED BY COMPANY
        object.getTotalWage("TCS");
    }
}

