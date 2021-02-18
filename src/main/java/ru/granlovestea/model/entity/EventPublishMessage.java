package ru.granlovestea.model.entity;

public class EventPublishMessage {
    private long id;
    private String text;

    public EventPublishMessage(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
