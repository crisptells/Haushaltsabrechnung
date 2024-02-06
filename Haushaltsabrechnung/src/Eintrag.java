public class Eintrag {
    private String Objektname;
    private int GueltigeMonate;
    private double GezahlterBetrag;
    private double TatsaechlicherBetrag;
    private double Restbetrag;

    public Eintrag(String objektname, int gueltigeMonate, double gezahlterBetrag, double tatsaechlicherBetrag) {
        Objektname = objektname;
        GueltigeMonate = gueltigeMonate;
        GezahlterBetrag = gezahlterBetrag;
        TatsaechlicherBetrag = tatsaechlicherBetrag;
    }

    //Getters
    public String getObjektname() {
        return Objektname;
    }
    public int getGueltigeMonate() {
        return GueltigeMonate;
    }
    public double getGezahlterBetrag() {
        return GezahlterBetrag;
    }
    public double getTatsaechlicherBetrag() {
        return TatsaechlicherBetrag;
    }
    public double getRestbetrag() {
        return Restbetrag;
    }

    //Setters
    public void setObjektname(String objektname) {
        Objektname = objektname;
    }
    public void setGueltigeMonate(int gueltigeMonate) {
        if (gueltigeMonate > 12 || gueltigeMonate < 1) {
            System.err.println("Ungültige Monatsanzahl!");
            return;
        }
        GueltigeMonate = gueltigeMonate;
    }
    public void setGezahlterBetrag(double gezahlterBetrag) {
        GezahlterBetrag = gezahlterBetrag;
    }
    public void setTatsaechlicherBetrag(double tatsaechlicherBetrag) {
        TatsaechlicherBetrag = tatsaechlicherBetrag;
    }
    public void setRestbetrag(double restbetrag) {
        Restbetrag = restbetrag;
    }
}
