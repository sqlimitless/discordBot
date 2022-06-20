package com.lhjhoon.discord;


import com.lhjhoon.discord.eventListener.MessageListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class DiscordBotMainApplication {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("OTcxNzU5NzE0NjgzNzIzODI2.GWkHmx.xkctziuZjn8vOGDjA27wZundEyvPzz_kqL_Ems");
        // Disable parts of the cache
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        // Enable the bulk delete event
        builder.setBulkDeleteSplittingEnabled(false);
        // Disable compression (not recommended)
        builder.setCompression(Compression.NONE);
        // Set activity (like "playing Something")
        builder.setActivity(Activity.watching("TV"));
        builder.addEventListeners(new MessageListener());
        builder.build();
    }
}
