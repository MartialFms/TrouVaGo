package com.example.trouvago.business;

import com.example.trouvago.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    public List<Hotel> getAll();
    public Hotel getOneById(Long hotelId);

    public Hotel addHotel (Hotel hotel);
}
