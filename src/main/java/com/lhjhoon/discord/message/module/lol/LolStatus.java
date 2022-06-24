package com.lhjhoon.discord.message.module.lol;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class LolStatus extends Lol{

    @Override
    public void sendMessageEmbeds(MessageReceivedEvent messageReceivedEvent) {
        System.out.println("LolStatus");
    }
}
