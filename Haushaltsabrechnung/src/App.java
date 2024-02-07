import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Printer printer = new Printer();
        Saver saver = new Saver();
        Haushaltsabrechnung abrechung = new Haushaltsabrechnung();
        Scanner inputScanner = new Scanner(System.in);
        String username;

        System.out.println("please enter your name");
        username = inputScanner.nextLine();
        System.out.println("Erfolgreich als " + username + " angemeldet!");

        while (true) {
            String command = inputScanner.nextLine();
            //commands
            if (command.equals("quit")) {
                System.err.println("Bye Bye");
                break;
            }

            if (command.equals("add") || command.equals("hinzufügen")) {
                System.out.println("Bitte Eintrag Objektname, Gültige Monate 1-12, Gezahlter Betrag, Tatsächlich angefallener Betrag eingeben");
                String neuerEintrag = inputScanner.nextLine();
                String[] eintrag = neuerEintrag.split(",");
                int index = abrechung.add_eintrag(new Eintrag(eintrag[0], Integer.parseInt(eintrag[1]), Double.parseDouble(eintrag[2]), Double.parseDouble(eintrag[3])));
                System.out.println("Eintrag auf Stelle " + index + " gespeichert");
            }

            if (command.equals("save")) {
                saver.save(abrechung);
            }

            if (command.equals("print")) {
                printer.printAbrechnung(abrechung); 
            }

        }
        inputScanner.close();
        printer.printAbrechnung(abrechung);

    }
}
