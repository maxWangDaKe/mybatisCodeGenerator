package cn.csdn.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbLoanIntRate implements Serializable {
    private String loanIntRateId;

    private String loanDetailId;

    private String rateType;

    private String rateBasisType;

    private String rateLevel;

    private String rateFloatType;

    private String rateFloatModel;

    private BigDecimal rateFloatProportion;

    private String interestTakingType;

    private BigDecimal overdueRateUpProportion;

    private BigDecimal embezzleFloatupProportion;

    private BigDecimal yearRate;

    private Date createTime;

    private Date updateTime;

    private String irBasics;

    private String isChangeRate;

    private String interestCollectType;

    private String baseRateKey;

    private BigDecimal baseRateValue;

    private String irUpdateFrequency;

    private String irChangeType;

    private String psRate;

    private String peRate;

    private Date spreadVDate;

    private Date intRateVDate;

    private String rateFloatingFrequency;

    private Date lastChgDate;

    private String otherRateAgreement;

    private Date periorRateUpdateDate;

    private String settlementFrequency;

    private BigDecimal newYearRate;

    private BigDecimal rateFloatMember;

    private static final long serialVersionUID = 1L;

    public String getLoanIntRateId() {
        return loanIntRateId;
    }

    public void setLoanIntRateId(String loanIntRateId) {
        this.loanIntRateId = loanIntRateId == null ? null : loanIntRateId.trim();
    }

    public String getLoanDetailId() {
        return loanDetailId;
    }

    public void setLoanDetailId(String loanDetailId) {
        this.loanDetailId = loanDetailId == null ? null : loanDetailId.trim();
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType == null ? null : rateType.trim();
    }

    public String getRateBasisType() {
        return rateBasisType;
    }

    public void setRateBasisType(String rateBasisType) {
        this.rateBasisType = rateBasisType == null ? null : rateBasisType.trim();
    }

    public String getRateLevel() {
        return rateLevel;
    }

    public void setRateLevel(String rateLevel) {
        this.rateLevel = rateLevel == null ? null : rateLevel.trim();
    }

    public String getRateFloatType() {
        return rateFloatType;
    }

    public void setRateFloatType(String rateFloatType) {
        this.rateFloatType = rateFloatType == null ? null : rateFloatType.trim();
    }

    public String getRateFloatModel() {
        return rateFloatModel;
    }

    public void setRateFloatModel(String rateFloatModel) {
        this.rateFloatModel = rateFloatModel == null ? null : rateFloatModel.trim();
    }

    public BigDecimal getRateFloatProportion() {
        return rateFloatProportion;
    }

    public void setRateFloatProportion(BigDecimal rateFloatProportion) {
        this.rateFloatProportion = rateFloatProportion;
    }

    public String getInterestTakingType() {
        return interestTakingType;
    }

    public void setInterestTakingType(String interestTakingType) {
        this.interestTakingType = interestTakingType == null ? null : interestTakingType.trim();
    }

    public BigDecimal getOverdueRateUpProportion() {
        return overdueRateUpProportion;
    }

    public void setOverdueRateUpProportion(BigDecimal overdueRateUpProportion) {
        this.overdueRateUpProportion = overdueRateUpProportion;
    }

    public BigDecimal getEmbezzleFloatupProportion() {
        return embezzleFloatupProportion;
    }

    public void setEmbezzleFloatupProportion(BigDecimal embezzleFloatupProportion) {
        this.embezzleFloatupProportion = embezzleFloatupProportion;
    }

    public BigDecimal getYearRate() {
        return yearRate;
    }

    public void setYearRate(BigDecimal yearRate) {
        this.yearRate = yearRate;
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

    public String getIrBasics() {
        return irBasics;
    }

    public void setIrBasics(String irBasics) {
        this.irBasics = irBasics == null ? null : irBasics.trim();
    }

    public String getIsChangeRate() {
        return isChangeRate;
    }

    public void setIsChangeRate(String isChangeRate) {
        this.isChangeRate = isChangeRate == null ? null : isChangeRate.trim();
    }

    public String getInterestCollectType() {
        return interestCollectType;
    }

    public void setInterestCollectType(String interestCollectType) {
        this.interestCollectType = interestCollectType == null ? null : interestCollectType.trim();
    }

    public String getBaseRateKey() {
        return baseRateKey;
    }

    public void setBaseRateKey(String baseRateKey) {
        this.baseRateKey = baseRateKey == null ? null : baseRateKey.trim();
    }

    public BigDecimal getBaseRateValue() {
        return baseRateValue;
    }

    public void setBaseRateValue(BigDecimal baseRateValue) {
        this.baseRateValue = baseRateValue;
    }

    public String getIrUpdateFrequency() {
        return irUpdateFrequency;
    }

    public void setIrUpdateFrequency(String irUpdateFrequency) {
        this.irUpdateFrequency = irUpdateFrequency == null ? null : irUpdateFrequency.trim();
    }

    public String getIrChangeType() {
        return irChangeType;
    }

    public void setIrChangeType(String irChangeType) {
        this.irChangeType = irChangeType == null ? null : irChangeType.trim();
    }

    public String getPsRate() {
        return psRate;
    }

    public void setPsRate(String psRate) {
        this.psRate = psRate == null ? null : psRate.trim();
    }

    public String getPeRate() {
        return peRate;
    }

    public void setPeRate(String peRate) {
        this.peRate = peRate == null ? null : peRate.trim();
    }

    public Date getSpreadVDate() {
        return spreadVDate;
    }

    public void setSpreadVDate(Date spreadVDate) {
        this.spreadVDate = spreadVDate;
    }

    public Date getIntRateVDate() {
        return intRateVDate;
    }

    public void setIntRateVDate(Date intRateVDate) {
        this.intRateVDate = intRateVDate;
    }

    public String getRateFloatingFrequency() {
        return rateFloatingFrequency;
    }

    public void setRateFloatingFrequency(String rateFloatingFrequency) {
        this.rateFloatingFrequency = rateFloatingFrequency == null ? null : rateFloatingFrequency.trim();
    }

    public Date getLastChgDate() {
        return lastChgDate;
    }

    public void setLastChgDate(Date lastChgDate) {
        this.lastChgDate = lastChgDate;
    }

    public String getOtherRateAgreement() {
        return otherRateAgreement;
    }

    public void setOtherRateAgreement(String otherRateAgreement) {
        this.otherRateAgreement = otherRateAgreement == null ? null : otherRateAgreement.trim();
    }

    public Date getPeriorRateUpdateDate() {
        return periorRateUpdateDate;
    }

    public void setPeriorRateUpdateDate(Date periorRateUpdateDate) {
        this.periorRateUpdateDate = periorRateUpdateDate;
    }

    public String getSettlementFrequency() {
        return settlementFrequency;
    }

    public void setSettlementFrequency(String settlementFrequency) {
        this.settlementFrequency = settlementFrequency == null ? null : settlementFrequency.trim();
    }

    public BigDecimal getNewYearRate() {
        return newYearRate;
    }

    public void setNewYearRate(BigDecimal newYearRate) {
        this.newYearRate = newYearRate;
    }

    public BigDecimal getRateFloatMember() {
        return rateFloatMember;
    }

    public void setRateFloatMember(BigDecimal rateFloatMember) {
        this.rateFloatMember = rateFloatMember;
    }
}