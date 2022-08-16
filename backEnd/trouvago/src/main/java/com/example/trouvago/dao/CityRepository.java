package com.example.trouvago.dao;

import com.example.trouvago.entities.City;
import com.example.trouvago.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findAll();

    City findByCityId(Long id);
    List<City> findByNameContains(String keyWord);

}
