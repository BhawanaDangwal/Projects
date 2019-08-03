package com.wissen.service;

import com.wissen.util.PipeLineMessageFactory;

import java.util.Set;

public class AggregatorService {
    /**
     * This method takes all pipeline message given
     * as input and print the processed elements
     */
    public void diplayProcessedPipeline() {
        PipeLineMessageFactory.pipeLineFactoryMap.entrySet().forEach(entry -> {

            Set<Integer> value = entry.getValue();
            StringBuffer message = new StringBuffer(entry.getKey()).append(" processed Elements :");
            int count = 1;
            while (value.contains(count)) {
                message.append(count).append(",");
                count++;
            }
            System.out.println(message.toString());

        });
    }
}
