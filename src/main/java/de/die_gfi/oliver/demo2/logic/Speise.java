package de.die_gfi.oliver.demo2.logic;

import java.security.InvalidParameterException;

public class Speise {

    String bezeichnung;
    double preis;
    int anzahlBestellungen;

    public Speise(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;

        if (preis < 0) {
            throw new InvalidParameterException("Preis kleiner Null ist nicht möglich");
        }
    }

    public double getPreis() {
        return preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getAnzahlBestellungen() {
        return anzahlBestellungen;
    }

    public void bestelle() {
        anzahlBestellungen++;
    }
}
