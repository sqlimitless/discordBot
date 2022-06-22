package com.lhjhoon.discord;

import com.lhjhoon.discord.chatConfig.domain.ChatRoom;
import com.lhjhoon.discord.chatConfig.domain.repository.CharRoomRepository;
import com.lhjhoon.discord.eventListener.MessageListener;
import lombok.RequiredArgsConstructor;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.security.auth.login.LoginException;

@Component
@RequiredArgsConstructor
public class DiscordBot {

    private final CharRoomRepository charRoomRepository;

    @PostConstruct
    private void init() {
        try{
            //TODO 일딴 임시작업
            ChatRoom byId = charRoomRepository.findByIdx(1L);
            JDABuilder builder = JDABuilder.createDefault(byId.getToken());
            // Disable parts of the cache
            builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
            // Enable the bulk delete event
            builder.setBulkDeleteSplittingEnabled(false);
            // Disable compression (not recommended)
            builder.setCompression(Compression.NONE);
            // Set activity (like "playing Something")
            builder.setActivity(Activity.listening("어떤 헛소리를 하나"));
            builder.addEventListeners(new MessageListener());
            builder.build();
        }catch(LoginException e){
            e.printStackTrace();
        }
    }
}
