/***********************************************
 * File Name: ObjectFactoryBean
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 14:12
 ***********************************************/

package com.duochuang.beans;

import org.springframework.beans.factory.FactoryBean;

public class ObjectFactoryBean implements FactoryBean<ObjectFactory> {
    @Override
    public ObjectFactory getObject() {
        System.out.println("返回对象");
        return new ObjectFactory();
    }

    @Override
    public Class<?> getObjectType() {
        return ObjectFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
