package de.die_gfi.oliver.demo2.logic;

import java.util.ArrayList;
import java.util.Arrays;

import de.die_gfi.oliver.demo2.logic.Speise;
import de.die_gfi.oliver.demo2.output.Report;

public class Speiseplan {

    ArrayList<Speise> montag;
    ArrayList<Speise> dienstag;
    ArrayList<Speise> mittwoch;
    ArrayList<Speise> donnerstag;
    ArrayList<Speise> freitag;

    public Speiseplan(ArrayList<Speise> montag, ArrayList<Speise> dienstag, ArrayList<Speise> mittwoch, ArrayList<Speise> donnerstag, ArrayList<Speise> freitag) {

        this.montag = montag;
        this.dienstag = dienstag;
        this.mittwoch = mittwoch;
        this.donnerstag = donnerstag;
        this.freitag = freitag;

    }

    public ArrayList<Speise> getMontag() {
        return montag;
    }

    public ArrayList<Speise> getDienstag() {
        return dienstag;
    }

    public ArrayList<Speise> getMittwoch() {
        return mittwoch;
    }

    public ArrayList<Speise> getDonnerstag() {
        return donnerstag;
    }

    public ArrayList<Speise> getFreitag() {
        return freitag;
    }


    void druckeBestellungListe() {

        Report.druckeBestellungsListe(this);

    }

}
