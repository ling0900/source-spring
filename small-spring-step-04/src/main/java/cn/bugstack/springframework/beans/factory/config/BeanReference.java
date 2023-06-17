package cn.bugstack.springframework.beans.factory.config;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * <p>
 * Bean 的引用
 */
public class BeanReference {

    private final String beanName;

    /**
     * Instantiates a new Bean reference.
     * 根据beanName获取它的引用
     * @param beanName the bean name
     */
    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    /**
     * Gets bean name.
     *
     * @return the bean name
     */
    public String getBeanName() {
        return beanName;
    }

}
