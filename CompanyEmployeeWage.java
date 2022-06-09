package com.employeWage;

interface InterfaceCompanyEmployeeWage {
    public abstract void addCompanyEmployeeWage(String companyName, int totalWorkingDays, int maximumWorkingHours, int wagePerHour);

    public abstract void computationOfEmployeeWage();

    public abstract void getTotalWage(String companyName); //uc14

    public class CompanyEmployeeWage {


        //uc10 constant variables
        final String companyName;
        final int totalWorkingDays;
        final int maximumWorkingHours;
        final int wagePerHour;

        int totalEmployeeWage;     //uc10 variable

        public CompanyEmployeeWage(String companyName, int totalWorkingDays, int maximumWorkingHours, int wagePerHour) {

            this.companyName = companyName;
            this.totalWorkingDays = totalWorkingDays;
            this.maximumWorkingHours = maximumWorkingHours;
            this.wagePerHour = wagePerHour;
        }

        public int getTotalEmployeeWage() {
            return totalEmployeeWage;
        }
//initializing constructors

        public void setTotalEmployeeWage(int totalEmployeeWage) {
            this.totalEmployeeWage = totalEmployeeWage;
        }

        @Override  //overriding tostring method to rretun in required string formate
        public String toString() {
            return companyName + " " + "EMPLOYEE TOTAL WAGE : " + totalEmployeeWage;
        }

    }
}
