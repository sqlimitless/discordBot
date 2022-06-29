package com.lhjhoon.discord.message.module.httpConnect;

import org.springframework.http.HttpMethod;

import java.util.Map;

public interface commonHttpConnection {

    String httpConnection(HttpMethod method, String url, Map<String, String> param);
}
