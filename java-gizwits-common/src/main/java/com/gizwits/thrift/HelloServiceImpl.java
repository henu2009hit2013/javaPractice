/*
 * Copyright (c) 2016.  feel ,www.feel88.cn
 * This program is my java practice.you  will be learn more .
 */

package com.gizwits.thrift;

import org.apache.thrift.TException;

public class HelloServiceImpl implements Hello.Iface {
    public boolean helloBoolean(boolean para) throws TException {
        System.out.printf("hello true/false");
        return para;
    }

    public int helloInt(int para) throws TException {
        System.out.println("hello times: " + para);
        return para;
    }

    public String helloNull() throws TException {
        System.out.println("hello null");
        return null;
    }

    public String helloString(String para) throws TException {
        System.out.println("hello " + para);
        return para;
    }

    public void helloVoid() throws TException {
        System.out.println("Hello World");
    }
}