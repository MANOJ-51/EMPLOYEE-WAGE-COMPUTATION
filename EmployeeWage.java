public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
        int isPresent = 1;
        int attandance = (int) Math.floor(Math.random() * 2);
        if (isPresent == attandance) {
            System.out.println("EMPLOYEE IS PRESENT");
        } else {
            System.out.println("EMPLOYEE IS ABSENT");
        }
    }
}
