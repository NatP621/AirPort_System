package flight_search;

public class Flight {

    //Data
    private String flight_number;
    private double price;
    private double flight_duration ;
    private double number_stops ;
    private double departure_time;

    //Constructor
    public Flight(String flight_number, double price, int departure_time, int flight_duration, int number_stops) {
        this.flight_number = flight_number;
        this.price = price;
        this.departure_time = departure_time;
        this.flight_duration = flight_duration;
        this.number_stops = number_stops;
    }

    //Getter && Setter
    public String getFlight_number() {
        return flight_number;
    }
    public double getPrice() {
        return price;
    }
    public double getFlight_duration() {
        return flight_duration;
    }
    public double getNumber_stops() {
        return number_stops;
    }
    public double getDeparture_time() {
        return departure_time;
    }

}
