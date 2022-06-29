package com.lhjhoon.discord.message.module.weather;

import com.lhjhoon.discord.message.module.MessageService;
import com.lhjhoon.discord.message.module.httpConnect.commonHttpConnection;
import com.lhjhoon.discord.settingModule.weatherSetting.domain.WeatherEntity;
import com.lhjhoon.discord.settingModule.weatherSetting.domain.repository.WeatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RequiredArgsConstructor
public abstract class Weather implements MessageService, commonHttpConnection {

//    private final WeatherRepository weatherRepository;

    @Override
    public String httpConnection(HttpMethod method, String url, Map<String, String> param) {
        StringBuffer comUrl = new StringBuffer("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/");
        comUrl.append(url);
        if(method== HttpMethod.GET){
            comUrl.append("?");
//            WeatherEntity weatherEntity = weatherRepository.findByIdx(1L);
//            comUrl.append("ServiceKey=").append(weatherEntity.getEncodingKey());
            comUrl.append("ServiceKey=").append("tN4b9kBn7Y5i8bbNSwqQtb1o0i75mmlJp7RkZO5nUSdrDXi6veCt1HSeU1%2BdhJ46iIFg9wVtltedA3HZvEg%2BGA%3D%3D");
//            "tN4b9kBn7Y5i8bbNSwqQtb1o0i75mmlJp7RkZO5nUSdrDXi6veCt1HSeU1%2BdhJ46iIFg9wVtltedA3HZvEg%2BGA%3D%3D";
            for (Map.Entry<String, String> paramEntry : param.entrySet()) {
                comUrl.append(URLEncoder.encode(paramEntry.getKey(), StandardCharsets.UTF_8));
                comUrl.append("=");
                comUrl.append(URLEncoder.encode(paramEntry.getValue(), StandardCharsets.UTF_8));
            }
            comUrl.append(param);
        }else{

        }
        StringBuilder sb = new StringBuilder();
        try{
            URL connectUrl = new URL(comUrl.toString());
            HttpURLConnection conn = (HttpURLConnection) connectUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            BufferedReader rd;
            if(conn.getResponseCode() >= HttpStatus.OK.value() && conn.getResponseCode() <= HttpStatus.MULTIPLE_CHOICES.value()) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
