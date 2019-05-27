package hotel.project.model;

import javax.persistence.Persistence;

public class HotelProject {

    public static void main(String[] args){
        Persistence.createEntityManagerFactory("hotel.project1PU");
    }
}
