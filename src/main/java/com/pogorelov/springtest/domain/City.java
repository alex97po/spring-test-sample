package com.pogorelov.springtest.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
@Data
public class City {

    @Id
    private Integer id;

    @Column(name = "city_name")
    private String cityName;
}
