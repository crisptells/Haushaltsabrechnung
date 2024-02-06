import java.util.HashMap;

public class Haushaltsabrechnung {

    private HashMap<Integer, Eintrag> haushaltsabrechnung_table = new HashMap<Integer, Eintrag>();
    private int table_index;

    public int add_eintrag(Eintrag e) {
        //eintrag adden
        haushaltsabrechnung_table.put(table_index, e);
        table_index++;
        return table_index-1;
    }

    public boolean delete_eintrag(int i) {
        haushaltsabrechnung_table.remove(i);
        return true;
    }

    public HashMap<Integer, Eintrag> get_Abrechnung() {
        return null;
    }

    public Eintrag get_Eintrag(int index) {
        return haushaltsabrechnung_table.get(index);
    }
}
