package com.yalunwang.summer;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {
    private List<PropertyValue> list = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue){
        list.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValueList(){
        return list;
    }
}
