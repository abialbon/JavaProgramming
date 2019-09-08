public class Main {

    public static void main(String[] args) {

        class Flight {

            private int seats;
            private int passengers;
            private char flightClass;
            private int flightNumber;

            // Accessors or getters
            public int getSeats() {
                return seats;
            }

            public int getPassengers() {
                return passengers;
            }

            // Mutators or setters
            public void setFlightClass(char flightClass) {
                this.flightClass = flightClass;
            }

            public void setFlightNumber(int flightNumber) {
                this.flightNumber = flightNumber;
            }

            public void showDescription() {
                System.out.println("Flight no: " + this.flightNumber + " Class: " + this.flightClass);
                System.out.println("There are " + this.seats + " seats in this flight.");
                System.out.println("No of passengers: " + this.passengers);
            }
        } // Flight

        Flight maa1 = new Flight();
        maa1.seats = 200;
        maa1.passengers = 85;
        maa1.setFlightClass('A');
        maa1.setFlightNumber(323);

        maa1.showDescription();

    }
}
