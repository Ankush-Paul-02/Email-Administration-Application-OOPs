import java.util.*;

public class Email {
    static Scanner sc = new Scanner(System.in);
    private String firstName, lastName, password, department, alternateEmail;

    private int mailBoxCapacity, defaultPasswordLength = 10;

    /**
     * Constructor
     * 
     * @param firstName  receive first name and set
     * @param lastName   receive last name and set
     */
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        
        //! Call a method asking for department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //! Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " + this.password);
    }

    /**
     * @return the department
     */
    private String setDepartment() {
        System.out.println("DEPARTMENT CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        int departmentChoice = sc.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "dev";
        } else if (departmentChoice == 3) {
            return "acc";
        } else {
            return "";
        }
    }


    /**
     * @param length of the password
     * @return a random password
     */
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";

        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
