package ru.granlovestea.command;

import ru.granlovestea.model.entity.User;

public class DeleteEventCommand extends Command {
    private long eventId;

    public DeleteEventCommand(User sender, int eventId) {
        super(sender);
        this.eventId = eventId;
    }

    @Override
    public void execute() {

    }
}
