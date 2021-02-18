package ru.granlovestea.handler;

import ru.granlovestea.update.Update;

public class CommandHandler implements Handler {
    private static final String COMMAND_TAG = "/";

    @Override
    public boolean tryHandle(Update update) {
        return false;
    }
}
