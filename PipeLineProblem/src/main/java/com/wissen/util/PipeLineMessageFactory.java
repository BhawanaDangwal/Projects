package com.wissen.util;

import com.wissen.com.wissen.model.Message;

import java.util.*;

public class PipeLineMessageFactory {

    public static Map<String, Set<Integer>> pipeLineFactoryMap = new HashMap<String, Set<Integer>>();

    /**
     * this method take string pipeline message,
     * convert it to PipelineMessage object and add
     * it to factoryMap
     * @param s
     */
    public static void parseInputPipelineMessage(String s) {
        try {
            addMessage(MessageParser.createMessage(s));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method add PipeLineMessage in factoryMap
     * @param message
     */
    private static void addMessage(Message message) {

        if (pipeLineFactoryMap.containsKey(message.getCompany())) {
            pipeLineFactoryMap.get(message.getCompany()).add(message.getSeqence());
        } else {
            Set<Integer> set = new TreeSet<Integer>();
            set.add(message.getSeqence());
            pipeLineFactoryMap.put(message.getCompany(), set);
        }

    }


}
