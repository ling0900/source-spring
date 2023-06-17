package cn.bugstack.springframework.beans.factory.config;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    private Class beanClass;

    /**
     * Instantiates a new Bean definition.
     * 注意，这里是放的Class格式的信息
     * @param beanClass the bean class
     */
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
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
}
