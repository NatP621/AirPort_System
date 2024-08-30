package flight_search;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PriceSearch implements FlightSearch{

    // The method sorts flights based on their price, from cheapest to most expensive
    @Override
    public List<Flight> search(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparingDouble(Flight::getPrice));
        return flights;
    }
}
