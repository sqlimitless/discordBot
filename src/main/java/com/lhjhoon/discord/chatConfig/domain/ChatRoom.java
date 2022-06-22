package com.lhjhoon.discord.chatConfig.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class ChatRoom {

    @Id
    @GeneratedValue
    private Long idx;
    private String token;
}
