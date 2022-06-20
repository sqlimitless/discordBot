package com.lhjhoon.discord.message.service;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public interface MessageService {

    void sendMessageEmbeds(MessageReceivedEvent messageReceivedEvent);
}
