import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Printer {
    public void printAbrechnung (Haushaltsabrechnung abrechnung) {
        //for loop durch H durch - dann pro eintrag einmal alles in einen String und output!
        Set<Entry<Integer, Eintrag>> entrySet = abrechnung.get_Abrechnung().entrySet();
        if (entrySet.size() == 0) {
            System.out.println("Haushaltsabrechnung leer!");
        } else {
            System.out.printf("⌜------------------------Haushaltsabrechnung------------------------⌝%n");
            System.out.printf("| %-20s | %-6s | %7s | %10s | %10s |%n", "Objektname", "Monate", "Gezahlt", "Angefallen", "Restbetrag");
            System.out.printf("|-------------------------------------------------------------------|%n");
            for (Map.Entry<Integer, Eintrag> entry : entrySet) {
                Eintrag eintrag = entry.getValue();
                //System.out.println(entry.getKey() +" | " + eintrag.getObjektname() + " | " + eintrag.getGueltigeMonate() + " | " + eintrag.getGezahlterBetrag() + " | " + eintrag.getTatsaechlicherBetrag() + " | " + eintrag.getRestbetrag()+ " |");
                System.out.printf("| %-20s | %-6s | %7s | %10s | %10s |%n", eintrag.getObjektname(), eintrag.getGueltigeMonate(),  eintrag.getGezahlterBetrag(), eintrag.getTatsaechlicherBetrag(), eintrag.getRestbetrag());
            }
            double offenerBetrag = abrechnung.getOffenerBetrag();
            if (offenerBetrag <= 0) {
            System.out.printf("|-------------------------------------------------------------------|%n");
            System.out.printf("| %-20s | %-6s | %7s | %10s | %19s |%n", "Gesamtbeträge", "------",  abrechnung.getSummeGezBetr(), abrechnung.getSummeTatBetr(), "\u001B[32m" + offenerBetrag + "\u001B[0m");
            System.out.printf("⌞-------------------------------------------------------------------⌟%n");
            } else {
            System.out.printf("|-------------------------------------------------------------------|%n");
            System.out.printf("| %-20s | %-6s | %7s | %10s | %19s |%n", "Gesamtbeträge", "------",  abrechnung.getSummeGezBetr(), abrechnung.getSummeTatBetr(), "\u001B[31m" + offenerBetrag + "\u001B[0m");
            System.out.printf("⌞-------------------------------------------------------------------⌟%n");
            }
        }
    }
}
