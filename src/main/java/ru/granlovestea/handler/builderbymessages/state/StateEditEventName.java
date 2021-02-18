package ru.granlovestea.handler.builderbymessages.state;

import ru.granlovestea.model.entity.Event;

public class StateEditEventName extends State {
    private Event event;

    public StateEditEventName(StateContext stateContext, Event event) {
        super(stateContext);
        this.event = event;
    }
}
