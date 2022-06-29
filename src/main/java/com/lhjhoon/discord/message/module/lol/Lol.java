package com.lhjhoon.discord.message.module.lol;

import com.lhjhoon.discord.message.module.MessageService;
import com.lhjhoon.discord.message.module.httpConnect.commonHttpConnection;
import org.springframework.http.HttpMethod;

import java.util.Map;

public abstract class Lol implements MessageService, commonHttpConnection {

    @Override
    public String httpConnection(HttpMethod method, String url, Map<String, String> param) {
        return "";
    }
}
