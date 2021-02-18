package ru.granlovestea.request;

public abstract class MessageRequest {
    protected String text;
    protected Object replyMarkup;

    public MessageRequest(String text, Object replyMarkup) {
        this.text = text;
        this.replyMarkup = replyMarkup;
    }

    public String getText() {
        return text;
    }

    public Object getReplyMarkup() {
        return replyMarkup;
    }
}
