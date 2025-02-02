package cn.csdn.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_con_contract
 */
public class TbConContract implements Serializable {
    /**
     * CONTRACT_ID
     */
    private String contractId;

    /**
     * APPROVE_ID
     */
    private String approveId;

    /**
     * CONTRACT_NUM
     */
    private String contractNum;

    /**
     * CONTRACT_MANUAL_NUM
     */
    private String contractManualNum;

    /**
     * CURRENCY_CD
     */
    private String currencyCd;

    /**
     * CONTRACT_TOTAL_AMT
     */
    private BigDecimal contractTotalAmt;

    /**
     * CONTRACT_TERM
     */
    private Long contractTerm;

    /**
     * CYCLE_UNIT
     */
    private String cycleUnit;

    /**
     * EXCHANGE_RATE
     */
    private BigDecimal exchangeRate;

    /**
     * CONTRACT_SIGN_DATE
     */
    private Date contractSignDate;

    /**
     * CONTRACT_SIGN_PLACE
     */
    private String contractSignPlace;

    /**
     * START_DATE
     */
    private Date startDate;

    /**
     * EXPIRATION_DATE
     */
    private Date expirationDate;

    /**
     * MAIN_SURETY_MODE
     */
    private String mainSuretyMode;

    /**
     * MAIN_SUERTY_SUBCHILD
     */
    private String mainSuertySubchild;

    /**
     * CONTRACT_NATURE_CD
     */
    private String contractNatureCd;

    /**
     * CONTRACT_STATUS_CD
     */
    private String contractStatusCd;

    /**
     * CONTRACT_TERMINATION_WAY_CD
     */
    private String contractTerminationWayCd;

    /**
     * CONTRACT_TERMINATION_DATE
     */
    private Date contractTerminationDate;

    /**
     * PRODUCT_TYPE
     */
    private String productType;

    /**
     * IF_FIRST_LOAN
     */
    private String ifFirstLoan;

    /**
     * IF_CREDIT_DOWN_BUSINESS
     */
    private String ifCreditDownBusiness;

    /**
     * IF_GOVERMENT_CREDIT
     */
    private String ifGovermentCredit;

    /**
     * GOVERMENT_CREDIT_TYPE
     */
    private String govermentCreditType;

    /**
     * IS_AGRICULTURE_LOANS
     */
    private String isAgricultureLoans;

    /**
     * IF_MODERN_AGRICULTURAL_PARK
     */
    private String ifModernAgriculturalPark;

    /**
     * IS_REMOTE_SERVICE
     */
    private String isRemoteService;

    /**
     * CREDIT_TYPE
     */
    private String creditType;

    /**
     * FIXED_ASSETS_LOAN_TYPE
     */
    private String fixedAssetsLoanType;

    /**
     * IS_PROJECT_FINANCING
     */
    private String isProjectFinancing;

    /**
     * IF_COMPLIANCE_REPAYMENT_REPAYM
     */
    private String ifComplianceRepaymentRepaym;

    /**
     * AGREEMENT_EFFECT_START_DATE
     */
    private Date agreementEffectStartDate;

    /**
     * SMALL_ENTERPRISES_PRODUCT_NAME
     */
    private String smallEnterprisesProductName;

    /**
     * IF_CONVENIENT_LOAN
     */
    private String ifConvenientLoan;

    /**
     * IF_ADJUSTMENT_GUARANTEE
     */
    private String ifAdjustmentGuarantee;

    /**
     * LOAN_DIRECTION
     */
    private String loanDirection;

    /**
     * IF_IMP_IND_ELIMINATED_LOAN
     */
    private String ifImpIndEliminatedLoan;

    /**
     * IF_SIX_LOAN
     */
    private String ifSixLoan;

    /**
     * BANK_HOUSE_CLASS_TYPE
     */
    private String bankHouseClassType;

    /**
     * BANK_SUPERVISOR_HOU_CLASS_TYPE
     */
    private String bankSupervisorHouClassType;

    /**
     * LOAN_USE
     */
    private String loanUse;

    /**
     * REPAY_SOURCE
     */
    private String repaySource;

    /**
     * SUPPLEMENTARY_PROVISIONS
     */
    private String supplementaryProvisions;

    /**
     * RESTRICTIVE_CLAUSE
     */
    private String restrictiveClause;

    /**
     * LAST_DRAFT_DATE
     */
    private Date lastDraftDate;

    /**
     * DRAFT_PERIOD
     */
    private String draftPeriod;

    /**
     * CREATE_TIME
     */
    private Date createTime;

    /**
     * UPDATE_TIME
     */
    private Date updateTime;

