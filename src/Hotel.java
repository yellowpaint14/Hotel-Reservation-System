package learning.MyProjects.HotelReservationSystem;

class Hotel {
    String hotelName;
    double rating;
    int freeRooms;
    int pricePerNight;
    Hotel(String n, double r, int fr, int ppn){
        hotelName = n;
        rating = r;
        freeRooms = fr;
        pricePerNight = ppn;
    }
    int getFinalPrice(int peopleCount, int nightsCount){
        return peopleCount*nightsCount*pricePerNight;
    }
}
