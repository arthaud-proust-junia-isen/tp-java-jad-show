package com.jad.customer;

import com.jad.show.*;

public interface ISpectator {
    String getFirstName();

    String getLastName();

    void watch(IShow show);
    void watch(ConcertShow show);
    void watch(MovieShow show);
    void watch(StreetShow show);
    void watch(TheaterShow show);
}