    /**
     * PARTY_ID
     */
    private String partyId;

    /**
     * IF_STEEL_FLAG
     */
    private String ifSteelFlag;

    /**
     * LOAN_DIRECTION_TWO
     */
    private String loanDirectionTwo;

    /**
     * IF_SECURITY_FAC_RESERVE_FLAG
     */
    private String ifSecurityFacReserveFlag;

    /**
     * IF_GOVERMENT_RESERVE_LOAN
     */
    private String ifGovermentReserveLoan;

    /**
     * IS_SUPPLY_CHAIN_BUSSINESS
     */
    private String isSupplyChainBussiness;

    /**
     * REPAYMENT_TYPE
     */
    private String repaymentType;

    /**
     * IF_FUND_RAISING_LOAN
     */
    private String ifFundRaisingLoan;

    /**
     * IF_PLACE_LOAN
     */
    private String ifPlaceLoan;

    /**
     * AGRO_LOAN_TYPE
     */
    private String agroLoanType;

    /**
     * IS_ELIMINATION_BACKWARD_CREDIT
     */
    private String isEliminationBackwardCredit;

    /**
     * IF_ENERGY_SAVING_CREDIT
     */
    private String ifEnergySavingCredit;

    /**
     * LOAN_AT_INDUSTRY_TYPE
     */
    private String loanAtIndustryType;

    /**
     * COMPETENT_USER_ORG
     */
    private String competentUserOrg;

    /**
     * IS_COMMODIT_HOUSE_LOANS
     */
    private String isCommoditHouseLoans;

    /**
     * IF_COMMODITY_HOUSING
     */
    private String ifCommodityHousing;

    /**
     * CAPITAL
     */
    private String capital;

    /**
     * FIRST_REPAYMENT_YEAR
     */
    private Date firstRepaymentYear;

    /**
     * DIRECT_REPLACEMENT_ESTATE_LOAN
     */
    private String directReplacementEstateLoan;

    /**
     * IS_CONTRACT_ENERGY_LOAN
     */
    private String isContractEnergyLoan;

    /**
     * IF_GREEN_LOAN
     */
    private String ifGreenLoan;

    /**
     * CONSTRUCTION_LOAN
     */
    private String constructionLoan;

    /**
     * APPR_NUM
     */
    private String apprNum;

    /**
     * IF_AGREEMENT_FLAG
     */
    private String ifAgreementFlag;

    /**
     * AVAILABLE_AMT
     */
    private BigDecimal availableAmt;

    /**
     * CONTRACT_OVER_CONTENT
     */
    private String contractOverContent;

    /**
     * ORG_NUM
     */
    private String orgNum;

    /**
     * USER_NUM
     */
    private String userNum;

    /**
     * IS_BANK_TEAM_LOAN
     */
    private String isBankTeamLoan;

    /**
     * NEW_CREDIT_TYPE
     */
    private String newCreditType;

    /**
     * IF_COUNTRY_LIMIT
     */
    private String ifCountryLimit;

    /**
     * INDUSTRY_UPDATE_FLAG
     */
    private String industryUpdateFlag;

    /**
     * PRINCIPAL_REPAYMENT_TYPE
     */
    private String principalRepaymentType;

    /**
     * INTEREST_REPAYMENT_TYPE
     */
    private String interestRepaymentType;

    /**
     * NEW_INDUSTRY_TYPE
     */
    private String newIndustryType;

    /**
     * PAYOUT_WAY_CD
     */
    private String payoutWayCd;

    /**
     * OCCUPIED_AMT
     */
    private BigDecimal occupiedAmt;

    /**
     * DISTRIBUTE_TYPE
     */
    private String distributeType;

    /**
     * CYCLE_FLAG
     */
    private String cycleFlag;

    /**
     * BIZ_HAPPEN_TYPE
     */
    private String bizHappenType;

    /**
     * SETTLEMENT_WAY
     */
    private String settlementWay;

    /**
     * CONTRACT_CALLBACK_RESULT
     */
    private String contractCallbackResult;

    /**
     * IF_FIXED_ASSETS_LOAN
     */
    private String ifFixedAssetsLoan;

    /**
     * CONTRACT_BALANCE
     */
    private BigDecimal contractBalance;

    /**
     * PURPOSE_OF_LOAN_TYPE
     */
    private String purposeOfLoanType;

    /**
     * PURPOSE_OF_LOAN
     */
    private String purposeOfLoan;

    /**
     * GROUP_SURETY_MODE
     */
    private String groupSuretyMode;

    /**
     * KEY_BUSINESS_PLATE
     */
    private String keyBusinessPlate;

