/*
 * Copyright (c) 2017.  feel ,www.feel88.cn
 * This program is my java practice.you  will be learn more.
 */

package com.gizwits.agent;


import com.gizwits.annotation.GizwitsLogging;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.implementation.SuperMethodCall;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.instrument.Instrumentation;

public class AppAgent {

    public static void premain(String arg, Instrumentation inst) {

        new AgentBuilder.Default()
                .type(ElementMatchers.any())
                .transform((builder, type, classLoader, module) -> builder.method(ElementMatchers.isAnnotatedWith(GizwitsLogging.class))
                        .intercept(MethodDelegation.to(LoggingInterceptor.class).andThen(SuperMethodCall.INSTANCE))

                )
                .installOn(inst);
    }

    public static void agentmain(String arg, Instrumentation inst) {

    }


}
