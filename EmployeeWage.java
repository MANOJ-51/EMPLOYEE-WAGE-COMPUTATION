public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
        //constant variables
        int isPresent = 1;
        int wagePerHour=20;
        //temporary variables
        int employeeHours=0;
        int employeeWage=0;
        /*finding employee is present or not*/
        int attandance = (int) Math.floor(Math.random() * 2);
        if (isPresent == attandance) {
            employeeHours=8;
        } else {
            employeeHours=0;
        }
        //calclulating  employee dialy wage
        employeeWage=employeeHours*wagePerHour;
        System.out.println("EMPLOYEE WAGE: "+employeeWage);
    }
}
