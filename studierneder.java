public class studierneder {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public studierneder(String name, int matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }
    public String frageStellen(String frage){
        return "Der Student " + name + " aus dem Studiengang " + studiengang + " stellt Ihnen die Frage: " + frage;
    }
    
    public String Sprechstundenanfrage(String frage, int tag, int uhrzeit){
        return "Der Student " + name + " aus dem Studiengang " + studiengang + " möchte einen Termin für die Sprechstunde am " + tag + " um " + uhrzeit + " Uhr vereinbaren und fragt: " + frage;
    }

}
