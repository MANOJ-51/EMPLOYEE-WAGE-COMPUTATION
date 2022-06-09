package com.employeWage;

public class EmployeeWage {
    public void computationOfEmployeeWage() {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
        //constant variables
        final int isPresent = 1;
        final int wagePerHour = 20;
        final int isParttime = 2;
        final int totalWorkingDays = 20;
        int maximumWorkingHours=100;
        //temporary variables
        int employeeHours = 0;
        int employeeWage = 0;
        int totalEmployeeWage = 0;
        int totalEmployeeHours=0;
        int numberOfDays=0;
        /*finding employee is present or not using switch case*/
        while (totalEmployeeHours<maximumWorkingHours && numberOfDays<totalWorkingDays) {
            numberOfDays++;
            int attandance = (int) Math.floor(Math.random() * 3);
            switch (attandance) {
                case isPresent:
                    employeeHours = 8;
                    break;
                case isParttime:
                    employeeHours = 4;
                    break;
                default:
                    employeeHours = 0;
            }
            //calclulating  employee total wage
            totalEmployeeHours+=employeeHours;
            employeeWage = employeeHours * wagePerHour;
            totalEmployeeWage = totalEmployeeWage + employeeWage;
            System.out.println("EMPLOYEE DAY .." + numberOfDays + "EMPLOYEE INCOME." + employeeWage);
        }
        System.out.println("EMPLOYEE TOTAL WAGE: " + totalEmployeeWage);
    }
}


