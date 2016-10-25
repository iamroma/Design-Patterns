package com.roma.singleton;

/**
 * 懒汉单例模式（静态内部类）
 *
 * @author Roma
 * @version 1.0
 * @since 2016/10/25
 */
public final class StaticInnerClassExample {

    private StaticInnerClassExample() {}

    public static StaticInnerClassExample getInstance() {
        return InnerHelper.instance;
    }

    private static class InnerHelper {

        private static final StaticInnerClassExample instance = new StaticInnerClassExample();
    }
}
