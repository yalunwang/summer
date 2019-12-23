package com.yalunwang.summer.factory;

import com.yalunwang.summer.BeanDefinition;
import com.yalunwang.summer.PropertyValue;

import java.lang.reflect.Field;

public class AutowireCapableBeanFactory extends AbstractBeanFactory {


    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = beanDefinition.getBeanClass().newInstance();
        applyPropertyValues(bean,beanDefinition);
        return bean;
    }

    private void applyPropertyValues(Object bean ,BeanDefinition banDefinition) throws Exception {
        for (PropertyValue propertyValue:banDefinition.getPropertyValues().getPropertyValueList()){
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }
    }


}
