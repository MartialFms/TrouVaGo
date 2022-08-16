package com.example.trouvago.web;

import com.example.trouvago.business.HotelService;
import com.example.trouvago.entities.City;
import com.example.trouvago.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/all")
    public List<Hotel> getAll() {
        return hotelService.getAll();
    }

    /**
     * Return an hotel by id
     *
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public Hotel getOne(@PathVariable("id") long id) {
        return hotelService.getOneById(id);
    }

    /**
     * Update a hotel by id
     *
     * @param id
     * @param hotel
     */
    @PutMapping("/update/{id}")
    public void updateHotel(@PathVariable("id") long id, @RequestBody Hotel hotel) {
            Hotel hotelToUpdate = hotelService.getOneById(id);
            hotelToUpdate.setName(hotel.getName());
            hotelToUpdate.setPhone(hotel.getPhone());
            hotelToUpdate.setAdress(hotel.getAdress());
            hotelToUpdate.setRate(hotel.getRate());
            hotelService.addHotel(hotelToUpdate);
        }}

