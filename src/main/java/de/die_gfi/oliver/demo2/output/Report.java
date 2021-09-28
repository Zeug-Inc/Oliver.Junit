package de.die_gfi.oliver.demo2.output;

import de.die_gfi.oliver.demo2.logic.Speise;
import de.die_gfi.oliver.demo2.logic.Speiseplan;

public class Report {

    public static void druckeBestellungsListe(Speiseplan speiseplan) {

        System.out.println("--- Montag ---");
        if (speiseplan.getMontag() != null) {
            for (Speise y : speiseplan.getMontag()) {
                System.out.println(y.getBezeichnung() + ":  " + y.getAnzahlBestellungen());
            }
        }

        System.out.println("--- Dienstag ---");
        if (speiseplan.getDienstag() != null) {
            for (Speise y : speiseplan.getDienstag()) {
                System.out.println(y.getBezeichnung() + ":  " + y.getAnzahlBestellungen());
            }
        }

        System.out.println("--- Mittwoch ---");
        if (speiseplan.getMittwoch() != null) {
            for (Speise y : speiseplan.getMittwoch()) {
                System.out.println(y.getBezeichnung() + ":  " + y.getAnzahlBestellungen());
            }
        }

        System.out.println("--- Donnerstag ---");
        if (speiseplan.getDonnerstag() != null) {
            for (Speise y : speiseplan.getDonnerstag()) {
                System.out.println(y.getBezeichnung() + ":  " + y.getAnzahlBestellungen());
            }
        }

        System.out.println("--- Freitag ---");
        if (speiseplan.getFreitag() != null) {
            for (Speise y : speiseplan.getFreitag()) {
                System.out.println(y.getBezeichnung() + ":  " + y.getAnzahlBestellungen());
            }
        }

    }


}
