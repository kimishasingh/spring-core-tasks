package com.codefountain.spring.core.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener { //} implements ApplicationListener<MessageEvent> {

    //@Override
    @EventListener
    public void onApplicationEvent(MessageEvent event) {
        System.out.println(event.getMessage());
        //System.out.println(event.getTimestamp());
    }

    @EventListener
    public void onApplicationEvent(DateTimeEvent dateTimeEvent) {
        System.out.println(dateTimeEvent.getDateTime());
    }
}
