import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Printer {
    public Printer() {
        System.out.println("First Print!");

    }

    public void printAbrechnung (Haushaltsabrechnung abrechnung) {
        System.out.println("<---Start----Haushaltsabrechnung---->");
        System.out.println("I | Objektname | Monate | Gezahlt | Angefallen | Restbetrag |");
        //for loop durch H durch - dann pro eintrag einmal alles in einen String und output!
        Set<Entry<Integer, Eintrag>> entrySet = abrechnung.get_Abrechnung().entrySet();
        if (entrySet.size() == 0) {
            System.out.println("Haushaltsabrechnung leer!");
        } else {
            for (Map.Entry<Integer, Eintrag> entry : entrySet) {
                Eintrag eintrag = entry.getValue();
                System.out.println(entry.getKey() +" | " + eintrag.getObjektname() + " | " + eintrag.getGueltigeMonate() + " | " + eintrag.getGezahlterBetrag() + " | " + eintrag.getTatsaechlicherBetrag() + " | " + eintrag.getRestbetrag()+ " |");
            }
        }
        System.out.println("<----Ende----Haushaltsabrechnung---->");
    }
}
