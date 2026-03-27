public class Main {
    public static void main(String[] args) {

        Dozierender dozent = new Dozierender("Prof. Stahl", "Informatik", "B123");
        Studierender s1 = new Studierender("Eddy", 12345, "UX Design");

        // Interaktion testen
        s1.frageStellen(dozent, "Was ist OOP?");
        s1.sprechstundeAnfragen(dozent, "Montag 13:15", "Projekt");

        dozent.feedbackErhalten(s1, "Sehr gute Vorlesung!");
        dozent.zeigeFeedback();

        // Lehrveranstaltung
        Lehrveranstaltung lv = new Lehrveranstaltung("Programmierung 1", dozent);

        lv.studierenderHinzufuegen(s1);

        Vorlesungsstunde v1 = new Vorlesungsstunde("Einführung", "01.04", "10:00", "A1");
        Praktikumsstunde p1 = new Praktikumsstunde("Übung 1", "02.04", "12:00", "B2", "Java Basics");

        lv.vorlesungHinzufuegen(v1);
        lv.praktikumHinzufuegen(p1);

        lv.detailsAnzeigen();
    }
}
