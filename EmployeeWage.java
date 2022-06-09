package com.employeWage;


import java.util.ArrayList;

//uc12 ability to manage employeewage for multiple companies using array list
public class EmployeeWage implements InterfaceCompanyEmployeeWage {

    //constant variables
    static final int isPresent = 1;
    static final int isParttime = 2;


    //initializing arrayLlist
    static ArrayList<CompanyEmployeeWage> companyEmployeeWageArray = new ArrayList<CompanyEmployeeWage>();


    //adding company details into array
    public void addCompanyEmployeeWage(String companyName, int totalWorkingDays, int maximumWorkingHours, int wagePerHour) {
        CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage(companyName, totalWorkingDays, maximumWorkingHours, wagePerHour);
        companyEmployeeWageArray.add(companyEmployeeWage);
    }

    //setting total employee wage in an array for multiple companies
    public void computationOfEmployeeWage() {
        for (int i = 0; i < companyEmployeeWageArray.size(); i++) {
            CompanyEmployeeWage companyEmployeeWage = companyEmployeeWageArray.get(i);
            companyEmployeeWage.setTotalEmployeeWage(this.computationOfEmployeeWage(companyEmployeeWage));
            System.out.println(companyEmployeeWage);
        }
    }


    //computation of employee wage
    public int computationOfEmployeeWage(CompanyEmployeeWage companyEmployeeWage) {

        //temporary variables
        int employeeHours = 0;
        int employeeWage = 0;

        int totalEmployeeHours = 0;
        int numberOfDays = 0;
        /*finding employee is present or not using switch case*/
        while (totalEmployeeHours < companyEmployeeWage.maximumWorkingHours && numberOfDays < companyEmployeeWage.totalWorkingDays) {
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
            totalEmployeeHours += employeeWage;
            employeeWage = employeeHours * companyEmployeeWage.wagePerHour;
            companyEmployeeWage.totalEmployeeWage = companyEmployeeWage.totalEmployeeWage + employeeWage;
        }
        return companyEmployeeWage.totalEmployeeWage; //returning to total employee wage

    }


}




