package flight_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<Flight> createFlights() {
        List<Flight> flights = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            String flightNumber = "F" + String.format("%03d", i);
            double price = random.nextDouble() * 1000 + 100;
            int departureTime = random.nextInt(1440);
            int duration = random.nextInt(600) + 60;
            int numberStops = random.nextInt(5);
            flights.add(new Flight(flightNumber, price, departureTime, duration, numberStops));
        }
        return flights;
    }
    private static void printFlights(List<Flight> flights) {
        for (Flight flight : flights) {
            System.out.println("Flight Number: " + flight.getFlight_number() +
                    ", Price: $" + flight.getPrice() +
                    ", Departure Time: " + flight.getDeparture_time() +
                    ", Duration: " + flight.getFlight_duration() +
                    ", Number of Stops: " + flight.getNumber_stops());
        }
        System.out.println("---------------------------------------------------------");
    }
    public static void main(String[] args) {

        List<Flight> flights = createFlights();

        FlightSearcher searcher = new FlightSearcher();

        searcher.setSearchStrategy(new PriceSearch());
        List<Flight> flightsByPrice = searcher.search(flights);
        printFlights(flightsByPrice);

        searcher.setSearchStrategy(new StopsSearch());
        List<Flight> flightsByStops = searcher.search(flights);
        printFlights(flightsByStops);

        searcher.setSearchStrategy(new DurationSearch());
        List<Flight> flightsByDuration = searcher.search(flights);
        printFlights(flightsByDuration);

        searcher.setSearchStrategy(new DepartureTimeSearch());
        List<Flight> flightsByDepartureTime = searcher.search(flights);
        printFlights(flightsByDepartureTime);

    }
}