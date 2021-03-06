/*
 * Copyright (c) 2017.  feel ,www.feel88.cn
 * This program is my java practice.you  will be learn more.
 */

package com.gizwits.agent;


import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class LoggingInterceptor {

    @RuntimeType
    public static Object intercept(@Origin Method method,
                                   @SuperCall Callable<?> callable) {
        long start = System.currentTimeMillis();
        try {

            return callable.call();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            System.out.println(method + " took " + (System.currentTimeMillis() - start));
        }
    }
}
