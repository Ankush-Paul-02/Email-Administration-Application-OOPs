import java.util.*;

public class Email {
    static Scanner sc = new Scanner(System.in);
    private String firstName, lastName, password, department, email, alternateEmail;
    private String companySuffix = "teamfuture.in";
    private int mailBoxCapacity = 500, defaultPasswordLength = 10;

    /**
     * Constructor
     * 
     * @param firstName receive first name and set
     * @param lastName  receive last name and set
     */
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // ! Call a method asking for department
        this.department = setDepartment();

        // ! Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + department + "@" + companySuffix;

        // ! Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " + this.password);

    }

    /**
     * @return the department
     */
    private String setDepartment() {
        System.out.println("DEPARTMENT CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        System.out.print("Enter the department code: ");
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
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    /**
     * @param capacity set to mailBox capacity
     */
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    /**
     * @param alternateEmail set it to alternate email
     */
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    /**
     * @param password change and set in the password
     */
    public void changePassword(String password) {
        this.password = password;
    }

    /**
     * @return mailbox capacity
     */
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    /**
     * @return alternate email
     */
    public String getAlternateEmail() {
        return alternateEmail;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Email: " + email + ", Department: " + department + ", Mailbox capacity: " + mailBoxCapacity;
    }

}
