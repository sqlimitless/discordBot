package com.lhjhoon.discord.settingModule.weatherSetting.domain.repository;

import com.lhjhoon.discord.settingModule.weatherSetting.domain.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<WeatherEntity, Long> {
    WeatherEntity findByIdx(long l);
}
