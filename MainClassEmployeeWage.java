package com.employeWage;

public class MainClassEmployeeWage {
    public static void main(String[] args) {

        //adding company details by creating objects
        EmployeeWage infosys = new EmployeeWage("INFOSYS", 20, 8, 100);
        infosys.computationOfEmployeeWage();
        System.out.println(infosys);

        EmployeeWage tcs = new EmployeeWage("TCS", 30, 5, 70);
        tcs.computationOfEmployeeWage();
        System.out.println(tcs);
    }
}
