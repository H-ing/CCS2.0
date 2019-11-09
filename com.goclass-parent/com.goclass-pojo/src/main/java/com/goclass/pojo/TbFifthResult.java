package com.goclass.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbFifthResult implements Serializable {
    private Long fiveresultId;

    private Date gmtCreate;

    private Date gmtModified;

    private byte[] fiveresultDatavalue;

    public Long getFiveresultId() {
        return fiveresultId;
    }

    public void setFiveresultId(Long fiveresultId) {
        this.fiveresultId = fiveresultId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public byte[] getFiveresultDatavalue() {
        return fiveresultDatavalue;
    }

    public void setFiveresultDatavalue(byte[] fiveresultDatavalue) {
        this.fiveresultDatavalue = fiveresultDatavalue;
    }
}