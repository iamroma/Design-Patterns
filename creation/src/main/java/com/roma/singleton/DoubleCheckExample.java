package com.roma.singleton;

/**
 * 懒汉单例模式（双重鉴定）
 *
 * @author Roma
 * @version 1.0
 * @since 2016/10/25
 */
public final class DoubleCheckExample {

    private static volatile DoubleCheckExample instance;

    private DoubleCheckExample() {

        if (instance != null) {
            throw new IllegalStateException("DoubleCheckExample instance has already been initialized");
        }
    }

    public static DoubleCheckExample getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckExample.class) {
                if (instance == null) {
                    instance = new DoubleCheckExample();
                }
            }
        }
        return instance;
    }


}
