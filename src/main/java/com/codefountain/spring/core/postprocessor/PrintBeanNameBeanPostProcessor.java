package com.codefountain.spring.core.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PrintBeanNameBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof Action) {
            System.out.println("PrintBeanNameBeanPostProcessor - postProcessBeforeInitialization Bean type = " + bean.getClass());
            System.out.println("PrintBeanNameBeanPostProcessor - postProcessBeforeInitialization Bean name = " + beanName);
            System.out.println();
        }

        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof Action) {
            System.out.println("PrintBeanNameBeanPostProcessor - postProcessAfterInitialization Bean type = " + bean.getClass());
            System.out.println("PrintBeanNameBeanPostProcessor - postProcessAfterInitialization Bean name = " + beanName);
            System.out.println();
        }
        return bean;
    }
}
