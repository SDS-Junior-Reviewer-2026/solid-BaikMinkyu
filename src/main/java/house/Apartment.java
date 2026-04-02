package house;

public abstract class Apartment {
    int squareFootage;
    int numberOfBedrooms;

    public abstract void setSquareFootage(int sqft);
    public abstract void upgradeBedroomNumber();
}