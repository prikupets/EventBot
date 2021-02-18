package ru.granlovestea.request;

public class NewMessageRequest extends MessageRequest {
    public NewMessageRequest(String text, Object replyMarkup) {
        super(text, replyMarkup);
    }
}
