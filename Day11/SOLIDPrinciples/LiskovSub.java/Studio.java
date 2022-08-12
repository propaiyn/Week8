public class Studio {
        private int squareFootage;
        private int numberOfBedrooms;
    
        public Studio() {
            this.setNumberOfBedrooms(0);
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
    
    /* 
    public class Studio extends Apartment {
    public Studio() {
        this.setNumberOfBedrooms(0);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(sqft);
    }
} */