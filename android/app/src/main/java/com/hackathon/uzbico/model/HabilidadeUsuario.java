package com.hackathon.uzbico.model;

public class HabilidadeUsuario {

    protected int id;
    protected String message;
    protected String senderName;

    public HabilidadeUsuario(int id, String message, String senderName) {
        this.id = id;
        this.message = message;
        this.senderName = senderName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
