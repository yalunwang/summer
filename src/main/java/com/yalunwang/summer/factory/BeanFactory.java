package com.yalunwang.summer.factory;


import com.yalunwang.summer.BeanDefinition;

/**
 * bean工厂根接口
 * yaluwang
 * 2019/12/22
 */
public interface BeanFactory {
    Object getBean(String beanName);
    void registerBeanDefinition(String name, BeanDefinition beanDefinition)throws Exception;
}
