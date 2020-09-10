package cn.csdn.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbLoanSummary implements Serializable {
    private String loanSummaryId;

    private String loanNum;

    private BigDecimal loanBalance;

    private String currencyCd;

    private BigDecimal loanAmt;

    private String syndicatedShareId;

    private String classificationResultCd;

    private String contractId;

    private String partyId;

    private String yearClassificationResultCd;

    private Long creditTerm;

    private String cycleUnit;

    private Date loanRecombinationDate;

    private String overdueFlag;

    private String extensionFlag;

    private String loanFiveLevelClassification;

    private String loanStatus;

    private Date endDate;

    private String loanAccount;

    private Date loanActualMaturity;

    private Date loanOriginalExpirationDate;

    private Date loanActualPaymentDate;

    private String currentPeriod;

    private String totalPeriods;

    private BigDecimal benchmarkInterestRate;

    private BigDecimal depositAmount;

    private String loanTerm;

    private String marginAccount;

    private Date acquisitionDate;

    private String entrustedPaymentMark;

    private String continuousArrearsPeriods;

    private String cumulativeArrearsPeriods;

    private String nowTurnSign;

    private String creditStaffNumber;

    private String loanOfficerName;

    private String noteNumber;

    private BigDecimal rateFloatProportion;

    private String interestBearingManner;

    private String repaymentChannels;

    private String repaymentAccount;

    private String repaymentType;

    private BigDecimal parValue;

    private String customerUnifiedNum;

    private String detailedItemName;

    private String loanAccountNumber;

    private String bankCode;

    private String financialLicenseNo;

    private String internalMechanism;

    private String detailItemNumber;

    private String bankName;

    private Date repayDate;

    private BigDecimal repayAmt;

    private BigDecimal repayLnterest;

    private String repayOrgNum;

    private Date createTime;

    private Date updateTime;

    private String loanDetailId;

    private String subjectno;

    private String overduesubjectno1;

    private String overduesubjectno2;

    private String dullsubjectno;

    private String badsubjectno;

    private BigDecimal discountsum;

    private BigDecimal normalbalance;

    private BigDecimal overduebalance1;

    private BigDecimal overduebalance2;

    private BigDecimal dullbalance;

    private BigDecimal badbalance;

    private String advanceflag;

    private String scfApplyNum;

    private String invoiceBatchNum;

    private String loanQuasiOdd;

    private BigDecimal interestbalance1;

    private BigDecimal interestbalance2;

    private String creditUseAddress;

    private String businessNum;

    private BigDecimal mfnormalbalance;

    private BigDecimal mfoverduebalance1;

    private BigDecimal mfoverduebalance2;

    private BigDecimal mfdullbalance;

    private BigDecimal mfbadbalance;

    private String productType;

    private BigDecimal mfBalance;

    private String orgNum;

    private String mforgid;

    private Date mfupdatedate;

    private Date mfupdatedate1;

    private BigDecimal mfinterestbalance1;

    private BigDecimal mfinterestbalance2;

    private String oldSumId;

    private String paymenttype;

    private String auflag;

    private String keyvalue;

    private String productcode;

    private String trandiscountstatus;

    private String psoverduedays;

    private String peoverduedays;

    private BigDecimal interestreceivable;

    private BigDecimal dpbalance;

    private String userNum;

    private BigDecimal deferInterest;

    private String riskExposuer;

    private String assetsClassification;

    private static final long serialVersionUID = 1L;

    public String getLoanSummaryId() {
        return loanSummaryId;
    }

    public void setLoanSummaryId(String loanSummaryId) {
        this.loanSummaryId = loanSummaryId == null ? null : loanSummaryId.trim();
    }

    public String getLoanNum() {
        return loanNum;
    }

    public void setLoanNum(String loanNum) {
        this.loanNum = loanNum == null ? null : loanNum.trim();
    }

    public BigDecimal getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(BigDecimal loanBalance) {
        this.loanBalance = loanBalance;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd == null ? null : currencyCd.trim();
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public String getSyndicatedShareId() {
        return syndicatedShareId;
    }

    public void setSyndicatedShareId(String syndicatedShareId) {
        this.syndicatedShareId = syndicatedShareId == null ? null : syndicatedShareId.trim();
    }

    public String getClassificationResultCd() {
        return classificationResultCd;
    }

    public void setClassificationResultCd(String classificationResultCd) {
        this.classificationResultCd = classificationResultCd == null ? null : classificationResultCd.trim();
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

    public String getYearClassificationResultCd() {
        return yearClassificationResultCd;
    }

    public void setYearClassificationResultCd(String yearClassificationResultCd) {
        this.yearClassificationResultCd = yearClassificationResultCd == null ? null : yearClassificationResultCd.trim();
    }

    public Long getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(Long creditTerm) {
        this.creditTerm = creditTerm;
    }

    public String getCycleUnit() {
        return cycleUnit;
    }

    public void setCycleUnit(String cycleUnit) {
        this.cycleUnit = cycleUnit == null ? null : cycleUnit.trim();
    }

    public Date getLoanRecombinationDate() {
        return loanRecombinationDate;
    }

    public void setLoanRecombinationDate(Date loanRecombinationDate) {
        this.loanRecombinationDate = loanRecombinationDate;
    }

    public String getOverdueFlag() {
        return overdueFlag;
    }

    public void setOverdueFlag(String overdueFlag) {
        this.overdueFlag = overdueFlag == null ? null : overdueFlag.trim();
    }

    public String getExtensionFlag() {
        return extensionFlag;
    }

    public void setExtensionFlag(String extensionFlag) {
        this.extensionFlag = extensionFlag == null ? null : extensionFlag.trim();
    }

    public String getLoanFiveLevelClassification() {
        return loanFiveLevelClassification;
    }

    public void setLoanFiveLevelClassification(String loanFiveLevelClassification) {
        this.loanFiveLevelClassification = loanFiveLevelClassification == null ? null : loanFiveLevelClassification.trim();
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus == null ? null : loanStatus.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount == null ? null : loanAccount.trim();
    }

    public Date getLoanActualMaturity() {
        return loanActualMaturity;
    }

    public void setLoanActualMaturity(Date loanActualMaturity) {
        this.loanActualMaturity = loanActualMaturity;
    }

    public Date getLoanOriginalExpirationDate() {
        return loanOriginalExpirationDate;
    }

    public void setLoanOriginalExpirationDate(Date loanOriginalExpirationDate) {
        this.loanOriginalExpirationDate = loanOriginalExpirationDate;
    }

    public Date getLoanActualPaymentDate() {
        return loanActualPaymentDate;
    }

    public void setLoanActualPaymentDate(Date loanActualPaymentDate) {
        this.loanActualPaymentDate = loanActualPaymentDate;
    }

    public String getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod == null ? null : currentPeriod.trim();
    }

    public String getTotalPeriods() {
        return totalPeriods;
    }

    public void setTotalPeriods(String totalPeriods) {
        this.totalPeriods = totalPeriods == null ? null : totalPeriods.trim();
    }

    public BigDecimal getBenchmarkInterestRate() {
        return benchmarkInterestRate;
    }

    public void setBenchmarkInterestRate(BigDecimal benchmarkInterestRate) {
        this.benchmarkInterestRate = benchmarkInterestRate;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm == null ? null : loanTerm.trim();
    }

    public String getMarginAccount() {
        return marginAccount;
    }

    public void setMarginAccount(String marginAccount) {
        this.marginAccount = marginAccount == null ? null : marginAccount.trim();
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getEntrustedPaymentMark() {
        return entrustedPaymentMark;
    }

    public void setEntrustedPaymentMark(String entrustedPaymentMark) {
        this.entrustedPaymentMark = entrustedPaymentMark == null ? null : entrustedPaymentMark.trim();
    }

    public String getContinuousArrearsPeriods() {
        return continuousArrearsPeriods;
    }

    public void setContinuousArrearsPeriods(String continuousArrearsPeriods) {
        this.continuousArrearsPeriods = continuousArrearsPeriods == null ? null : continuousArrearsPeriods.trim();
    }

    public String getCumulativeArrearsPeriods() {
        return cumulativeArrearsPeriods;
    }

    public void setCumulativeArrearsPeriods(String cumulativeArrearsPeriods) {
        this.cumulativeArrearsPeriods = cumulativeArrearsPeriods == null ? null : cumulativeArrearsPeriods.trim();
    }

    public String getNowTurnSign() {
        return nowTurnSign;
    }

    public void setNowTurnSign(String nowTurnSign) {
        this.nowTurnSign = nowTurnSign == null ? null : nowTurnSign.trim();
    }

    public String getCreditStaffNumber() {
        return creditStaffNumber;
    }

    public void setCreditStaffNumber(String creditStaffNumber) {
        this.creditStaffNumber = creditStaffNumber == null ? null : creditStaffNumber.trim();
    }

    public String getLoanOfficerName() {
        return loanOfficerName;
    }

    public void setLoanOfficerName(String loanOfficerName) {
        this.loanOfficerName = loanOfficerName == null ? null : loanOfficerName.trim();
    }

    public String getNoteNumber() {
        return noteNumber;
    }

    public void setNoteNumber(String noteNumber) {
        this.noteNumber = noteNumber == null ? null : noteNumber.trim();
    }

    public BigDecimal getRateFloatProportion() {
        return rateFloatProportion;
    }

    public void setRateFloatProportion(BigDecimal rateFloatProportion) {
        this.rateFloatProportion = rateFloatProportion;
    }

    public String getInterestBearingManner() {
        return interestBearingManner;
    }

    public void setInterestBearingManner(String interestBearingManner) {
        this.interestBearingManner = interestBearingManner == null ? null : interestBearingManner.trim();
    }

    public String getRepaymentChannels() {
        return repaymentChannels;
    }

    public void setRepaymentChannels(String repaymentChannels) {
        this.repaymentChannels = repaymentChannels == null ? null : repaymentChannels.trim();
    }

    public String getRepaymentAccount() {
        return repaymentAccount;
    }

    public void setRepaymentAccount(String repaymentAccount) {
        this.repaymentAccount = repaymentAccount == null ? null : repaymentAccount.trim();
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType == null ? null : repaymentType.trim();
    }

    public BigDecimal getParValue() {
        return parValue;
    }

    public void setParValue(BigDecimal parValue) {
        this.parValue = parValue;
    }

    public String getCustomerUnifiedNum() {
        return customerUnifiedNum;
    }

    public void setCustomerUnifiedNum(String customerUnifiedNum) {
        this.customerUnifiedNum = customerUnifiedNum == null ? null : customerUnifiedNum.trim();
    }

    public String getDetailedItemName() {
        return detailedItemName;
    }

    public void setDetailedItemName(String detailedItemName) {
        this.detailedItemName = detailedItemName == null ? null : detailedItemName.trim();
    }

    public String getLoanAccountNumber() {
        return loanAccountNumber;
    }

    public void setLoanAccountNumber(String loanAccountNumber) {
        this.loanAccountNumber = loanAccountNumber == null ? null : loanAccountNumber.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getFinancialLicenseNo() {
        return financialLicenseNo;
    }

    public void setFinancialLicenseNo(String financialLicenseNo) {
        this.financialLicenseNo = financialLicenseNo == null ? null : financialLicenseNo.trim();
    }

    public String getInternalMechanism() {
        return internalMechanism;
    }

    public void setInternalMechanism(String internalMechanism) {
        this.internalMechanism = internalMechanism == null ? null : internalMechanism.trim();
    }

    public String getDetailItemNumber() {
        return detailItemNumber;
    }

    public void setDetailItemNumber(String detailItemNumber) {
        this.detailItemNumber = detailItemNumber == null ? null : detailItemNumber.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Date getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }

    public BigDecimal getRepayAmt() {
        return repayAmt;
    }

    public void setRepayAmt(BigDecimal repayAmt) {
        this.repayAmt = repayAmt;
    }

    public BigDecimal getRepayLnterest() {
        return repayLnterest;
    }

    public void setRepayLnterest(BigDecimal repayLnterest) {
        this.repayLnterest = repayLnterest;
    }

    public String getRepayOrgNum() {
        return repayOrgNum;
    }

    public void setRepayOrgNum(String repayOrgNum) {
        this.repayOrgNum = repayOrgNum == null ? null : repayOrgNum.trim();
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

    public String getSubjectno() {
        return subjectno;
    }

    public void setSubjectno(String subjectno) {
        this.subjectno = subjectno == null ? null : subjectno.trim();
    }

    public String getOverduesubjectno1() {
        return overduesubjectno1;
    }

    public void setOverduesubjectno1(String overduesubjectno1) {
        this.overduesubjectno1 = overduesubjectno1 == null ? null : overduesubjectno1.trim();
    }

    public String getOverduesubjectno2() {
        return overduesubjectno2;
    }

    public void setOverduesubjectno2(String overduesubjectno2) {
        this.overduesubjectno2 = overduesubjectno2 == null ? null : overduesubjectno2.trim();
    }

    public String getDullsubjectno() {
        return dullsubjectno;
    }

    public void setDullsubjectno(String dullsubjectno) {
        this.dullsubjectno = dullsubjectno == null ? null : dullsubjectno.trim();
    }

    public String getBadsubjectno() {
        return badsubjectno;
    }

    public void setBadsubjectno(String badsubjectno) {
        this.badsubjectno = badsubjectno == null ? null : badsubjectno.trim();
    }

    public BigDecimal getDiscountsum() {
        return discountsum;
    }

    public void setDiscountsum(BigDecimal discountsum) {
        this.discountsum = discountsum;
    }

    public BigDecimal getNormalbalance() {
        return normalbalance;
    }

    public void setNormalbalance(BigDecimal normalbalance) {
        this.normalbalance = normalbalance;
    }

    public BigDecimal getOverduebalance1() {
        return overduebalance1;
    }

    public void setOverduebalance1(BigDecimal overduebalance1) {
        this.overduebalance1 = overduebalance1;
    }

    public BigDecimal getOverduebalance2() {
        return overduebalance2;
    }

    public void setOverduebalance2(BigDecimal overduebalance2) {
        this.overduebalance2 = overduebalance2;
    }

    public BigDecimal getDullbalance() {
        return dullbalance;
    }

    public void setDullbalance(BigDecimal dullbalance) {
        this.dullbalance = dullbalance;
    }

    public BigDecimal getBadbalance() {
        return badbalance;
    }

    public void setBadbalance(BigDecimal badbalance) {
        this.badbalance = badbalance;
    }

    public String getAdvanceflag() {
        return advanceflag;
    }

    public void setAdvanceflag(String advanceflag) {
        this.advanceflag = advanceflag == null ? null : advanceflag.trim();
    }

    public String getScfApplyNum() {
        return scfApplyNum;
    }

    public void setScfApplyNum(String scfApplyNum) {
        this.scfApplyNum = scfApplyNum == null ? null : scfApplyNum.trim();
    }

    public String getInvoiceBatchNum() {
        return invoiceBatchNum;
    }

    public void setInvoiceBatchNum(String invoiceBatchNum) {
        this.invoiceBatchNum = invoiceBatchNum == null ? null : invoiceBatchNum.trim();
    }

    public String getLoanQuasiOdd() {
        return loanQuasiOdd;
    }

    public void setLoanQuasiOdd(String loanQuasiOdd) {
        this.loanQuasiOdd = loanQuasiOdd == null ? null : loanQuasiOdd.trim();
    }

    public BigDecimal getInterestbalance1() {
        return interestbalance1;
    }

    public void setInterestbalance1(BigDecimal interestbalance1) {
        this.interestbalance1 = interestbalance1;
    }

    public BigDecimal getInterestbalance2() {
        return interestbalance2;
    }

    public void setInterestbalance2(BigDecimal interestbalance2) {
        this.interestbalance2 = interestbalance2;
    }

    public String getCreditUseAddress() {
        return creditUseAddress;
    }

    public void setCreditUseAddress(String creditUseAddress) {
        this.creditUseAddress = creditUseAddress == null ? null : creditUseAddress.trim();
    }

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum == null ? null : businessNum.trim();
    }

    public BigDecimal getMfnormalbalance() {
        return mfnormalbalance;
    }

    public void setMfnormalbalance(BigDecimal mfnormalbalance) {
        this.mfnormalbalance = mfnormalbalance;
    }

    public BigDecimal getMfoverduebalance1() {
        return mfoverduebalance1;
    }

    public void setMfoverduebalance1(BigDecimal mfoverduebalance1) {
        this.mfoverduebalance1 = mfoverduebalance1;
    }

    public BigDecimal getMfoverduebalance2() {
        return mfoverduebalance2;
    }

    public void setMfoverduebalance2(BigDecimal mfoverduebalance2) {
        this.mfoverduebalance2 = mfoverduebalance2;
    }

    public BigDecimal getMfdullbalance() {
        return mfdullbalance;
    }

    public void setMfdullbalance(BigDecimal mfdullbalance) {
        this.mfdullbalance = mfdullbalance;
    }

    public BigDecimal getMfbadbalance() {
        return mfbadbalance;
    }

    public void setMfbadbalance(BigDecimal mfbadbalance) {
        this.mfbadbalance = mfbadbalance;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public BigDecimal getMfBalance() {
        return mfBalance;
    }

    public void setMfBalance(BigDecimal mfBalance) {
        this.mfBalance = mfBalance;
    }

    public String getOrgNum() {
        return orgNum;
    }

    public void setOrgNum(String orgNum) {
        this.orgNum = orgNum == null ? null : orgNum.trim();
    }

    public String getMforgid() {
        return mforgid;
    }

    public void setMforgid(String mforgid) {
        this.mforgid = mforgid == null ? null : mforgid.trim();
    }

    public Date getMfupdatedate() {
        return mfupdatedate;
    }

    public void setMfupdatedate(Date mfupdatedate) {
        this.mfupdatedate = mfupdatedate;
    }

    public Date getMfupdatedate1() {
        return mfupdatedate1;
    }

    public void setMfupdatedate1(Date mfupdatedate1) {
        this.mfupdatedate1 = mfupdatedate1;
    }

    public BigDecimal getMfinterestbalance1() {
        return mfinterestbalance1;
    }

    public void setMfinterestbalance1(BigDecimal mfinterestbalance1) {
        this.mfinterestbalance1 = mfinterestbalance1;
    }

    public BigDecimal getMfinterestbalance2() {
        return mfinterestbalance2;
    }

    public void setMfinterestbalance2(BigDecimal mfinterestbalance2) {
        this.mfinterestbalance2 = mfinterestbalance2;
    }

    public String getOldSumId() {
        return oldSumId;
    }

    public void setOldSumId(String oldSumId) {
        this.oldSumId = oldSumId == null ? null : oldSumId.trim();
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype == null ? null : paymenttype.trim();
    }

    public String getAuflag() {
        return auflag;
    }

    public void setAuflag(String auflag) {
        this.auflag = auflag == null ? null : auflag.trim();
    }

    public String getKeyvalue() {
        return keyvalue;
    }

    public void setKeyvalue(String keyvalue) {
        this.keyvalue = keyvalue == null ? null : keyvalue.trim();
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }

    public String getTrandiscountstatus() {
        return trandiscountstatus;
    }

    public void setTrandiscountstatus(String trandiscountstatus) {
        this.trandiscountstatus = trandiscountstatus == null ? null : trandiscountstatus.trim();
    }

    public String getPsoverduedays() {
        return psoverduedays;
    }

    public void setPsoverduedays(String psoverduedays) {
        this.psoverduedays = psoverduedays == null ? null : psoverduedays.trim();
    }

    public String getPeoverduedays() {
        return peoverduedays;
    }

    public void setPeoverduedays(String peoverduedays) {
        this.peoverduedays = peoverduedays == null ? null : peoverduedays.trim();
    }

    public BigDecimal getInterestreceivable() {
        return interestreceivable;
    }

    public void setInterestreceivable(BigDecimal interestreceivable) {
        this.interestreceivable = interestreceivable;
    }

    public BigDecimal getDpbalance() {
        return dpbalance;
    }

    public void setDpbalance(BigDecimal dpbalance) {
        this.dpbalance = dpbalance;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    public BigDecimal getDeferInterest() {
        return deferInterest;
    }

    public void setDeferInterest(BigDecimal deferInterest) {
        this.deferInterest = deferInterest;
    }

    public String getRiskExposuer() {
        return riskExposuer;
    }

    public void setRiskExposuer(String riskExposuer) {
        this.riskExposuer = riskExposuer == null ? null : riskExposuer.trim();
    }

    public String getAssetsClassification() {
        return assetsClassification;
    }

    public void setAssetsClassification(String assetsClassification) {
        this.assetsClassification = assetsClassification == null ? null : assetsClassification.trim();
    }
}