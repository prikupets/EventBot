package ru.granlovestea.handler;

import ru.granlovestea.update.Update;

public class DefaultHandler implements Handler {
    @Override
    public boolean tryHandle(Update update) {
        return false;
    }
}