    /**
     * PLATFORM_PARTY_ID
     */
    private String platformPartyId;

    /**
     * PLATFORM_AMT
     */
    private BigDecimal platformAmt;

    /**
     * IFTRADE
     */
    private String iftrade;

    /**
     * RECOMBINATION_SUMMARY_NUM
     */
    private String recombinationSummaryNum;

    /**
     * EXTENSION_TERM
     */
    private Integer extensionTerm;

    /**
     * EXTENSION_UNIT
     */
    private String extensionUnit;

    /**
     * LIMIT_CUS_NO
     */
    private String limitCusNo;

    /**
     * LIMIT_DIRE
     */
    private String limitDire;

    /**
     * Y_CONTRACT_ID
     */
    private String yContractId;

    /**
     * DOT_NUM
     */
    private String dotNum;

    /**
     * IS_PHOTOVOLTAIC
     */
    private String isPhotovoltaic;

    /**
     * MATTERS_AGREED
     */
    private String mattersAgreed;

    /**
     * LATEST_DATE
     */
    private Date latestDate;

    /**
     * IS_COMPREHENSIVE_CREDIT_AGR
     */
    private String isComprehensiveCreditAgr;

    /**
     * IS_FAILURE_SIGN
     */
    private String isFailureSign;

    /**
     * IS_CHANGE_SIGN
     */
    private String isChangeSign;

    /**
     * OUT_ACCOUNT_ORG
     */
    private String outAccountOrg;

    /**
     * MIDDLE_BUS_CHARGES_RATIO
     */
    private BigDecimal middleBusChargesRatio;

    /**
     * PROMISE_FEE_RATIO
     */
    private BigDecimal promiseFeeRatio;

    /**
     * INDUSTRY_CATEGORIES
     */
    private String industryCategories;

    /**
     * IF_DATA_MOVE
     */
    private String ifDataMove;

    /**
     * IS_REFINANCE
     */
    private String isRefinance;

    /**
     * INDUSTY_CHANGE_TYPE
     */
    private String industyChangeType;

    /**
     * INDUSTY_UP_FLAG
     */
    private String industyUpFlag;

    /**
     * GETPAY_START_DATE
     */
    private Date getpayStartDate;

    /**
     * GETPAY_END_DATE
     */
    private Date getpayEndDate;

    /**
     * LOAN_SEND_ADDRESS
     */
    private String loanSendAddress;

    /**
     * INCREASE_LOAN
     */
    private BigDecimal increaseLoan;

    /**
     * EARLY_REPAYMENT_CONTROL
     */
    private String earlyRepaymentControl;

    /**
     * LOWEST_EARLY_REPAYMENT
     */
    private BigDecimal lowestEarlyRepayment;

    /**
     * INCREASE_EARLY_REPAYMENT
     */
    private BigDecimal increaseEarlyRepayment;

    /**
     * EARLY_REPAYMENTTERM_CONTROL
     */
    private String earlyRepaymenttermControl;

    /**
     * ALLOW_EARLYREPAYMENT_DAY
     */
    private Integer allowEarlyrepaymentDay;

    /**
     * IS_TRADE_BANK
     */
    private String isTradeBank;

    /**
     * IS_OCCUPY_THIRD
     */
    private String isOccupyThird;

    /**
     * IS_PATTERN
     */
    private String isPattern;

    /**
     * LOAN_CONTRAL
     */
    private String loanContral;

    /**
     * LOWEST_LOAN
     */
    private BigDecimal lowestLoan;

    /**
     * IS_WININTEREST
     */
    private String isWininterest;

    /**
     * WININTEREST_AMOUNT
     */
    private BigDecimal wininterestAmount;

    /**
     * CON_WININTEREST
     */
    private String conWininterest;

    /**
     * ISPROFIT
     */
    private String isprofit;

    /**
     * IF_OUTPROTECT_INLOAN
     */
    private String ifOutprotectInloan;

    /**
     * IS_ELECTRONICS_CONTRACT
     */
    private String isElectronicsContract;

    /**
     * ONE_DRAWINGS_DEADLINE
     */
    private String oneDrawingsDeadline;

    /**
     * INVESTMENT_PRODUCT_TYPE
     */
    private String investmentProductType;

    /**
     * ASSETS_OTHER
     */
    private String assetsOther;

    /**
     * IS_FINANCIAL
     */
    private String isFinancial;

    /**
     * CUSTBRNO
     */
    private String custbrno;

    /**
     * IS_FINANCE_COMPANY_BUSINESS
     */
    private String isFinanceCompanyBusiness;

    /**
     * FINANCE_APPROVE_ID
     */
    private String financeApproveId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_con_contract
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}