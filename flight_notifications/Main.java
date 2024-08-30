package flight_notifications;

public class Main {
    public static void main(String[] args) {

        FlightNotificationSystem notificationSystem = new FlightNotificationSystem();

        Observer passenger1 = new Person("Person 1");
        Observer passenger2 = new Person("Person 2");
        Observer passenger3 = new Person("Person 3");
        Observer passenger4 = new Person("Person 4");
        Observer employee1 = new Person("Employee 1");
        Observer employee2 = new Person("Employee 2");

        notificationSystem.registerObserver(passenger1);
        notificationSystem.registerObserver(passenger2);
        notificationSystem.registerObserver(passenger3);
        notificationSystem.registerObserver(passenger4);
        notificationSystem.registerObserver(employee1);
        notificationSystem.registerObserver(employee2);

        notificationSystem.notifyFlightEvent("Flight time changed to 00:00");
        notificationSystem.notifyFlightEvent("Flight cancelled");
        notificationSystem.notifyFlightEvent("New sale: Discounted tickets available");

        notificationSystem.removeObserver(passenger2);

        notificationSystem.notifyFlightEvent("Flight delayed by 1 hour");
    }
}