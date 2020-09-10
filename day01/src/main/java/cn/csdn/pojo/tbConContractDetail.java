package cn.csdn.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class tbConContractDetail implements Serializable {
    private String contractDetailId;

    private String contractId;

    private String approveDetailId;

    private String productCd;

    private Short broadCycle;

    private String broadCycleUnit;

    private Date createTime;

    private Date updateTime;

    private BigDecimal loanAmt;

    private String currencyCd;

    private static final long serialVersionUID = 1L;

    public String getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(String contractDetailId) {
        this.contractDetailId = contractDetailId == null ? null : contractDetailId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getApproveDetailId() {
        return approveDetailId;
    }

    public void setApproveDetailId(String approveDetailId) {
        this.approveDetailId = approveDetailId == null ? null : approveDetailId.trim();
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd == null ? null : productCd.trim();
    }

    public Short getBroadCycle() {
        return broadCycle;
    }

    public void setBroadCycle(Short broadCycle) {
        this.broadCycle = broadCycle;
    }

    public String getBroadCycleUnit() {
        return broadCycleUnit;
    }

    public void setBroadCycleUnit(String broadCycleUnit) {
        this.broadCycleUnit = broadCycleUnit == null ? null : broadCycleUnit.trim();
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

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd == null ? null : currencyCd.trim();
    }
}