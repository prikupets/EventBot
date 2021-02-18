package ru.granlovestea.handler.builderbymessages.state;

import ru.granlovestea.model.entity.Event;

public class StateNewEventTime extends State {
    private Event event;

    public StateNewEventTime(StateContext stateContext, Event event) {
        super(stateContext);
        this.event = event;
    }
}
