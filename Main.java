public class Main {
    public static void main(String[] args) {
        Studierender s1 = new Studierender("Matteo", 12345, "Informatik");
        Dozierender d1 = new Dozierender("Dr. Müller", "Informatik", "Büro 101");

        String frage = "Wie funktioniert die Vererbung in Java?";
        System.out.println(s1.frageStellen(frage));
        System.out.println(d1.frageBeantworten(s1, frage));

        String sprechstundenfrage = "Kann ich einen Termin für die Sprechstunde vereinbaren?";
        System.out.println(s1.Sprechstundenanfrage(sprechstundenfrage, 15, 14));
    }
}
