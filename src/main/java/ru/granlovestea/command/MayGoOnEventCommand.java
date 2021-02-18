package ru.granlovestea.command;

import ru.granlovestea.model.entity.User;

public class MayGoOnEventCommand extends Command {
    private long eventId;

    public MayGoOnEventCommand(User sender, int eventId) {
        super(sender);
        this.eventId = eventId;
    }

    @Override
    public void execute() {

    }
}
