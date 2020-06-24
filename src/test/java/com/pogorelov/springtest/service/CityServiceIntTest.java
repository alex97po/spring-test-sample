package com.pogorelov.springtest.service;

import com.pogorelov.springtest.SpringGoitApplication;
import com.pogorelov.springtest.domain.City;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = SpringGoitApplication.class)
@RunWith(SpringRunner.class)
@Transactional
public class CityServiceIntTest {

    @Autowired
    private CityService cityService;

    @Test
    public void addCityTest() {
        City city = new City();
        city.setId(7);
        city.setCityName("TEST");
        City result = cityService.addCity(city);
        Assertions.assertEquals(city.getCityName(), result.getCityName());
        Assertions.assertEquals(city.getId(), result.getId());
    }
}
