package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.beans.PropertyValues;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    /**
     * Instantiates a new Bean definition.
     *
     * @param beanClass the bean class
     */
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    /**
     * Instantiates a new Bean definition.
     *
     * @param beanClass      the bean class
     * @param propertyValues the property values
     */
    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    /**
     * Gets bean class.
     *
     * @return the bean class
     */
    public Class getBeanClass() {
        return beanClass;
    }

    /**
     * Sets bean class.
     *
     * @param beanClass the bean class
     */
    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    /**
     * Gets property values.
     *
     * @return the property values
     */
    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    /**
     * Sets property values.
     *
     * @param propertyValues the property values
     */
    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
