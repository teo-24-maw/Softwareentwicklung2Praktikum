public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;

    // Konstruktor
    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public String getName() {
        return name;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public String getBueronummer() {
        return bueronummer;
    }

    public String frageBeantworten(Studierender s, String frage) {
        return "Dozierender " + name + " beantwortet die Frage von "
                + s.getName() + ": \"" + frage + "\"";
    }
}