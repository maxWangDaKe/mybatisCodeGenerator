package cn.csdn.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbLoanDetail implements Serializable {
    private String loanDetailId;

    private String productCd;

    private BigDecimal loanAmt;

    private String currencyCd;

    private Long term;

    private String cycleUnit;

    private Date expirationDate;

    private Date startDate;

    private String loanInfoId;

    private String sendStatusCd;

    private String repaymentType;

    private String ifTrusteeToPay;

    private String contractDetailId;

    private String loanDetailStatusCd;

    private String partyId;

    private Date createTime;

    private Date updateTime;

    private String payoutWayCd;

    private Integer broadCycle;

    private String extendTermUnitCd;

    private String cycleInd;

    private String whetherExamAppMoneyRequire;

    private String examAppMoneyRequire;

    private String settlementWay;

    private BigDecimal arrangeAotslypayMoney;

    private BigDecimal meritLiftpayMoney;

    private BigDecimal arrangeLiftpayMoney;

    private String outAccountOrg;

    private String loanApplyNo;

    private String creditUseAddress;

    private String distributeType;

    private String userNum;

    private String orgNum;

    private Date handlingDate;

    private String accountingOrg;

    private String category;

    private String loanBelong;

    private String lendAccount;

    private String repaymentAccount;

    private String interestRepaymentAccount;

    private String loanQuasiOdd;

    private String ditchMark;

    private String loanUse;

    private String creditCardPaynum;

    private Date startIntrestDate;

    private String autoReplayPlan;

    private String definReplayPlan;

    private String lendTorepayPaynum;

    private String payoutCancelReason;

    private String productT24;

    private String loantoT24;

    private String suretyMode;

    private String befOrBack;

    private String basicDate;

    private String loanApplyKind;

    private String scfLoanId;

    private String bmsLoanId;

    private String camsLoanId;

    private String transSeqNo;

    private String loanUpdateFlag;

    private BigDecimal prinMovement;

    private Date movementDt;

    private String oldLoanId;

    private String upReason;

    private String creNum;

    private String bankTransNo;

    private String reverseFlag;

    private String borrowStatusCd;

    private String payType;

    private String approveCurrencyCd;

    private String applyid;

    private String applyname;

    private String applyorg;

    private String appRenewFrontMark;

    private String capitalposition;

    private String isRefinance;

    private String childProductType;

    private String isPattern;

    private String txbkLoanId;

    private String isSpecial;

    private String isFinancialLoan;

    private String financialLoanOpponent;

    private String isSeal;

    private String supplementInd;

    private String supplementAmt;

    private String tbList;

    private String exSupplementInd;

    private String loanTurn2017;

    private String isPassSppi;

    private String businessType;

    private String threeCategories;

    private String ifReview;

    private String dkLoanId;

    private String clcMthFlg;

    private static final long serialVersionUID = 1L;

    public String getLoanDetailId() {
        return loanDetailId;
    }

    public void setLoanDetailId(String loanDetailId) {
        this.loanDetailId = loanDetailId == null ? null : loanDetailId.trim();
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd == null ? null : productCd.trim();
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

    public Long getTerm() {
        return term;
    }

    public void setTerm(Long term) {
        this.term = term;
    }

    public String getCycleUnit() {
        return cycleUnit;
    }

    public void setCycleUnit(String cycleUnit) {
        this.cycleUnit = cycleUnit == null ? null : cycleUnit.trim();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getLoanInfoId() {
        return loanInfoId;
    }

    public void setLoanInfoId(String loanInfoId) {
        this.loanInfoId = loanInfoId == null ? null : loanInfoId.trim();
    }

    public String getSendStatusCd() {
        return sendStatusCd;
    }

    public void setSendStatusCd(String sendStatusCd) {
        this.sendStatusCd = sendStatusCd == null ? null : sendStatusCd.trim();
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType == null ? null : repaymentType.trim();
    }

    public String getIfTrusteeToPay() {
        return ifTrusteeToPay;
    }

    public void setIfTrusteeToPay(String ifTrusteeToPay) {
        this.ifTrusteeToPay = ifTrusteeToPay == null ? null : ifTrusteeToPay.trim();
    }

    public String getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(String contractDetailId) {
        this.contractDetailId = contractDetailId == null ? null : contractDetailId.trim();
    }

    public String getLoanDetailStatusCd() {
        return loanDetailStatusCd;
    }

    public void setLoanDetailStatusCd(String loanDetailStatusCd) {
        this.loanDetailStatusCd = loanDetailStatusCd == null ? null : loanDetailStatusCd.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
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

    public String getPayoutWayCd() {
        return payoutWayCd;
    }

    public void setPayoutWayCd(String payoutWayCd) {
        this.payoutWayCd = payoutWayCd == null ? null : payoutWayCd.trim();
    }

    public Integer getBroadCycle() {
        return broadCycle;
    }

    public void setBroadCycle(Integer broadCycle) {
        this.broadCycle = broadCycle;
    }

    public String getExtendTermUnitCd() {
        return extendTermUnitCd;
    }

    public void setExtendTermUnitCd(String extendTermUnitCd) {
        this.extendTermUnitCd = extendTermUnitCd == null ? null : extendTermUnitCd.trim();
    }

    public String getCycleInd() {
        return cycleInd;
    }

    public void setCycleInd(String cycleInd) {
        this.cycleInd = cycleInd == null ? null : cycleInd.trim();
    }

    public String getWhetherExamAppMoneyRequire() {
        return whetherExamAppMoneyRequire;
    }

    public void setWhetherExamAppMoneyRequire(String whetherExamAppMoneyRequire) {
        this.whetherExamAppMoneyRequire = whetherExamAppMoneyRequire == null ? null : whetherExamAppMoneyRequire.trim();
    }

    public String getExamAppMoneyRequire() {
        return examAppMoneyRequire;
    }

    public void setExamAppMoneyRequire(String examAppMoneyRequire) {
        this.examAppMoneyRequire = examAppMoneyRequire == null ? null : examAppMoneyRequire.trim();
    }

    public String getSettlementWay() {
        return settlementWay;
    }

    public void setSettlementWay(String settlementWay) {
        this.settlementWay = settlementWay == null ? null : settlementWay.trim();
    }

    public BigDecimal getArrangeAotslypayMoney() {
        return arrangeAotslypayMoney;
    }

    public void setArrangeAotslypayMoney(BigDecimal arrangeAotslypayMoney) {
        this.arrangeAotslypayMoney = arrangeAotslypayMoney;
    }

    public BigDecimal getMeritLiftpayMoney() {
        return meritLiftpayMoney;
    }

    public void setMeritLiftpayMoney(BigDecimal meritLiftpayMoney) {
        this.meritLiftpayMoney = meritLiftpayMoney;
    }

    public BigDecimal getArrangeLiftpayMoney() {
        return arrangeLiftpayMoney;
    }

    public void setArrangeLiftpayMoney(BigDecimal arrangeLiftpayMoney) {
        this.arrangeLiftpayMoney = arrangeLiftpayMoney;
    }

    public String getOutAccountOrg() {
        return outAccountOrg;
    }

    public void setOutAccountOrg(String outAccountOrg) {
        this.outAccountOrg = outAccountOrg == null ? null : outAccountOrg.trim();
    }

    public String getLoanApplyNo() {
        return loanApplyNo;
    }

    public void setLoanApplyNo(String loanApplyNo) {
        this.loanApplyNo = loanApplyNo == null ? null : loanApplyNo.trim();
    }

    public String getCreditUseAddress() {
        return creditUseAddress;
    }

    public void setCreditUseAddress(String creditUseAddress) {
        this.creditUseAddress = creditUseAddress == null ? null : creditUseAddress.trim();
    }

    public String getDistributeType() {
        return distributeType;
    }

    public void setDistributeType(String distributeType) {
        this.distributeType = distributeType == null ? null : distributeType.trim();
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

    public Date getHandlingDate() {
        return handlingDate;
    }

    public void setHandlingDate(Date handlingDate) {
        this.handlingDate = handlingDate;
    }

    public String getAccountingOrg() {
        return accountingOrg;
    }

    public void setAccountingOrg(String accountingOrg) {
        this.accountingOrg = accountingOrg == null ? null : accountingOrg.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getLoanBelong() {
        return loanBelong;
    }

    public void setLoanBelong(String loanBelong) {
        this.loanBelong = loanBelong == null ? null : loanBelong.trim();
    }

    public String getLendAccount() {
        return lendAccount;
    }

    public void setLendAccount(String lendAccount) {
        this.lendAccount = lendAccount == null ? null : lendAccount.trim();
    }

    public String getRepaymentAccount() {
        return repaymentAccount;
    }

    public void setRepaymentAccount(String repaymentAccount) {
        this.repaymentAccount = repaymentAccount == null ? null : repaymentAccount.trim();
    }

    public String getInterestRepaymentAccount() {
        return interestRepaymentAccount;
    }

    public void setInterestRepaymentAccount(String interestRepaymentAccount) {
        this.interestRepaymentAccount = interestRepaymentAccount == null ? null : interestRepaymentAccount.trim();
    }

    public String getLoanQuasiOdd() {
        return loanQuasiOdd;
    }

    public void setLoanQuasiOdd(String loanQuasiOdd) {
        this.loanQuasiOdd = loanQuasiOdd == null ? null : loanQuasiOdd.trim();
    }

    public String getDitchMark() {
        return ditchMark;
    }

    public void setDitchMark(String ditchMark) {
        this.ditchMark = ditchMark == null ? null : ditchMark.trim();
    }

    public String getLoanUse() {
        return loanUse;
    }

    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse == null ? null : loanUse.trim();
    }

    public String getCreditCardPaynum() {
        return creditCardPaynum;
    }

    public void setCreditCardPaynum(String creditCardPaynum) {
        this.creditCardPaynum = creditCardPaynum == null ? null : creditCardPaynum.trim();
    }

    public Date getStartIntrestDate() {
        return startIntrestDate;
    }

    public void setStartIntrestDate(Date startIntrestDate) {
        this.startIntrestDate = startIntrestDate;
    }

    public String getAutoReplayPlan() {
        return autoReplayPlan;
    }

    public void setAutoReplayPlan(String autoReplayPlan) {
        this.autoReplayPlan = autoReplayPlan == null ? null : autoReplayPlan.trim();
    }

    public String getDefinReplayPlan() {
        return definReplayPlan;
    }

    public void setDefinReplayPlan(String definReplayPlan) {
        this.definReplayPlan = definReplayPlan == null ? null : definReplayPlan.trim();
    }

    public String getLendTorepayPaynum() {
        return lendTorepayPaynum;
    }

    public void setLendTorepayPaynum(String lendTorepayPaynum) {
        this.lendTorepayPaynum = lendTorepayPaynum == null ? null : lendTorepayPaynum.trim();
    }

    public String getPayoutCancelReason() {
        return payoutCancelReason;
    }

    public void setPayoutCancelReason(String payoutCancelReason) {
        this.payoutCancelReason = payoutCancelReason == null ? null : payoutCancelReason.trim();
    }

    public String getProductT24() {
        return productT24;
    }

    public void setProductT24(String productT24) {
        this.productT24 = productT24 == null ? null : productT24.trim();
    }

    public String getLoantoT24() {
        return loantoT24;
    }

    public void setLoantoT24(String loantoT24) {
        this.loantoT24 = loantoT24 == null ? null : loantoT24.trim();
    }

    public String getSuretyMode() {
        return suretyMode;
    }

    public void setSuretyMode(String suretyMode) {
        this.suretyMode = suretyMode == null ? null : suretyMode.trim();
    }

    public String getBefOrBack() {
        return befOrBack;
    }

    public void setBefOrBack(String befOrBack) {
        this.befOrBack = befOrBack == null ? null : befOrBack.trim();
    }

    public String getBasicDate() {
        return basicDate;
    }

    public void setBasicDate(String basicDate) {
        this.basicDate = basicDate == null ? null : basicDate.trim();
    }

    public String getLoanApplyKind() {
        return loanApplyKind;
    }

    public void setLoanApplyKind(String loanApplyKind) {
        this.loanApplyKind = loanApplyKind == null ? null : loanApplyKind.trim();
    }

    public String getScfLoanId() {
        return scfLoanId;
    }

    public void setScfLoanId(String scfLoanId) {
        this.scfLoanId = scfLoanId == null ? null : scfLoanId.trim();
    }

    public String getBmsLoanId() {
        return bmsLoanId;
    }

    public void setBmsLoanId(String bmsLoanId) {
        this.bmsLoanId = bmsLoanId == null ? null : bmsLoanId.trim();
    }

    public String getCamsLoanId() {
        return camsLoanId;
    }

    public void setCamsLoanId(String camsLoanId) {
        this.camsLoanId = camsLoanId == null ? null : camsLoanId.trim();
    }

    public String getTransSeqNo() {
        return transSeqNo;
    }

    public void setTransSeqNo(String transSeqNo) {
        this.transSeqNo = transSeqNo == null ? null : transSeqNo.trim();
    }

    public String getLoanUpdateFlag() {
        return loanUpdateFlag;
    }

    public void setLoanUpdateFlag(String loanUpdateFlag) {
        this.loanUpdateFlag = loanUpdateFlag == null ? null : loanUpdateFlag.trim();
    }

    public BigDecimal getPrinMovement() {
        return prinMovement;
    }

    public void setPrinMovement(BigDecimal prinMovement) {
        this.prinMovement = prinMovement;
    }

    public Date getMovementDt() {
        return movementDt;
    }

    public void setMovementDt(Date movementDt) {
        this.movementDt = movementDt;
    }

    public String getOldLoanId() {
        return oldLoanId;
    }

    public void setOldLoanId(String oldLoanId) {
        this.oldLoanId = oldLoanId == null ? null : oldLoanId.trim();
    }

    public String getUpReason() {
        return upReason;
    }

    public void setUpReason(String upReason) {
        this.upReason = upReason == null ? null : upReason.trim();
    }

    public String getCreNum() {
        return creNum;
    }

    public void setCreNum(String creNum) {
        this.creNum = creNum == null ? null : creNum.trim();
    }

    public String getBankTransNo() {
        return bankTransNo;
    }

    public void setBankTransNo(String bankTransNo) {
        this.bankTransNo = bankTransNo == null ? null : bankTransNo.trim();
    }

    public String getReverseFlag() {
        return reverseFlag;
    }

    public void setReverseFlag(String reverseFlag) {
        this.reverseFlag = reverseFlag == null ? null : reverseFlag.trim();
    }

    public String getBorrowStatusCd() {
        return borrowStatusCd;
    }

    public void setBorrowStatusCd(String borrowStatusCd) {
        this.borrowStatusCd = borrowStatusCd == null ? null : borrowStatusCd.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getApproveCurrencyCd() {
        return approveCurrencyCd;
    }

    public void setApproveCurrencyCd(String approveCurrencyCd) {
        this.approveCurrencyCd = approveCurrencyCd == null ? null : approveCurrencyCd.trim();
    }

    public String getApplyid() {
        return applyid;
    }

    public void setApplyid(String applyid) {
        this.applyid = applyid == null ? null : applyid.trim();
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname == null ? null : applyname.trim();
    }

    public String getApplyorg() {
        return applyorg;
    }

    public void setApplyorg(String applyorg) {
        this.applyorg = applyorg == null ? null : applyorg.trim();
    }

    public String getAppRenewFrontMark() {
        return appRenewFrontMark;
    }

    public void setAppRenewFrontMark(String appRenewFrontMark) {
        this.appRenewFrontMark = appRenewFrontMark == null ? null : appRenewFrontMark.trim();
    }

    public String getCapitalposition() {
        return capitalposition;
    }

    public void setCapitalposition(String capitalposition) {
        this.capitalposition = capitalposition == null ? null : capitalposition.trim();
    }

    public String getIsRefinance() {
        return isRefinance;
    }

    public void setIsRefinance(String isRefinance) {
        this.isRefinance = isRefinance == null ? null : isRefinance.trim();
    }

    public String getChildProductType() {
        return childProductType;
    }

    public void setChildProductType(String childProductType) {
        this.childProductType = childProductType == null ? null : childProductType.trim();
    }

    public String getIsPattern() {
        return isPattern;
    }

    public void setIsPattern(String isPattern) {
        this.isPattern = isPattern == null ? null : isPattern.trim();
    }

    public String getTxbkLoanId() {
        return txbkLoanId;
    }

    public void setTxbkLoanId(String txbkLoanId) {
        this.txbkLoanId = txbkLoanId == null ? null : txbkLoanId.trim();
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial == null ? null : isSpecial.trim();
    }

    public String getIsFinancialLoan() {
        return isFinancialLoan;
    }

    public void setIsFinancialLoan(String isFinancialLoan) {
        this.isFinancialLoan = isFinancialLoan == null ? null : isFinancialLoan.trim();
    }

    public String getFinancialLoanOpponent() {
        return financialLoanOpponent;
    }

    public void setFinancialLoanOpponent(String financialLoanOpponent) {
        this.financialLoanOpponent = financialLoanOpponent == null ? null : financialLoanOpponent.trim();
    }

    public String getIsSeal() {
        return isSeal;
    }

    public void setIsSeal(String isSeal) {
        this.isSeal = isSeal == null ? null : isSeal.trim();
    }

    public String getSupplementInd() {
        return supplementInd;
    }

    public void setSupplementInd(String supplementInd) {
        this.supplementInd = supplementInd == null ? null : supplementInd.trim();
    }

    public String getSupplementAmt() {
        return supplementAmt;
    }

    public void setSupplementAmt(String supplementAmt) {
        this.supplementAmt = supplementAmt == null ? null : supplementAmt.trim();
    }

    public String getTbList() {
        return tbList;
    }

    public void setTbList(String tbList) {
        this.tbList = tbList == null ? null : tbList.trim();
    }

    public String getExSupplementInd() {
        return exSupplementInd;
    }

    public void setExSupplementInd(String exSupplementInd) {
        this.exSupplementInd = exSupplementInd == null ? null : exSupplementInd.trim();
    }

    public String getLoanTurn2017() {
        return loanTurn2017;
    }

    public void setLoanTurn2017(String loanTurn2017) {
        this.loanTurn2017 = loanTurn2017 == null ? null : loanTurn2017.trim();
    }

    public String getIsPassSppi() {
        return isPassSppi;
    }

    public void setIsPassSppi(String isPassSppi) {
        this.isPassSppi = isPassSppi == null ? null : isPassSppi.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getThreeCategories() {
        return threeCategories;
    }

    public void setThreeCategories(String threeCategories) {
        this.threeCategories = threeCategories == null ? null : threeCategories.trim();
    }

    public String getIfReview() {
        return ifReview;
    }

    public void setIfReview(String ifReview) {
        this.ifReview = ifReview == null ? null : ifReview.trim();
    }

    public String getDkLoanId() {
        return dkLoanId;
    }

    public void setDkLoanId(String dkLoanId) {
        this.dkLoanId = dkLoanId == null ? null : dkLoanId.trim();
    }

    public String getClcMthFlg() {
        return clcMthFlg;
    }

    public void setClcMthFlg(String clcMthFlg) {
        this.clcMthFlg = clcMthFlg == null ? null : clcMthFlg.trim();
    }
}