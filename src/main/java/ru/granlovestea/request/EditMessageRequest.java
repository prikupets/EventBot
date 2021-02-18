package ru.granlovestea.request;

public class EditMessageRequest extends MessageRequest {
    public EditMessageRequest(String text, Object replyMarkup) {
        super(text, replyMarkup);
    }
}
