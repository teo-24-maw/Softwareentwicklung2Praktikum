public class dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;

    // Konstruktor
    public dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    // Getterrrrrrrrrrrr
    public String getName() {
        return name;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public String getBueronummer() {
        return bueronummer;
    }

    // Methode: Frage beantworten
    public String frageBeantworten(Studierender s, String frage) {
        return "dozierender " + name + " beantwortet die Frage von "
                + s.getName() + ": \"" + frage + "\"";
    }
}