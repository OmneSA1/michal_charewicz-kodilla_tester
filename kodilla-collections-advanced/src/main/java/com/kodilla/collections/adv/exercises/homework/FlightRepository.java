package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Paryż"));
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Paryż", "Berlin"));
        return flights;
    }
}
