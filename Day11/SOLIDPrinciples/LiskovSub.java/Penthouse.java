public class Penthouse {
    private int squareFootage;
    private int numberOfBedrooms;

    public Penthouse() {
        this.setNumberOfBedrooms(4);
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
}


/* public class Penthouse extends Apartment {
    public Penthouse() {
        this.setNumberOfBedrooms(4);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(this.getSquareFootage());
    }
} */