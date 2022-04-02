package Day06;

public class House {
    public static void main(String[] args) {
        String houseType = "Penthouse";
        int numberOfBedrooms = 4, numberOfBathrooms = 3, numberOfKitchens = 1, zipcode = 22031;
        boolean hasBasement = true, hasAttic = false, hasPool = true, onSale = true, hasPark = true;
        double costOfHouse = 1000000.99, schoolRating = 4.5;
        String address = "1 Main Str";

        String houseInfo = "The " + houseType + " on " + address + ", " + zipcode + " costs $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + " kitchen\nIt also includes a basement: " + hasBasement + "\nHas an attic: " + hasAttic + "\nHas a pool: " + hasPool + "\nIs on sale: " + onSale + "\nHas a park: " + hasPark + "\nThe schools in the area have a rating of " + schoolRating;

        System.out.println(houseInfo);

    }
}
