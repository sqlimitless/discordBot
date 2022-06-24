package com.lhjhoon.discord.settingModule.lolSetting.controller;

import com.lhjhoon.discord.settingModule.lolSetting.domain.LolDTO;
import com.lhjhoon.discord.settingModule.lolSetting.domain.LolEntity;
import com.lhjhoon.discord.settingModule.lolSetting.service.LolServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LolSettingController {

    private final LolServices lolServices;

    @PostMapping("/lol")
    public ResponseEntity<LolDTO> save(LolEntity lolEntity){
        return lolServices.save(lolEntity);
    }
}
