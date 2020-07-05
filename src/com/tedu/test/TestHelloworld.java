package com.tedu.test;

public class TestHelloworld {

    public static void main(String[] args) {
        T1();
        T1();
        System.out.println("helloworld");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    private static void T1() {
        System.out.println("helloworld");
        System.out.println("helloworld");
    }

}
