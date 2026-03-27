public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    // Frage stellen
    public void frageStellen(Dozierender dozent, String frage) {
        System.out.println(name + " fragt: " + frage);
        dozent.frageBeantworten(this, frage);
    }

    // Sprechstundenanfrage
    public void sprechstundeAnfragen(Dozierender dozent, String termin, String thema) {
        System.out.println(name + " möchte eine Sprechstunde am " + termin + " zum Thema: " + thema);
        dozent.empfangeSprechstundenanfrage(this, termin, thema);
    }

    public String getName() {
        return name;
    }
}