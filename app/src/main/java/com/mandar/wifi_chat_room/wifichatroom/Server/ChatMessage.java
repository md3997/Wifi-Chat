package com.mandar.wifi_chat_room.wifichatroom.Server;

/**
 * Created by mandar on 07-04-2018.
 */

public class ChatMessage {
    public boolean left;
    public String message;

    public ChatMessage(boolean left, String message) {
        super();
        this.left = left;
        this.message = message;
    }
}