package com.pogorelov.springtest.service;

import com.pogorelov.springtest.domain.City;
import com.pogorelov.springtest.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    @Transactional
    public City addCity(City city) {
        return cityRepository.save(city);
    }
}
