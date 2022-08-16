package com.example.trouvago;

import com.example.trouvago.business.CityService;
import com.example.trouvago.business.HotelService;
import com.example.trouvago.entities.City;
import com.example.trouvago.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrouvagoApplication implements CommandLineRunner {

    @Autowired
    HotelService hotelService;

    @Autowired
    CityService cityService;
    public static void main(String[] args) {
        SpringApplication.run(TrouvagoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        City paris = cityService.addCity(new City(null, "Paris"));
        City london = cityService.addCity(new City(null, "London"));

        Hotel h1 = hotelService.addHotel(new Hotel(null, "Pomé Nation", (long)118008, "Au fond du trou", 2,paris));
        Hotel h2 = hotelService.addHotel(new Hotel(null, "Lost", (long)456456, "In the cambrouss", 5,london));
        Hotel h3 = hotelService.addHotel(new Hotel(null, "Rotten", (long)456456, "In Macron valley", 1,london));
        /*
                City toulouse = cityService.add(new City(null, "Toulouse", 31));
        City paris = cityService.add(new City(null, "Paris", 75));
        cityService.add(new City(null, "Lyon", 69));
        cinemaService.addCinema(new Cinema(null, "Distopia Jean Jaurès", new Address(), toulouse, null));
        cinemaService.addCinema(new Cinema(null, "Distopia Bastide", null, paris, null));


        Category asian = new Category("ASIAN", null);
        Category kids = new Category("KIDS", null);
        Category romance = new Category("ROMANCE", null);
        Category drama = new Category("DRAMA", null);
        Category fiction = new Category("FICTION", null);
        Category horror = new Category("HORROR", null);
        categoryRepository.save(asian);
        categoryRepository.save(kids);
        categoryRepository.save(romance);
        categoryRepository.save(drama);
        categoryRepository.save(fiction);
        categoryRepository.save(horror);

        Address addJeanJo = new Address("Allées Jean Jaunes", "", "Toulouse", "31000", "France");
        Address addBastile = new Address("Bld Bastile", "", "Paris", "75000", "France");
        cinemaService.addCinema(new Cinema(null, "Distopia Jean Jaurès", addJeanJo, toulouse, null));
        cinemaService.addCinema(new Cinema(null, "Distopia Bastide", addBastile, paris, null));
*/
    }
}
