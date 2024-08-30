package flight_search;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DurationSearch implements FlightSearch{

    // The method sorts flights based on their flight duration, from shortest to longest
    @Override
    public List<Flight> search(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparingDouble(Flight::getFlight_duration));
        return flights;
    }
}
