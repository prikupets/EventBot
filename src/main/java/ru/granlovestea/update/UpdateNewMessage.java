package ru.granlovestea.update;

import ru.granlovestea.model.entity.User;

public class UpdateNewMessage extends Update {
    private String text;
    private int id;
    private String payload;

    public UpdateNewMessage(User sender, String text, int id, String payload) {
        super(sender);
        this.text = text;
        this.id = id;
        this.payload = payload;
    }

    public UpdateNewMessage(User sender, String text, int id) {
        super(sender);
        this.text = text;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

    public String getPayload() {
        return payload;
    }
}
