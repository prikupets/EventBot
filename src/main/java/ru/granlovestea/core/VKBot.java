package ru.granlovestea.core;

import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.granlovestea.handler.HandlerManager;
import ru.granlovestea.model.entity.User;
import ru.granlovestea.request.EditMessageRequest;
import ru.granlovestea.request.NewMessageRequest;

public class VKBot extends CallbackApiLongPoll implements Bot {
    private static final Logger LOG = LoggerFactory.getLogger(VKBot.class);
    private GroupActor groupActor;
    private HandlerManager handlerManager;

    public VKBot(VkApiClient client, GroupActor groupActor) {
        super(client, groupActor);
        this.groupActor = groupActor;
        this.handlerManager = new HandlerManager();
    }

    @Override
    public void start() {
        LOG.info("Starting VKBot");
        try {
            getClient().groups().setLongPollSettings(groupActor,
                    groupActor.getGroupId())
                    .enabled(true)
                    .messageNew(true)
                    .execute();

            run();
        } catch (ClientException | ApiException e) {
            LOG.error("Exception occurred while starting VKBot", e);
        }
    }

    @Override
    public Object send(NewMessageRequest newMessageRequest, User[] users) {
        return null;
    }

    @Override
    public Object send(EditMessageRequest editMessageRequest, User[] users) {
        return null;
    }

    @Override
    public void messageNew(Integer groupId, Message message) {
        LOG.info(message.toString());
    }

    private void tryAddUser(User user) {
        if(Application.DATA_MANAGER.getUsers().add(user)) {
            LOG.info("Added {} in repository", user);
        }
    }
}
