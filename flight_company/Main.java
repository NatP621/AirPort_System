package flight_company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<flight_company.Flight> createFlights() {
        List<flight_company.Flight> flights = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 3; i++) {
            String flightNumber = "F" + String.format("%03d", i);
            double price = random.nextDouble() * 1000 + 100;
            int departureTime = random.nextInt(1440);
            int duration = random.nextInt(600) + 60;
            int numberStops = random.nextInt(5);
            flights.add(new flight_company.Flight(flightNumber, price, departureTime, duration, numberStops));
        }
        return flights;
    }

        public static void main(String[] args) {

            List<flight_company.Flight> flights= createFlights();

            FlightComposite subCompany1 = new SubFlightCompany("sub company 1");
            ((SubFlightCompany) subCompany1).addFlight(flights.get(0));
            ((SubFlightCompany) subCompany1).addFlight(flights.get(1));

            FlightComposite subCompany2 = new SubFlightCompany("sub company 2");
            ((SubFlightCompany) subCompany2).addFlight(flights.get(2));
            ((SubFlightCompany) subCompany2).removeFlight(flights.get(2));

            FlightComposite mainCompany = new FlightCompany("company 1");
            ((FlightCompany) mainCompany).addSubCompany(subCompany1);
            ((FlightCompany) mainCompany).addSubCompany(subCompany2);
            ((FlightCompany) mainCompany).addFlight(flights.get(0));
            ((FlightCompany) mainCompany).addFlight(flights.get(1));

            mainCompany.report();
            System.out.println("Total Revenue: $" + mainCompany.getPrice());

            ((FlightCompany) mainCompany).removeSubCompany(subCompany2);
            System.out.println("--------------------------------------------");
            System.out.println("Total Revenue: $" + mainCompany.getPrice());

        }
    }