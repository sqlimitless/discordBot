package com.lhjhoon.discord.chatConfig.controller;

import com.lhjhoon.discord.chatConfig.domain.ChatRoomDTO;
import com.lhjhoon.discord.chatConfig.domain.ChatRoomEntity;
import com.lhjhoon.discord.chatConfig.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    @GetMapping("/room")
    public ResponseEntity<ChatRoomDTO> save(ChatRoomEntity chatRoomEntity){
        return chatRoomService.save(chatRoomEntity);
    }

    @PatchMapping("/room")
    public ResponseEntity<ChatRoomDTO> update(ChatRoomEntity chatRoomEntity){
        return chatRoomService.update(chatRoomEntity);
    }
}
