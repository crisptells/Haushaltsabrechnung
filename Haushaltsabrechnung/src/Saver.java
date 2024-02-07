public class Saver {
    //placeholder code
    //wäre cool wenn der saver abhängig vom username dateien läd. Sodass mehrere leute gleichzeitig was machen könenn
    public boolean save(Haushaltsabrechnung h) {
        System.err.println("Saved sucessfully!");
        return true;
    }

    public Haushaltsabrechnung load() {
        System.err.println("Loaded sucessfully!");
        return new Haushaltsabrechnung();
    }
}
