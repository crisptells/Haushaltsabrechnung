public class Eintrag {
    private String Objektname;
    private int GueltigeMonate;
    private double GezahlterBetrag;
    private double TatsaechlicherBetrag;
    private double Restbetrag;

    public Eintrag(String objektname, int gueltigeMonate, double gezahlterBetrag, double tatsaechlicherBetrag) throws WrongInputException {
        setObjektname(objektname);
        setGueltigeMonate(gueltigeMonate);
        setGezahlterBetrag(gezahlterBetrag);
        setTatsaechlicherBetrag(tatsaechlicherBetrag);
        setRestbetrag(calculate_difference(gezahlterBetrag, tatsaechlicherBetrag, gueltigeMonate));
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
    public void setGueltigeMonate(int gueltigeMonate) throws WrongInputException {
        if (gueltigeMonate > 12 || gueltigeMonate < 1) {
            throw new WrongInputException("Ungültige Monazsanzahl!");
        }
        GueltigeMonate = gueltigeMonate;
    }
    public void setGezahlterBetrag(double gezahlterBetrag) throws WrongInputException {
        if (gezahlterBetrag < 0) {
            throw new WrongInputException("Gezahlter Betrag kann nicht kleiner 0 sein!");
        }
        GezahlterBetrag = gezahlterBetrag;
    }
    public void setTatsaechlicherBetrag(double tatsaechlicherBetrag) throws WrongInputException {
        if (tatsaechlicherBetrag < 0) {
            throw new WrongInputException("Tatsächlich angefallener Betrag kann nicht kleiner 0 sein!");
        }
        TatsaechlicherBetrag = tatsaechlicherBetrag;
    }
    public void setRestbetrag(double restbetrag) {
        Restbetrag = restbetrag;
    }

    //Calculation
    public double calculate_difference(double gezBetrag, double tatBetrag, int monate) {
        return ((tatBetrag / 12) * monate) - gezBetrag;
    }
}
