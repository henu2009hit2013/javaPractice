/*
 * Copyright (c) 2016.  feel ,www.feel88.cn
 * This program is my java practice.you  will be learn more .
 */

package com.gizwits.amino;

import org.amino.ds.lockfree.LockFreePriorityQueue;

import java.io.IOException;
import java.util.Queue;


public class LogServerGood {
    /*Standard Queue interface*/
    private Queue<String> queue;

    public LogServerGood() throws IOException {
        /*Amino components are compatible with standard interface whenever
         * possible*/
        queue = new LockFreePriorityQueue<String>();

    }

}