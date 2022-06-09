package com.employeWage;


//uc11 ability to manage employeewage for multiple companies using interface implements
public class EmployeeWage implements InterfaceCompanyEmployeeWage {

    //constant variables
    static final int isPresent = 1;
    static final int isParttime = 2;

    int numberOfCompanies = 0; //uc10 variable

    //initializing array
    CompanyEmployeeWage[] companyEmployeeWageArray = new CompanyEmployeeWage[5];

    //getter and setter for total employee wage


    //adding company details into array
    public void addCompanyEmployeeWage(String companyName, int totalWorkingDays, int maximumWorkingHours, int wagePerHour) {
        companyEmployeeWageArray[numberOfCompanies] = new CompanyEmployeeWage(companyName, totalWorkingDays, maximumWorkingHours, wagePerHour);
        numberOfCompanies++;
    }

    //setting total employee wage in an array for multiple companies
    public void computationOfEmployeeWage() {
        for (int i = 0; i < numberOfCompanies; i++) {
            companyEmployeeWageArray[i].setTotalEmployeeWage(this.computationOfEmployeeWage(companyEmployeeWageArray[i]));
            System.out.println(companyEmployeeWageArray[i]);
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
            totalEmployeeHours += employeeHours;
            employeeWage = employeeHours * companyEmployeeWage.wagePerHour;
            companyEmployeeWage.totalEmployeeWage = companyEmployeeWage.totalEmployeeWage + employeeWage;
        }
        return companyEmployeeWage.totalEmployeeWage; //returning to total employee wage

    }


}



