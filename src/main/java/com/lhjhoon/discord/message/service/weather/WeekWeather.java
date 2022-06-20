package com.lhjhoon.discord.message.service.weather;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class WeekWeather extends Weather{

    @Override
    public void sendMessageEmbeds(MessageReceivedEvent messageReceivedEvent) {
        System.out.println("WeekWeather");
    }

}
