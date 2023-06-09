/**
 * Model a passenger wishing to get from one
 * location to another.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Passenger
{
    private Location pickup;
    private Location destination;
    private static int currentBooking;

    /**
     * Constructor for objects of class Passenger
     * @param pickup The pickup location, must not be null.
     * @param destination The destination location, must not be null.
     * @throws NullPointerException If either location is null.
     */
    public void SetCurrentBooking(int bookingId)
    {
        currentBooking = bookingId;
    }


    public Passenger(Location pickup, Location destination)
    {
        if(pickup == null) {
            throw new NullPointerException("Pickup location");
        }
        if(destination == null) {
            throw new NullPointerException("Destination location");
        }
        this.pickup = pickup;
        this.destination = destination;
    }
    
    public String toString()
    {
        return "Passenger travelling from " +
               pickup + " to " + destination;
    }

    /**
     * @return The pickup location.
     */
    public Location getPickupLocation()
    {
        return pickup;
    }
    public static int getID()
    {
        return currentBooking;
    }
    
    /**
     * @return The destination location.
     */
    public Location getDestination()
    {
        return destination;
    }
}
