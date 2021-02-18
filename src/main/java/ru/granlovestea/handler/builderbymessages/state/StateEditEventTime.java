package ru.granlovestea.handler.builderbymessages.state;

import ru.granlovestea.model.entity.Event;

public class StateEditEventTime extends State {
    private Event event;

    public StateEditEventTime(StateContext stateContext, Event event) {
        super(stateContext);
        this.event = event;
    }
}
