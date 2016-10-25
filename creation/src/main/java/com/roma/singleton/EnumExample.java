package com.roma.singleton;

/**
 * 枚举单例模式
 *
 * @author Roma
 * @version 1.0
 * @since 2016/10/25
 */
public enum EnumExample {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
