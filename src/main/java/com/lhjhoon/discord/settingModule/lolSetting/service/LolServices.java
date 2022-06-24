package com.lhjhoon.discord.settingModule.lolSetting.service;

import com.lhjhoon.discord.settingModule.lolSetting.domain.LolDTO;
import com.lhjhoon.discord.settingModule.lolSetting.domain.LolEntity;
import com.lhjhoon.discord.settingModule.lolSetting.domain.repository.LolRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LolServices {

    private final LolRepository lolRepository;

    public ResponseEntity<LolDTO> save(LolEntity lolEntity) {
        LolEntity lol = lolRepository.save(lolEntity);
        ModelMapper modelMapper = new ModelMapper();
        LolDTO rtnDTO = modelMapper.map(lol, LolDTO.class);
        return ResponseEntity.ok(rtnDTO);
    }
}
