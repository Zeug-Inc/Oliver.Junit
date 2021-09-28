package de.die_gfi.oliver.demo.logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Speiseplan {

    ArrayList<Gericht> mon;
    ArrayList<Gericht> die;
    ArrayList<Gericht> mit;
    ArrayList<Gericht> don;
    ArrayList<Gericht> fre;

    public Speiseplan(ArrayList<Gericht> mon, ArrayList<Gericht> die, ArrayList<Gericht> mit, ArrayList<Gericht> don, ArrayList<Gericht> fre) {
        this.mon = mon;
        this.die = die;
        this.mit = mit;
        this.don = don;
        this.fre = fre;
    }

    public ArrayList<Gericht> getMon() {
        return mon;
    }

    public ArrayList<Gericht> getDie() {
        return die;
    }

    public ArrayList<Gericht> getMit() {
        return mit;
    }

    public ArrayList<Gericht> getDon() {
        return don;
    }

    public ArrayList<Gericht> getFre() {
        return fre;
    }
}
