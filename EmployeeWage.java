package com.employeWage;


import java.util.ArrayList;

//uc13 storing dialy wage along with total wage
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
        while (totalEmployeeHours <= companyEmployeeWage.maximumWorkingHours && numberOfDays < companyEmployeeWage.totalWorkingDays) {
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
            employeeWage = employeeHours * companyEmployeeWage.wagePerHour;
            companyEmployeeWage.totalEmployeeWage = companyEmployeeWage.totalEmployeeWage + employeeWage;

            //uc13 storing dialy wage along with total wage
            System.out.println(companyEmployeeWage.companyName + " DAY " + numberOfDays + " WAGE " + employeeWage + " EMPLOYEE HOURS " + employeeHours);
        }
        return companyEmployeeWage.totalEmployeeWage; //returning to total employee wage

    }

    //uc14 ability get total wage when quired by companey
    public void getTotalWage(String companyName) {
        for (int i = 0; i < companyEmployeeWageArray.size(); i++) {
            String name = companyEmployeeWageArray.get(i).companyName;
            if (name.equals(companyName)) {
                int totalWage = companyEmployeeWageArray.get(i).totalEmployeeWage;
                System.out.println(companyName + " TOTAL EMPLOYEE WAGE IS " + totalWage);
                break;
            } else {
                continue;
            }
        }
    }


}

