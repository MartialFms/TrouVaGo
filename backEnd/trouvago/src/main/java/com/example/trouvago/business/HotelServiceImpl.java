package com.example.trouvago.business;

import com.example.trouvago.dao.HotelRepository;
import com.example.trouvago.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }
    @Override
    public Hotel getOneById (Long id){
        return hotelRepository.findByHotelId(id);
    }

@Override
    public Hotel addHotel (Hotel hotel){
        return hotelRepository.save(hotel);
    }

}

