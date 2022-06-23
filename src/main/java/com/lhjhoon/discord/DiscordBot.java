package com.lhjhoon.discord;

import com.lhjhoon.discord.chatConfig.domain.ChatRoomEntity;
import com.lhjhoon.discord.chatConfig.domain.repository.ChatRoomRepository;
import com.lhjhoon.discord.eventListener.MessageListener;
import lombok.RequiredArgsConstructor;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.security.auth.login.LoginException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DiscordBot {

    private final ChatRoomRepository chatRoomRepository;

    @PostConstruct
    private void init() {
        try{
            //TODO 일딴 임시작업
            List<ChatRoomEntity> chatRoomEntities = chatRoomRepository.findAll();
            for (ChatRoomEntity chatRoomEntity : chatRoomEntities) {
                JDABuilder builder = JDABuilder.createDefault(chatRoomEntity.getToken());
                // Disable parts of the cache
                builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
                // Enable the bulk delete event
                builder.setBulkDeleteSplittingEnabled(false);
                // Disable compression (not recommended)
                builder.setCompression(Compression.NONE);
                // Set activity (like "playing Something")
                builder.setActivity(Activity.listening(chatRoomEntity.getActivity()));
                builder.addEventListeners(new MessageListener());
                builder.build();
            }
        }catch(LoginException e){
            e.printStackTrace();
        }
    }
}
