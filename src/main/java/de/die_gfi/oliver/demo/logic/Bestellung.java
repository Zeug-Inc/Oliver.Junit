package de.die_gfi.oliver.demo.logic;

public class Bestellung {

    Person p;
    Gericht mon;
    Gericht die;
    Gericht mit;
    Gericht don;
    Gericht fre;

    public Bestellung(Person p, Gericht mon, Gericht die, Gericht mit, Gericht don, Gericht fre) {

        this.p = p;
        p.setBestellung(this);

        this.mon = mon;
        if (mon != null) {
            mon.bestelle();
        }

        this.die = die;
        if (die != null) {
            die.bestelle();
        }

        this.mit = mit;
        if (mit!= null) {
            mit.bestelle();
        }

        this.don = don;
        if (don != null) {
            don.bestelle();
        }

        this.fre = fre;
        if (fre != null) {
            fre.bestelle();
        }
    }
}
