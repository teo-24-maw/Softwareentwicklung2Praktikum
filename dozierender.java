import java.util.ArrayList;
import java.util.List;

public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;

    private List<String> feedbackListe = new ArrayList<>();

    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    // Frage beantworten
    public void frageBeantworten(Studierender studierender, String frage) {
        System.out.println(name + " beantwortet die Frage von " 
            + studierender.getName() + ": Gute Frage!");
    }

    // Sprechstundenanfrage empfangen
    public void empfangeSprechstundenanfrage(Studierender studierender, String termin, String thema) {
        System.out.println(name + " hat eine Anfrage von " 
            + studierender.getName() + " erhalten für " + termin);
    }

    // Feedback erhalten
    public void feedbackErhalten(Studierender studierender, String feedback) {
        String eintrag = studierender.getName() + ": " + feedback;
        feedbackListe.add(eintrag);
    }

    // Feedback anzeigen
    public void zeigeFeedback() {
        System.out.println("Feedback für " + name + ":");
        for (String f : feedbackListe) {
            System.out.println("- " + f);
        }
    }

    public String getName() {
        return name;
    }
}