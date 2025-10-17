package com.jad.customer;

import com.jad.show.*;

public class Spectator implements ISpectator {
    private final String firstName;
    private final String lastName;

    public Spectator(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void watch(IShow show) {
        show.watchedBy(this);
    }

    @Override
    public void watch(final MovieShow show) {
        System.out.println("\nJ'ai assisté au film "+show.getName()+" de "+show.getDirector()+" sorti en "+show.getYearOfRelease());
    }

    @Override
    public void watch(final StreetShow show) {
        System.out.println("\nJ'ai assisté au spectacle de rue "+show.getName());
        System.out.println("Il y a avait : "+String.join(", ", show.getPerformers()));
    }

    @Override
    public void watch(final TheaterShow show) {
        System.out.println("\nJ'ai assisté à la pièce de théâtre "+show.getName()+" de "+show.getDirector());
        System.out.println("Il y a avait : "+String.join(", ", show.getActors()));
    }

    @Override
    public void watch(final ConcertShow show) {
        System.out.println("\nJ'ai assisté au concert "+show.getName()+" de "+show.getArtist());
    }
}
