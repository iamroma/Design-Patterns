package com.roma.singleton;

/**
 * 饿汉单例模式
 *
 * @author Roma
 * @version 1.0
 * @since 2016/10/25
 */
public final class EagerExample {

    private static final EagerExample instance = new EagerExample();

    /** Don't let anyone else instantiate this class */
    private EagerExample() {}

    /** Global access point */
    public static EagerExample getInstance() {
        return instance;
    }

}
