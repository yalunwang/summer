package com.yalunwang.summer;

import com.yalunwang.summer.factory.AutowireCapableBeanFactory;
import com.yalunwang.summer.factory.BeanFactory;
import org.junit.Test;

public class TestIoc {

    @Test
    public void say() throws Exception {
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanName("com.yalunwang.summer.HelloWorldService");

        PropertyValues propertyValues = new  PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("myName","yalunwang"));
        beanDefinition.setPropertyValues(propertyValues);

        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);
        HelloWorldService  helloWorldService =(HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.sayHello();
    }
}
