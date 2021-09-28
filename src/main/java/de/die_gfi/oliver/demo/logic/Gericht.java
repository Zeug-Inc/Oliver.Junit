package de.die_gfi.oliver.demo.logic;

public class Gericht {

    String bezeichnung;
    double preis;
    int anzahl;

    public Gericht(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.anzahl = 0;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void bestelle() {
        anzahl++;
    }
}
