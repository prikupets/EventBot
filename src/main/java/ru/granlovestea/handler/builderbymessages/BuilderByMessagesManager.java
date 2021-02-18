package ru.granlovestea.handler.builderbymessages;

import ru.granlovestea.handler.builderbymessages.state.StateContext;
import ru.granlovestea.model.entity.User;

import java.util.HashMap;
import java.util.Map;

public class BuilderByMessagesManager {
    public static Map<User, StateContext> stateContextsByUsers = new HashMap<>();
}
