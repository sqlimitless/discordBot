package com.lhjhoon.discord.settingModule.lolSetting.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class LolEntity {

    @Id
    @GeneratedValue
    private Long idx;
    @Column(nullable = false)
    private String token;
}
