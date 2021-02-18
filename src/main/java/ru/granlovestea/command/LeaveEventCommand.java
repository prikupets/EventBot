package ru.granlovestea.command;

import ru.granlovestea.model.entity.User;

public class LeaveEventCommand extends Command {
    private long eventId;

    public LeaveEventCommand(User sender, int eventId) {
        super(sender);
        this.eventId = eventId;
    }

    @Override
    public void execute() {

    }
}
