public class BedroomAdder{
    public static void main(String[] args){

        Penthouse penthouse = new Penthouse();
        System.out.println(penthouse.getNumberOfBedrooms());

        Studio studio1 = new Studio();
        System.out.println(studio1.getNumberOfBedrooms());
    
    }
}// Writing the code this way avoids the implementation removing functionality from the code, instead it seperates the classes fully so that it doesnt
// Have to check whether the apartment is an instanceof studio

/* public class BedroomAdder {
    public void addBedroom(Apartment apartment) {
        apartment.setSquareFootage(apartment.getSquareFootage() + 40);

        if (!(apartment instanceof Studio)) {
            apartment.setNumberOfBedrooms(apartment.getNumberOfBedrooms() + 1);
        }
    }
} */