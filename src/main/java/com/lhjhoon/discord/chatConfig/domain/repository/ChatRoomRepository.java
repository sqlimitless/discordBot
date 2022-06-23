package com.lhjhoon.discord.chatConfig.domain.repository;

import com.lhjhoon.discord.chatConfig.domain.ChatRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoomEntity, Long> {
    ChatRoomEntity findByIdx(Long idx);
}
