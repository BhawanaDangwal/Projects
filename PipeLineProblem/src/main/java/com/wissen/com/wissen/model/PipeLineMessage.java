package com.wissen.com.wissen.model;

public class PipeLineMessage {

    private String pipelineNo;
    private String company;
    private Integer  seqence;

    public String getPipelineNo() {
        return pipelineNo;
    }

    public void setPipelineNo(String pipelineNo) {
        this.pipelineNo = pipelineNo;
    }

    public PipeLineMessage(String pipelineNo,String company, Integer sequence)
    {
        this.pipelineNo=pipelineNo;
        this.company=company;
        this.seqence=sequence;
        toString();
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getSeqence() {
        return seqence;
    }

    public void setSeqence(Integer seqence) {
        this.seqence = seqence;
    }

    @Override
    public String toString() {
        return new StringBuffer("New Message[").append(pipelineNo).append(",").append(company).append(",").append(seqence).append(") created").toString();
    }
}
