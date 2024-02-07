import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Saver {
    //placeholder code
    //wäre cool wenn der saver abhängig vom username dateien läd. Sodass mehrere leute gleichzeitig was machen könenn
    public boolean save(Haushaltsabrechnung h) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter("Haushaltsabrechnung.txt")) {
            Set<Entry<Integer, Eintrag>> entrySet = h.get_Abrechnung().entrySet();
            out.printf("⌜------------------------Haushaltsabrechnung------------------------⌝%n");
            out.printf("| %-20s | %-6s | %7s | %10s | %10s |%n", "Objektname", "Monate", "Gezahlt", "Angefallen", "Restbetrag");
            out.printf("|-------------------------------------------------------------------|%n");
            for (Map.Entry<Integer, Eintrag> entry : entrySet) {
                Eintrag eintrag = entry.getValue();
                //System.out.println(entry.getKey() +" | " + eintrag.getObjektname() + " | " + eintrag.getGueltigeMonate() + " | " + eintrag.getGezahlterBetrag() + " | " + eintrag.getTatsaechlicherBetrag() + " | " + eintrag.getRestbetrag()+ " |");
                out.printf("| %-20s | %-6s | %7s | %10s | %10s |%n", eintrag.getObjektname(), eintrag.getGueltigeMonate(),  eintrag.getGezahlterBetrag(), eintrag.getTatsaechlicherBetrag(), eintrag.getRestbetrag());
            }
            out.printf("|-------------------------------------------------------------------|%n");
            out.printf("| %-20s | %-6s | %7s | %10s | %10s |%n", "Gesamtbeträge", "------",  h.getSummeGezBetr(), h.getSummeTatBetr(), h.getOffenerBetrag());
            out.printf("⌞-------------------------------------------------------------------⌟%n");
            
        }
        return true;
    }

    public Haushaltsabrechnung load() {
        System.err.println("Loaded sucessfully!");
        return new Haushaltsabrechnung();
    }
}
