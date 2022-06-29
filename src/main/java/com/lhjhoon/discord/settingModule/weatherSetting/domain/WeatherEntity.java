package com.lhjhoon.discord.settingModule.weatherSetting.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Weather")
@Data
public class WeatherEntity {

    @Id
    @GeneratedValue
    private Long idx;
    private String encodingKey;
    private String decodingKey;

}
