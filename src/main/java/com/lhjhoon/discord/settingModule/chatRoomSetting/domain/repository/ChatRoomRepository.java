package com.lhjhoon.discord.settingModule.chatRoomSetting.domain.repository;

import com.lhjhoon.discord.settingModule.chatRoomSetting.domain.ChatRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoomEntity, Long> {
    ChatRoomEntity findByIdx(Long idx);
}
