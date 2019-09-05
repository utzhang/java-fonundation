package com.utz.test;

public class TestDefaultPackage2 {
    public static void main(String[] args) {
        TestDefaultPackage testDefaultPackage = new TestDefaultPackage();

        //default缺省情况下，可以访问，protected也可以，但是如果是private修饰，则不行
        //System.out.println(testDefaultPackage.name);

        //缺省修饰的方法，可以直接调用
        System.out.println(testDefaultPackage.getName());

    }
}
