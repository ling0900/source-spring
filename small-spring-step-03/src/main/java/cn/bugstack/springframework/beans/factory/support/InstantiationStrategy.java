package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * <p>
 * Bean 实例化策略
 */
public interface InstantiationStrategy {

    /**
     * Instantiate object.实力化一个对象
     *
     * @param beanDefinition the bean definition
     * @param beanName       the bean name
     * @param ctor           the ctor
     * @param args           the args
     * @return the object
     * @throws BeansException the beans exception
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
