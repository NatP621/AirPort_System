package flight_search;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DepartureTimeSearch implements FlightSearch{

    // The method sorts flights from earliest to latest, it uses the departure time value to sort
    @Override
    public List<Flight> search(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparingDouble(Flight::getDeparture_time));
        return flights;
    }
}
