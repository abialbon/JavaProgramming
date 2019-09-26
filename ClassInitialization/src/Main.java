public class Main {

    public static void main(String[] args) {

        class Flight {
            int passengers = 0; // Need not be initialized. All fields are initialized to zero equivalent
            int seats = 150;
            // Example of field initialization
        }

        class Car {
            int seats;
            char transmissionType;

            // Silly example but there can be many constructors
            // Each has a distinct signature - no of params and type of params

            Car() {
                this.seats = 4;
                this.transmissionType = 'm';
            }

            Car(int seats) {
                this.seats = seats;
                this.transmissionType = 'm';
            }

            Car(int seats, char transmissionType) {
                this.seats = seats;
                this.transmissionType = transmissionType;
            }

            public void describe() {
                System.out.println("This is a " + seats + " seater car with a " + transmissionType + " transmission.");
            }
        }

        class Animal {
            int heartRate;
            boolean alive;
            {
                System.out.println("A new animal was created!");
            }
        }


        Animal a1 = new Animal();
        Car c1 = new Car(7);
        c1.describe();
    }
}
