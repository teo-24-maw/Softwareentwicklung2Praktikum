public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
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
