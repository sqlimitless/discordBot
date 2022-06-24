package com.lhjhoon.discord.settingModule.lolSetting.domain.repository;

import com.lhjhoon.discord.settingModule.lolSetting.domain.LolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LolRepository extends JpaRepository<LolEntity, Long> {
}
