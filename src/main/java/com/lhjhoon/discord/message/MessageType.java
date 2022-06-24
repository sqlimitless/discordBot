package com.lhjhoon.discord.message;

import com.lhjhoon.discord.message.module.MessageService;
import com.lhjhoon.discord.message.module.lol.LolStatus;
import com.lhjhoon.discord.message.module.weather.WeekWeather;

public enum MessageType {

    LOLSTATS(new LolStatus(),"/lolStat"),
    WEATHER(new WeekWeather(),"/weekWeather")
    ;

    private final MessageService messageService;
    private final String text;

    MessageType(MessageService messageService, String text) {
        this.messageService = messageService;
        this.text = text;
    }

    public MessageService getMessageService() {
        return this.messageService;
    }

    public String getText() {
        return text;
    }
}
