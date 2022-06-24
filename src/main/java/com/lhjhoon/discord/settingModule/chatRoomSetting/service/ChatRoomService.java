package com.lhjhoon.discord.settingModule.chatRoomSetting.service;

import com.lhjhoon.discord.settingModule.chatRoomSetting.domain.ChatRoomDTO;
import com.lhjhoon.discord.settingModule.chatRoomSetting.domain.ChatRoomEntity;
import com.lhjhoon.discord.settingModule.chatRoomSetting.domain.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;

    public ResponseEntity<ChatRoomDTO> save(ChatRoomEntity chatRoomEntity) {
        ChatRoomEntity chatRoom = chatRoomRepository.save(chatRoomEntity);
        ModelMapper modelMapper = new ModelMapper();
        ChatRoomDTO rtnDTO = modelMapper.map(chatRoom, ChatRoomDTO.class);
        return ResponseEntity.ok(rtnDTO);
    }

    public ResponseEntity<ChatRoomDTO> update(ChatRoomEntity chatRoomEntity) {
        ChatRoomEntity chatRoom = chatRoomRepository.save(chatRoomEntity);
        ModelMapper modelMapper = new ModelMapper();
        ChatRoomDTO rtnDTO = modelMapper.map(chatRoom, ChatRoomDTO.class);
        return ResponseEntity.ok(rtnDTO);
    }
}
