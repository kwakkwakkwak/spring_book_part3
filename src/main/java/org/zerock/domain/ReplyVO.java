package org.zerock.domain;

import java.util.Date;

public class ReplyVO {
    private Integer rno;
    private Integer bno;
    private String replayText;
    private String replayer;

    private Date regdate;
    private Date updatedate;

    @Override
    public String toString() {
        return "ReplyVO{" +
                "rno=" + rno +
                ", bno=" + bno +
                ", replayText='" + replayText + '\'' +
                ", replayer='" + replayer + '\'' +
                ", regdate=" + regdate +
                ", updatedate=" + updatedate +
                '}';
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getReplayText() {
        return replayText;
    }

    public void setReplayText(String replayText) {
        this.replayText = replayText;
    }

    public String getReplayer() {
        return replayer;
    }

    public void setReplayer(String replayer) {
        this.replayer = replayer;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}
