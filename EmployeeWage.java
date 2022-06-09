package com.employeWage;

//uc9 using instance variables in class level
public class EmployeeWage {

    //constant variables
    static final int isPresent = 1;
    static final int isParttime = 2;

    //uc9 variables
    final String companyName;
    final int totalWorkingDays;
    final int maximumWorkingHours;
    final int wagePerHour;

    int totalEmployeeWage = 0;

    //constructors
    public EmployeeWage(String companyName, int totalWorkingDays, int maximumWorkingHours, int wagePerHour) {
        this.companyName = companyName;
        this.totalWorkingDays = totalWorkingDays;
        this.maximumWorkingHours = maximumWorkingHours;
        this.wagePerHour = wagePerHour;
    }

    //computation of employee wage
    public int computationOfEmployeeWage() {

        //temporary variables
        int employeeHours = 0;
        int employeeWage = 0;

        int totalEmployeeHours = 0;
        int numberOfDays = 0;
        /*finding employee is present or not using switch case*/
        while (totalEmployeeHours < maximumWorkingHours && numberOfDays < totalWorkingDays) {
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
            totalEmployeeHours += employeeHours;
            employeeWage = employeeHours * wagePerHour;
            totalEmployeeWage = totalEmployeeWage + employeeWage;
        }
        return totalEmployeeWage;

    }

    @Override  //rewriting format to print custom
    public String toString() {
        return companyName + " " + "EMPLOYEE TOTAL WAGE : " + totalEmployeeWage;
    }
}


