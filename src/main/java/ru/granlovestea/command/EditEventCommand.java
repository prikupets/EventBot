package ru.granlovestea.command;

import ru.granlovestea.model.entity.User;

public class EditEventCommand extends Command {
    private long eventId;

    public EditEventCommand(User sender, int eventId) {
        super(sender);
        this.eventId = eventId;
    }

    @Override
    public void execute() {

    }
}
