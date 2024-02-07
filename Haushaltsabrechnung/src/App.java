import java.util.Scanner;

public class App {
    public static String username;
    public static String password;
    public static void main(String[] args) throws Exception {
        //initialize objects
        Printer printer = new Printer();
        Saver saver = new Saver();
        UserManager userManager = new UserManager();
        Haushaltsabrechnung abrechung = new Haushaltsabrechnung();
        Scanner inputScanner = new Scanner(System.in);
        boolean logged_in = false;

        //while not logged in, nothing can be done
        while (!logged_in) {
            System.out.println(ConsoleColors.BLUE_BRIGHT + "please enter your name" + ConsoleColors.RESET);
            username = inputScanner.nextLine();
            System.out.println(ConsoleColors.BLUE_BRIGHT + "please enter your password" + ConsoleColors.RESET);
            password = inputScanner.nextLine();
            logged_in = userManager.loginUser(username, password);
            if (logged_in) {
                System.out.println("\u001B[32m" + "Erfolgreich als " + username + " angemeldet! \u001B[0m");
            } else {
                System.out.println("\u001B[31m" + "Benutzername oder Passwort falsch! \u001B[0m");
            }
        }
        

        while (true) {
            String command = inputScanner.nextLine();
            //commands
            if (command.equals("quit")) {
                System.err.println("Bye Bye");
                break;
            }

            if (command.equals("add") || command.equals("hinzufügen")) {
                System.out.println("Bitte " + ConsoleColors.BLUE_BRIGHT + "Objektname"+ ConsoleColors.RESET +","+ ConsoleColors.BLUE_BRIGHT + "Gültige Monate 1-12"+ ConsoleColors.RESET +"," + ConsoleColors.BLUE_BRIGHT + "Gezahlter Betrag"+ ConsoleColors.RESET +","+ ConsoleColors.BLUE_BRIGHT +"Tatsächlich angefallener Betrag"+ ConsoleColors.RESET+" eingeben");
                String neuerEintrag = inputScanner.nextLine();
                String[] eintrag = neuerEintrag.split(",");
                int index = abrechung.add_eintrag(new Eintrag(eintrag[0], Integer.parseInt(eintrag[1]), Double.parseDouble(eintrag[2]), Double.parseDouble(eintrag[3])));
                System.out.println(ConsoleColors.GREEN_BACKGROUND + "Eintrag auf Stelle " + index + " gespeichert"+ConsoleColors.RESET);
            }

            if (command.equals("save")) {
                saver.save(abrechung);
            }

            if (command.equals("print")) {
                printer.printAbrechnung(abrechung); 
            }

            if (command.equals("delete user")) {
                
            }

        }
        inputScanner.close();
        printer.printAbrechnung(abrechung);

    }
}
