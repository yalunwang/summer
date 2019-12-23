package com.yalunwang.summer;

/**
 * bean元数据信息
 * yaluwang
 * 2019/12/22
 */
public class BeanDefinition {
    private String beanName;
    private Class beanClass;
    private Object bean;
    private PropertyValues propertyValues = new PropertyValues();
    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;

        try {
           setBeanClass( Class.forName(beanName));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
