
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
        //constant variables
        final int isPresent = 1;
        final int wagePerHour = 20;
        final int isParttime = 2;
        //temporary variables
        int employeeHours = 0;
        int employeeWage = 0;
        /*finding employee is present or not using switch case*/
        int attandance = (int) Math.floor(Math.random() * 3);
        switch (attandance) {
            case isPresent:
                employeeHours = 8;
                System.out.println("EMPLOYEE IS FULLTIME..");
                break;
            case isParttime:
                employeeHours = 4;
                System.out.println("EMPLOYEE IS PARTTIME..");
                break;
            default:
                employeeHours = 0;
                System.out.println("EMPLOYEE IS ABSENT...");
        }
        //calclulating  employee dialy wage
        employeeWage=employeeHours*wagePerHour;
        System.out.println("EMPLOYEE WAGE: "+employeeWage);
    }
}

