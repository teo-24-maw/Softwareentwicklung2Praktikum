import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private Dozierender dozent;
    private List<Studierender> teilnehmer = new ArrayList<>();
    private List<Vorlesungsstunde> vorlesungen = new ArrayList<>();
    private List<Praktikumsstunde> praktika = new ArrayList<>();

    public Lehrveranstaltung(String titel, Dozierender dozent) {
        this.titel = titel;
        this.dozent = dozent;
    }

    public void studierenderHinzufuegen(Studierender s) {
        teilnehmer.add(s);
    }

    public void studierenderEntfernen(Studierender s) {
        teilnehmer.remove(s);
    }

    public void vorlesungHinzufuegen(Vorlesungsstunde v) {
        vorlesungen.add(v);
    }

    public void praktikumHinzufuegen(Praktikumsstunde p) {
        praktika.add(p);
    }

    public void detailsAnzeigen() {
        System.out.println("Lehrveranstaltung: " + titel);
        System.out.println("Dozent: " + dozent.getName());

        System.out.println("Teilnehmer:");
        for (Studierender s : teilnehmer) {
            System.out.println("- " + s.getName());
        }

        System.out.println("Vorlesungen:");
        for (Vorlesungsstunde v : vorlesungen) {
            v.detailsAnzeigen();
        }

        System.out.println("Praktika:");
        for (Praktikumsstunde p : praktika) {
            p.detailsAnzeigen();
        }
    }
}
