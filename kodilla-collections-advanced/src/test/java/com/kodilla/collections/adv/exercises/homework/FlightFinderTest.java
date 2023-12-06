package com.kodilla.collections.adv.exercises.homework;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class FlightFinderTest {

    @Test
   public void testFindFlightsFrom() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        String departureCity = "Warszawa";

        // When
        List<Flight> result = flightFinder.findFlightsFrom(departureCity);

        // Then
        assertNotNull(result);
        assertFalse(result.isEmpty());
        for (Flight flight : result) {
            assertEquals(departureCity, flight.getDeparture());
        }
    }

    @Test
    public void testFindFlightsTo() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        String arrivalCity = "Londyn";

        // When
        List<Flight> result = flightFinder.findFlightsTo(arrivalCity);

        // Then
        assertNotNull(result);
        assertFalse(result.isEmpty());
        for (Flight flight : result) {
            assertEquals(arrivalCity, flight.getArrival());
        }
    }
}
