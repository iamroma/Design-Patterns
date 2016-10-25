package com.roma.singleton;

/**
 * 懒汉单例模式
 *
 * @author Roma
 * @version 1.0
 * @since 2016/10/25
 */
public final class LazyExample {

    private static LazyExample instance;

    private LazyExample() {}

    public static synchronized LazyExample getInstance() {

        if (instance == null) {
            instance = new LazyExample();
        }

        return instance;
    }
}
