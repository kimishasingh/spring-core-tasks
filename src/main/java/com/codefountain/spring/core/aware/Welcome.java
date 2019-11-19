package com.codefountain.spring.core.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;

public class Welcome implements MessageSourceAware {

    public void setMessageSource(MessageSource messageSource) {
        System.out.println(messageSource.getMessage("welcome", null, Locale.US));
        System.out.println(messageSource.getMessage("welcome", null, Locale.FRENCH));
        System.out.println(messageSource.getMessage("welcome", null, new Locale("hi", "IN")));
    }
}
