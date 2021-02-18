package ru.granlovestea.handler;

import ru.granlovestea.update.Update;

public interface Handler {
    boolean tryHandle(Update update);
}
