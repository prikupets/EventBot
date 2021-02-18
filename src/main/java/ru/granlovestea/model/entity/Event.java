package ru.granlovestea.model.entity;

import java.util.List;
import java.util.Random;

public class Event {
    private long id;
    private String name;
    private String time;
    private Member owner;
    private List<Member> members;
    private EventPublishMessage eventPublishMessage;

    public Event(Member owner) {
        this.owner = owner;
        this.id = new Random().nextLong();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setOwner(Member owner) {
        this.owner = owner;
    }

    public void setEventPublishMessage(EventPublishMessage eventPublishMessage) {
        this.eventPublishMessage = eventPublishMessage;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public Member getOwner() {
        return owner;
    }

    public List<Member> getMembers() {
        return members;
    }

    public EventPublishMessage getEventPublishMessage() {
        return eventPublishMessage;
    }
}
