package com.lhjhoon.discord.eventListener;

import com.lhjhoon.discord.message.MessageType;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class MessageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if (e.getAuthor().isBot()) {
            return;
        }

        String msg = e.getMessage().getContentRaw();

        for (MessageType messageType : MessageType.values()) {
            if(msg.equalsIgnoreCase(messageType.getText())){
                messageType.getMessageService().sendMessageEmbeds(e);
//                this.sendEmbed(e);
            }
        }
    }

    private void sendTextMessage(MessageReceivedEvent e){
        e.getTextChannel().sendMessage("봇 테스트").queue();
    }

    private void sendEmbed(MessageReceivedEvent e){
        EmbedBuilder eb = new EmbedBuilder();
//        eb.addField("가가가1","가가가1",false);
//        eb.addField("가가가2","가가가2",false);
        eb.setTitle("타이틀");
        eb.setDescription("테스트 설명");
        eb.setThumbnail("https://blog.kakaocdn.net/dn/ckSVhk/btqZrfj1f9F/5aPKt5IyBB6we6d2blg9q1/img.png");
        eb.setFooter("-테스트중-");
        eb.setColor(Color.WHITE);
        eb.setImage("https://blog.kakaocdn.net/dn/ckSVhk/btqZrfj1f9F/5aPKt5IyBB6we6d2blg9q1/img.png");
        eb.setAuthor("제목","https://blog.kakaocdn.net/dn/ckSVhk/btqZrfj1f9F/5aPKt5IyBB6we6d2blg9q1/img.png");
        e.getChannel().sendMessageEmbeds(eb.build()).queue();
    }
}
