package house;

public class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.setSquareFootage(apartment.squareFootage + 40);
        apartment.upgradeBedroomNumber();
    }
}