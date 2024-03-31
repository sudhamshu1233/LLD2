package projectexcecption;

public class ParkingSpotFull extends RuntimeException{

        public ParkingSpotFull(String message)
        {
            super(message);
        }
        public ParkingSpotFull()
        {
            super("Parking Lot Full");
        }
}
