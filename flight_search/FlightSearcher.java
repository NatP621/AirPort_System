package flight_search;
import java.util.List;

public class FlightSearcher {
    private FlightSearch search_strategy;
    public void setSearchStrategy(FlightSearch searchStrategy) {
        this.search_strategy = searchStrategy;
    }
    public List<Flight> search(List<Flight> flights) {
        return search_strategy.search(flights);
    }
}