package ru.granlovestea.handler.builderbymessages.state;

import ru.granlovestea.model.entity.Event;

public class StateNewEventName extends State {
    private Event event;

    public StateNewEventName(StateContext stateContext, Event event) {
        super(stateContext);
        this.event = event;
    }
}
