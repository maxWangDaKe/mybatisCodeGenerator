package cn.csdn.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbLoanInfo implements Serializable {
    private String loanInfoId;

    private String contractId;

    private String partyId;

    private String loanStatusCd;

    private String userNum;

    private String orgNum;

    private String loanInfoNum;

    private Date handlingDate;

    private Date createTime;

    private Date updateTime;

    private String ifDataMove;

    private static final long serialVersionUID = 1L;

    public String getLoanInfoId() {
        return loanInfoId;
    }

    public void setLoanInfoId(String loanInfoId) {
        this.loanInfoId = loanInfoId == null ? null : loanInfoId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getLoanStatusCd() {
        return loanStatusCd;
    }

    public void setLoanStatusCd(String loanStatusCd) {
        this.loanStatusCd = loanStatusCd == null ? null : loanStatusCd.trim();
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    public String getOrgNum() {
        return orgNum;
    }

    public void setOrgNum(String orgNum) {
        this.orgNum = orgNum == null ? null : orgNum.trim();
    }

    public String getLoanInfoNum() {
        return loanInfoNum;
    }

    public void setLoanInfoNum(String loanInfoNum) {
        this.loanInfoNum = loanInfoNum == null ? null : loanInfoNum.trim();
    }

    public Date getHandlingDate() {
        return handlingDate;
    }

    public void setHandlingDate(Date handlingDate) {
        this.handlingDate = handlingDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIfDataMove() {
        return ifDataMove;
    }

    public void setIfDataMove(String ifDataMove) {
        this.ifDataMove = ifDataMove == null ? null : ifDataMove.trim();
    }
}