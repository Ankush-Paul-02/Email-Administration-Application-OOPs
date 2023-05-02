public class App {
    public static void main(String[] args) {
        Email email = new Email("Ankush", "Paul");

        email.setAlternateEmail("trex.gmail.com");

        System.out.println("Your alternate email is: " + email.getAlternateEmail());

        System.out.println(email);

    }
}
