package com.lhjhoon.discord.message.module.weather;

import com.lhjhoon.discord.settingModule.weatherSetting.domain.repository.WeatherRepository;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.springframework.http.HttpMethod;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class WeekWeather extends Weather{

    @Override
    public void sendMessageEmbeds(MessageReceivedEvent messageReceivedEvent) {
        Map<String, String> map = new HashMap<>();
        map.put("pageNo","1");
        map.put("numOfRows","1000");
        map.put("dataType","XML");
        map.put("base_date","20220628");
        map.put("base_time","0600");
        map.put("nx","55");
        map.put("ny","127");
        String s = httpConnection(HttpMethod.GET, "/getUltraSrtNcst", map);
        System.out.println("#########################################");
        System.out.println(s);
        EmbedBuilder eb = new EmbedBuilder();
//        eb.addField("가가가1","가가가1",false);
//        eb.addField("가가가2","가가가2",false);
        eb.setTitle("타이틀");
        eb.setDescription(s);
        eb.setThumbnail("https://blog.kakaocdn.net/dn/ckSVhk/btqZrfj1f9F/5aPKt5IyBB6we6d2blg9q1/img.png");
        eb.setFooter("-테스트중-");
        eb.setColor(Color.WHITE);
        eb.setImage("https://blog.kakaocdn.net/dn/ckSVhk/btqZrfj1f9F/5aPKt5IyBB6we6d2blg9q1/img.png");
        eb.setAuthor("제목","https://blog.kakaocdn.net/dn/ckSVhk/btqZrfj1f9F/5aPKt5IyBB6we6d2blg9q1/img.png");
        messageReceivedEvent.getChannel().sendMessageEmbeds(eb.build()).queue();
    }

}
