package flight_company;
import java.util.ArrayList;
import java.util.List;

public class FlightCompany implements FlightComposite {

    // Data
    private String companyName;
    private List<FlightComposite> subCompanies = new ArrayList<>();

    // Constructor
    public FlightCompany(String companyName) {
        this.companyName = companyName;
    }


    public void addSubCompany(FlightComposite subCompany) {
        subCompanies.add(subCompany);
    }
    public void removeSubCompany(FlightComposite subCompany) {
        subCompanies.remove(subCompany);
    }
    public void addFlight(FlightComposite flight) {
        subCompanies.add(flight);
    }
    public void removeFlight(FlightComposite flight) {
        subCompanies.remove(flight);
    }
    @Override
    public void report() {
        System.out.println("Flight Company: " + companyName);
        for (FlightComposite subCompany : subCompanies) {
            subCompany.report();
        }
    }
    @Override
    public double getPrice() {
        double revenue = 0;
        for (FlightComposite subCompany : subCompanies) {
            revenue += subCompany.getPrice();
        }
        return revenue;
    }
}
