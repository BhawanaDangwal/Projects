package com.wissen.com.wissen.model;

public class PipeLineMessage implements Message {

    private String pipelineNo;
    private String company;
    private Integer seqence;

    public PipeLineMessage(String pipelineNo, String company, Integer sequence) {
        this.pipelineNo = pipelineNo;
        this.company = company;
        this.seqence = sequence;
        toString();
    }

    public String getPipelineNo() {
        return pipelineNo;
    }

    public String getCompany() {
        return company;
    }
    public Integer getSeqence() {
        return seqence;
    }

    @Override
    public String toString() {
        return new StringBuffer("New Message[").append(pipelineNo).append(",").append(company).append(",").append(seqence).append(") created").toString();
    }
}
