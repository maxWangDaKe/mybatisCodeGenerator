package cn.csdn.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class tbConAccountInfo implements Serializable {
    private String accountId;

    private String contractDetailId;

    private String bizAccountTypeCd;

    private String accountNum;

    private String accountName;

    private String openingBankNo;

    private String openingBankName;

    private BigDecimal balanceOfAccount;

    private String currencyCd;

    private Date createTime;

    private Date updateTime;

    private String isMonitorAccount;

    private static final long serialVersionUID = 1L;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(String contractDetailId) {
        this.contractDetailId = contractDetailId == null ? null : contractDetailId.trim();
    }

    public String getBizAccountTypeCd() {
        return bizAccountTypeCd;
    }

    public void setBizAccountTypeCd(String bizAccountTypeCd) {
        this.bizAccountTypeCd = bizAccountTypeCd == null ? null : bizAccountTypeCd.trim();
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum == null ? null : accountNum.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getOpeningBankNo() {
        return openingBankNo;
    }

    public void setOpeningBankNo(String openingBankNo) {
        this.openingBankNo = openingBankNo == null ? null : openingBankNo.trim();
    }

    public String getOpeningBankName() {
        return openingBankName;
    }

    public void setOpeningBankName(String openingBankName) {
        this.openingBankName = openingBankName == null ? null : openingBankName.trim();
    }

    public BigDecimal getBalanceOfAccount() {
        return balanceOfAccount;
    }

    public void setBalanceOfAccount(BigDecimal balanceOfAccount) {
        this.balanceOfAccount = balanceOfAccount;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd == null ? null : currencyCd.trim();
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

    public String getIsMonitorAccount() {
        return isMonitorAccount;
    }

    public void setIsMonitorAccount(String isMonitorAccount) {
        this.isMonitorAccount = isMonitorAccount == null ? null : isMonitorAccount.trim();
    }
}