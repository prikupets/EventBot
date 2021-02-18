package ru.granlovestea.handler.builderbymessages.state;

import ru.granlovestea.handler.Handler;
import ru.granlovestea.update.Update;
import ru.granlovestea.update.UpdateNewMessage;

public abstract class State implements Handler {
    private StateContext stateContext;

    public State(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    @Override
    public boolean tryHandle(Update update) {
        UpdateNewMessage updateNewMessage = (UpdateNewMessage) update;
        return false;
    }
}
