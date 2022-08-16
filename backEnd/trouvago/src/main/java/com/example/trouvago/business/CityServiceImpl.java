package com.example.trouvago.business;

import com.example.trouvago.dao.CityRepository;
import com.example.trouvago.dao.HotelRepository;
import com.example.trouvago.entities.City;
import com.example.trouvago.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> getAll(){
        return cityRepository.findAll();
    }
    @Override
    public City getOneById (Long id){
        return cityRepository.findByCityId(id);
    }

@Override
    public City addHotel (City city){
        return cityRepository.save(city);
    }

}

