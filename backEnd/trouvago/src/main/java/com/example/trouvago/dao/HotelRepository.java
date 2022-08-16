package com.example.trouvago.dao;

import com.example.trouvago.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    List<Hotel> findAll();

    Hotel findByHotelId(Long id);
    List<Hotel> findByNameContains(String keyWord);

}
