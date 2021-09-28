package de.die_gfi.oliver.demo2.logic;

import java.util.ArrayList;

public class Bestellung {

    Person person;
    Speise speise;

    static ArrayList<Bestellung> bestellungen = new ArrayList<>();

    public Bestellung(Person person, Speise speise) {
        this.person = person;
        this.speise = speise;
        bestellungen.add(this);
        speise.bestelle();

    }

    public static ArrayList<Bestellung> getBestellungen() {
        return bestellungen;
    }


}
