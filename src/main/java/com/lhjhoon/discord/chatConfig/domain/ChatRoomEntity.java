package com.lhjhoon.discord.chatConfig.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class ChatRoomEntity {

    @Id
    @GeneratedValue
    private Long idx;
    @Column(nullable = false)
    private String token;
    private String activity;
    private String roomName;
}
