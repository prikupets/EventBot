package ru.granlovestea.core;

import ru.granlovestea.model.entity.User;
import ru.granlovestea.request.EditMessageRequest;
import ru.granlovestea.request.NewMessageRequest;

public interface Bot {
    void start();
    Object send(NewMessageRequest newMessageRequest, User[] users);
    Object send(EditMessageRequest editMessageRequest, User[] users);
}
