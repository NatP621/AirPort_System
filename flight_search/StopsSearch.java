package flight_search;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StopsSearch implements FlightSearch{

    // The method sorts flights based on their number of stopovers, from fewest stopovers to most stopovers
    @Override
    public List<Flight> search(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparingDouble(Flight::getNumber_stops));
        return flights;
    }
}
