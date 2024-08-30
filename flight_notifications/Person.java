package flight_notifications;

class Person implements Observer {

    // Data
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
