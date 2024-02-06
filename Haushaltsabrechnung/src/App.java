import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Haushaltsabrechnung abrechung = new Haushaltsabrechnung();
        Scanner inputScanner = new Scanner(System.in);
        String username;

        System.out.println("please enter your name");
        username = inputScanner.nextLine();
        System.out.println("Erfolgreich als " + username + " angemeldet!");

        while (true) {
            String command = inputScanner.nextLine();
            System.out.println(command);
            if (command.equals("quit")) {
                System.out.print("??");
                System.err.println("Bye Bye");
                break;
            }
        }
    }
}
