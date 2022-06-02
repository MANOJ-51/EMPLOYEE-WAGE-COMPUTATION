public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
        //constant variables
        final int isPresent = 1;
        final int wagePerHour = 20;
        final int isParttime = 2;
        final int totalWorkingDays = 20;
        //temporary variables
        int employeeHours = 0;
        int employeeWage = 0;
        int totalEmployeeWage = 0;
        /*finding employee is present or not using switch case*/
        for (int day = 1; day < totalWorkingDays; day++) {
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
            employeeWage = employeeHours * wagePerHour;
            totalEmployeeWage = totalEmployeeWage + employeeWage;
            System.out.println("EMPLOYEE DAY .."+day+"EMPLOYEE INCOME."+employeeWage);
        }
        System.out.println("EMPLOYE WAGE FOR MONTH : " + totalEmployeeWage);
    }
}

