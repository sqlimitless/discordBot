package com.lhjhoon.discord.chatConfig.domain.repository;

import com.lhjhoon.discord.chatConfig.domain.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharRoomRepository extends JpaRepository<ChatRoom, Long> {
    ChatRoom findByIdx(Long idx);
}
