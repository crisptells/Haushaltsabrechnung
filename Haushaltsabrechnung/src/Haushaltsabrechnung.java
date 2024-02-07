import java.util.HashMap;
import java.util.Map;

public class Haushaltsabrechnung {

    private HashMap<Integer, Eintrag> haushaltsabrechnung_table = new HashMap<Integer, Eintrag>();
    private int table_index;

    public int add_eintrag(Eintrag e) {
        //eintrag adden
        haushaltsabrechnung_table.put(table_index, e);
        table_index++;
        return table_index-1;
    }

    public double getOffenerBetrag() {
        double result = 0;
        for (Map.Entry<Integer, Eintrag> entry : haushaltsabrechnung_table.entrySet()) {
                Eintrag eintrag = entry.getValue();
                result = result + eintrag.getRestbetrag();
            }
        return result;
    }

    public double getSummeGezBetr() {
        double result = 0;
        for (Map.Entry<Integer, Eintrag> entry : haushaltsabrechnung_table.entrySet()) {
                Eintrag eintrag = entry.getValue();
                result = result + eintrag.getGezahlterBetrag();
            }
        return result;
    }

    public double getSummeTatBetr() {
        double result = 0;
        for (Map.Entry<Integer, Eintrag> entry : haushaltsabrechnung_table.entrySet()) {
                Eintrag eintrag = entry.getValue();
                result = result + eintrag.getTatsaechlicherBetrag();
            }
        return result;
    }

    public boolean delete_eintrag(int i) {
        haushaltsabrechnung_table.remove(i);
        return true;
    }

    public HashMap<Integer, Eintrag> get_Abrechnung() {
        return haushaltsabrechnung_table;
    }

    public Eintrag get_Eintrag(int index) {
        return haushaltsabrechnung_table.get(index);
    }
}
