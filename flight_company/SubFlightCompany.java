package flight_company;

import java.util.ArrayList;
import java.util.List;
public class SubFlightCompany implements FlightComposite {

    // Data
    private String companyName;
    private List<FlightComposite> flights = new ArrayList<>();

    // Constructor
    public SubFlightCompany(String companyName) {
        this.companyName = companyName;
    }


    public void addFlight(FlightComposite flight) {
        flights.add(flight);
    }
    public void removeFlight(FlightComposite flight) {
        flights.remove(flight);
    }
    @Override
    public void report() {
        System.out.println("Sub-Flight Company: " + companyName);
        for (FlightComposite subCompany : flights) {
            subCompany.report();
        }
    }
    @Override
    public double getPrice() {
        double revenue = 0;
        for (FlightComposite subCompany : flights) {
            revenue += subCompany.getPrice();
        }
        return revenue;
    }
}
