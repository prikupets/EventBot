package ru.granlovestea.core;

import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;

public class VKBotFactory {
    public static VKBot getVKBot() {
        GroupActor groupActor = new GroupActor(
                Integer.parseInt(Application.PROPERTIES.getProperty("vkBot_groupId")),
                Application.PROPERTIES.getProperty("vkBot_token"));

        VkApiClient VK = new VkApiClient(HttpTransportClient.getInstance());

        return new VKBot(VK, groupActor);
    }
}
