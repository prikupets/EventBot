package ru.granlovestea.handler;

import ru.granlovestea.handler.builderbymessages.BuilderByMessagesHandler;
import ru.granlovestea.update.Update;
import ru.granlovestea.update.UpdateNewMessage;

public class HandlerManager {
    private static final Handler[] NEW_MESSAGE_HANDLER_CHAIN = {
        new CommandHandler(), new BuilderByMessagesHandler(), new DefaultHandler()
    };

    public void handle(UpdateNewMessage updateNewMessage) {
        passUpdateOnChain(updateNewMessage, NEW_MESSAGE_HANDLER_CHAIN);
    }

    private void passUpdateOnChain(Update update, Handler[] chain) {
        for(Handler handler : chain) {
            if (handler.tryHandle(update)) {
                break;
            }
        }
    }
}
