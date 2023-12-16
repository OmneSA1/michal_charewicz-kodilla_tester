package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("LasPalmas", false);
        airports.put("Warsaw", true);
        return airports;
    }

 public boolean isAirportInUser(String airport) throws AirportNotFoundException {
        if(getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
 }
}
