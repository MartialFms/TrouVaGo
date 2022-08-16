package com.example.trouvago.business;

import com.example.trouvago.entities.City;
import com.example.trouvago.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {

    public List<City> getAll();
    public City getOneById(Long cityId);

    public City addCity(City city);
}
