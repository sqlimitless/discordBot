package com.lhjhoon.discord.message;

import com.lhjhoon.discord.message.service.MessageService;
import com.lhjhoon.discord.message.service.lol.LolStatus;
import com.lhjhoon.discord.message.service.weather.WeekWeather;

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
