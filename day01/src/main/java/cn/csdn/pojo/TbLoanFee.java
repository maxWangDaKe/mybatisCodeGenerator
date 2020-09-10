package cn.csdn.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbLoanFee implements Serializable {
    private String feeId;

    private String costType;

    private String chargingDirection;

    private String chargingFrequency;

    private String chargingType;

    private Integer chargingProportion;

    private BigDecimal shouldFee;

    private BigDecimal reductionFee;

    private BigDecimal actualFee;

    private Date feeDate;

    private Date createTime;

    private Date updateTime;

    private String loanDetailId;

    private static final long serialVersionUID = 1L;

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId == null ? null : feeId.trim();
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType == null ? null : costType.trim();
    }

    public String getChargingDirection() {
        return chargingDirection;
    }

    public void setChargingDirection(String chargingDirection) {
        this.chargingDirection = chargingDirection == null ? null : chargingDirection.trim();
    }

    public String getChargingFrequency() {
        return chargingFrequency;
    }

    public void setChargingFrequency(String chargingFrequency) {
        this.chargingFrequency = chargingFrequency == null ? null : chargingFrequency.trim();
    }

    public String getChargingType() {
        return chargingType;
    }

    public void setChargingType(String chargingType) {
        this.chargingType = chargingType == null ? null : chargingType.trim();
    }

    public Integer getChargingProportion() {
        return chargingProportion;
    }

    public void setChargingProportion(Integer chargingProportion) {
        this.chargingProportion = chargingProportion;
    }

    public BigDecimal getShouldFee() {
        return shouldFee;
    }

    public void setShouldFee(BigDecimal shouldFee) {
        this.shouldFee = shouldFee;
    }

    public BigDecimal getReductionFee() {
        return reductionFee;
    }

    public void setReductionFee(BigDecimal reductionFee) {
        this.reductionFee = reductionFee;
    }

    public BigDecimal getActualFee() {
        return actualFee;
    }

    public void setActualFee(BigDecimal actualFee) {
        this.actualFee = actualFee;
    }

    public Date getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(Date feeDate) {
        this.feeDate = feeDate;
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

    public String getLoanDetailId() {
        return loanDetailId;
    }

    public void setLoanDetailId(String loanDetailId) {
        this.loanDetailId = loanDetailId == null ? null : loanDetailId.trim();
    }
}