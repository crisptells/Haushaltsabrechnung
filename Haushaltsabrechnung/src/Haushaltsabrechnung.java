import java.util.HashMap;

public class Haushaltsabrechnung {

    private HashMap<Integer, Eintrag> haushaltsabrechnung_table = new HashMap<Integer, Eintrag>();
    private int table_index;

    public boolean add_eintrag() {
        return true;
    }

    public boolean delete_eintrag() {
        return true;
    }

    public HashMap<Integer, Eintrag> get_Abrechnung() {
        return null;
    }

    public Eintrag get_Eintrag(int index) {
        return haushaltsabrechnung_table.get(index);
    }
}
