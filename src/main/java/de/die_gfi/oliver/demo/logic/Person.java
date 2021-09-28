package de.die_gfi.oliver.demo.logic;

import java.security.InvalidParameterException;

public class Person {

    String firstName;
    String lastName;

    public void setBestellung(Bestellung bestellung) {

        if (this.bestellung == null) {
            this.bestellung = bestellung;
        } else {
            throw new BestellungsException("Doppelbestellung: Es wurde schon bestellt");
        }
    }

    Bestellung bestellung;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
