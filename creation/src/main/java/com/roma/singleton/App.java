package com.roma.singleton;

/**
 * <p> Main test </p>
 *
 * @author Roma
 * @version 1.0
 * @since 2016/10/25
 * @see EagerExample#getInstance()
 * @see LazyExample#getInstance()
 * @see DoubleCheckExample#getInstance()
 * @see StaticInnerClassExample#getInstance()
 * @see EnumExample#INSTANCE
 * @see java.lang.Runtime#getRuntime()
 * @see java.awt.Desktop#getDesktop()
 * @see java.lang.System#getSecurityManager()
 */
public class App {

    public static void main(String[] args) {

        App.testEager();
        App.testLazy();
        App.testDoubleCheck();
        App.testInnerClass();
        App.testEnum();

    }

    public static void testEnum() {
        System.out.println(EnumExample.INSTANCE);
        System.out.println(EnumExample.INSTANCE);
        System.out.println();
    }

    public static void testInnerClass() {
        System.out.println(StaticInnerClassExample.getInstance());
        System.out.println(StaticInnerClassExample.getInstance());
        System.out.println();
    }

    public static void testDoubleCheck() {
        System.out.println(DoubleCheckExample.getInstance());
        System.out.println(DoubleCheckExample.getInstance());
        System.out.println();
    }

    public static void testLazy() {
        System.out.println(LazyExample.getInstance());
        System.out.println(LazyExample.getInstance());
        System.out.println();
    }

    public static void testEager() {
        System.out.println(EagerExample.getInstance());
        System.out.println(EagerExample.getInstance());
        System.out.println();
    }
}
