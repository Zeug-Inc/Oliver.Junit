package de.die_gfi.oliver.demo.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonTest {

    /**
     * A01. Das Programm soll es ermöglichen, Personen mit Vornamen und Nachname anzulegen.
     */
    @Test
    void testCreatePerson() {

        Person p = new Person("Peter", "Meier");

    }

    /**
     * A02. Das Programm soll es ermöglichen, für eine Woche (Montag bis Freitag)
     * einen Speiseplan mit für jeden Tag mehreren möglichen Optionen einzugeben.
     * <p>
     * A04. Der Speisplan soll auch funktionieren, wenn einzelne Tage ausfallen, z.B. wegen eines Feiertags.
     */

    @Test
    void testCreateSpeiseplan() {

        Speiseplan s;

        s = erzeugeSpeiseplan();
        //  new Speiseplan(mon, die, null, don, fre); // TODO: diesen Fall aktivieren
    }

    private Speiseplan erzeugeSpeiseplan() {

        Speiseplan s;
        ArrayList<Gericht> mon = new ArrayList<>(
                Arrays.asList(new Gericht("Veganes Schnitzel", 5.0), new Gericht("Forelle", 10.0)));

        ArrayList<Gericht> die = new ArrayList<>(
                Arrays.asList(new Gericht("Wels", 15.0), new Gericht("Tortellini", 7.0)));

        ArrayList<Gericht> mit = new ArrayList<>(
                Arrays.asList(new Gericht("Gemüsepfanne", 6.0), new Gericht("Bratkartoffeln", 7.0)));

        ArrayList<Gericht> don = new ArrayList<>(
                Arrays.asList(new Gericht("Steak", 12.0), new Gericht("Champignons", 7.0)));

        ArrayList<Gericht> fre = new ArrayList<>(
                Arrays.asList(new Gericht("Spaghetti", 7.0), new Gericht("Ravioli", 7.0)));

        return new Speiseplan(mon, die, mit, don, fre);
    }

    /**
     * A03. Das Programm soll es ermöglichen, für jede Speise einen Preis festzulegen.
     */
    @Test
    void testPreisfestlegen() {

        new Gericht("Rumpsteak", 20.0);
    }

    /** A05. Das Programm soll es ermöglichen, dass jede Person für einen
     * Tag eine Speise aus dem Speiseplan auswählen kann.
     */

    @Test
    void testBestelleSpeise() {

        Speiseplan s = erzeugeSpeiseplan();
        ArrayList<Gericht> mon = s.getMon();
        ArrayList<Gericht> die = s.getMon();
        ArrayList<Gericht> mit = s.getMon();
        ArrayList<Gericht> don = s.getMon();
        ArrayList<Gericht> fre = s.getMon();

        Person p = new Person("Franz", "Müller");
        Bestellung b = new Bestellung(p, mon.get(0), die.get(1), mit.get(0), don.get(1), null);

    }

    /** A06. Das Programm soll es ermöglichen, in Form einer Liste für alle Speisen die
        Anzahl der jeweiligen Bestellungen aufzulisten (für die Küche, um die Zutaten zu kaufen).
     */
    @Test
    void testListeAnzahlBestellungen() {

        Speiseplan s = erzeugeSpeiseplan();
        Gericht montagsGericht = s.getMon().get(0);
        int anzahl = montagsGericht.getAnzahl();
        Assertions.assertEquals(0, anzahl);
        Person p = new Person("Franz", "Müller");
        Bestellung b1 = new Bestellung(p, montagsGericht, null, null, null, null);
        Assertions.assertEquals(1, montagsGericht.getAnzahl());

        Person q = new Person("Lieschen", "Müller");
        Bestellung b2 = new Bestellung(q, montagsGericht, s.getDie().get(1), null, null, null);

        Person l = new Person("Anja", "Lorenz");
        Bestellung b3 = new Bestellung(l, null, null, null, null, null );

        Assertions.assertThrows(BestellungsException.class, () -> new Bestellung(l, s.getMon().get(0), s.getDie().get(0),
                s.getMit().get(0), s.getDon().get(0), s.getFre().get(0)));


        Assertions.assertEquals(2, s.getMon().get(0).getAnzahl());

        Assertions.assertThrows(BestellungsException.class,
                () ->  new Bestellung(l, s.getMon().get(1), null, null, null, null));


    }

}
