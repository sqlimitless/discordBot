package com.lhjhoon.discord.settingModule.chatRoomSetting.controller;

import com.lhjhoon.discord.settingModule.chatRoomSetting.domain.ChatRoomDTO;
import com.lhjhoon.discord.settingModule.chatRoomSetting.domain.ChatRoomEntity;
import com.lhjhoon.discord.settingModule.chatRoomSetting.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    @PostMapping ("/room")
    public ResponseEntity<ChatRoomDTO> save(ChatRoomEntity chatRoomEntity){
        return chatRoomService.save(chatRoomEntity);
    }

    @PatchMapping("/room")
    public ResponseEntity<ChatRoomDTO> update(ChatRoomEntity chatRoomEntity){
        return chatRoomService.update(chatRoomEntity);
    }
}
