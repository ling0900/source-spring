package cn.bugstack.springframework.beans;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * <p>
 * bean 属性信息
 */
public class PropertyValue {

    private final String name;

    // 这里的value可能是任何东西！
    private final Object value;

    /**
     * Instantiates a new Property value.
     *
     * @param name  the name
     * @param value the value
     */
    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public Object getValue() {
        return value;
    }

}
