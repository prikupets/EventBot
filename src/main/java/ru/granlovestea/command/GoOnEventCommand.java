package ru.granlovestea.command;

import ru.granlovestea.model.entity.User;

public class GoOnEventCommand extends Command {
    private long eventId;

    public GoOnEventCommand(User sender, int eventId) {
        super(sender);
        this.eventId = eventId;
    }

    @Override
    public void execute() {

    }
}
