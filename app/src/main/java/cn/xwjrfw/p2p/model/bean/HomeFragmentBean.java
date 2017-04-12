package cn.xwjrfw.p2p.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/3/22.
 */

public class HomeFragmentBean {



    private DataBean RE_001;
    private DataBean DYD1;
    private DataBean test;
    private DataBean ZZY;
    private DataBean DDD;
    private DataBean YSD;
    private DataBean DBL;
    private DataBean GQD;
    private DataBean XYD;
    private DataBean DDD_DMR;
    private DataBean CE_001;
    private DataBean MMB;
    private DataBean XSB;
    private DataBean HSD;
    private DataBean XND;
    private DataBean hfcredit;
    private DataBean CSB;
    private DataBean ABCDEFG;
    private DataBean YQJH;
    private DataBean XLD;
    private DataBean HND;

    public static class DataBean {

        private List<ContentBean> open;
        private List<ContentBean> scheduled;
        private List<ContentBean> settled;
        private List<ContentBean> finished;

        public static class ContentBean {

            private String id;
            private String title;
            private String method;
            private String ordinal;
            private String amount;
            private String rate;
            private DurationBeanXXXX duration;
            private LoanRequestBeanXX loanRequest;
            private String timeOpen;
            private String timeFinished;
            private String timeSettled;
            private Object timeCleared;
            private String mortgaged;
            private String bidNumber;
            private String bidAmount;
            private String status;
            private String rewarded;
            private String hidden;
            private String autoSplitted;
            private String extraRate;
            private String floatDuration;
            private String gradeLimit;
            private String balance;
            private Object corporationName;
            private Object corporationShortName;
            private Object corporationUrl;
            private Object corporationId;
            private Object guaranteeLogo;
            private Object guaranteeIcon;
            private String contractCode;
            private Object location;
            private Object industry;
            private String purpose;
            private Object riskGrade;
            private Object providerProjectCode;
            private Object coborrower;
            private String investAmount;
            private String countDownTime;
            private String serverDate;
            private String investPercent;
            private String leftBidTime;
            private String annualRate;
            private String timeLeft;
            private String timeElapsed;
            private String available;
            private String timeout;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getMethod() {
                return method;
            }

            public void setMethod(String method) {
                this.method = method;
            }

            public String getOrdinal() {
                return ordinal;
            }

            public void setOrdinal(String ordinal) {
                this.ordinal = ordinal;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public DurationBeanXXXX getDuration() {
                return duration;
            }

            public void setDuration(DurationBeanXXXX duration) {
                this.duration = duration;
            }

            public LoanRequestBeanXX getLoanRequest() {
                return loanRequest;
            }

            public void setLoanRequest(LoanRequestBeanXX loanRequest) {
                this.loanRequest = loanRequest;
            }

            public String getTimeOpen() {
                return timeOpen;
            }

            public void setTimeOpen(String timeOpen) {
                this.timeOpen = timeOpen;
            }

            public String getTimeFinished() {
                return timeFinished;
            }

            public void setTimeFinished(String timeFinished) {
                this.timeFinished = timeFinished;
            }

            public String getTimeSettled() {
                return timeSettled;
            }

            public void setTimeSettled(String timeSettled) {
                this.timeSettled = timeSettled;
            }

            public Object getTimeCleared() {
                return timeCleared;
            }

            public void setTimeCleared(Object timeCleared) {
                this.timeCleared = timeCleared;
            }

            public String getMortgaged() {
                return mortgaged;
            }

            public void setMortgaged(String mortgaged) {
                this.mortgaged = mortgaged;
            }

            public String getBidNumber() {
                return bidNumber;
            }

            public void setBidNumber(String bidNumber) {
                this.bidNumber = bidNumber;
            }

            public String getBidAmount() {
                return bidAmount;
            }

            public void setBidAmount(String bidAmount) {
                this.bidAmount = bidAmount;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getRewarded() {
                return rewarded;
            }

            public void setRewarded(String rewarded) {
                this.rewarded = rewarded;
            }

            public String getHidden() {
                return hidden;
            }

            public void setHidden(String hidden) {
                this.hidden = hidden;
            }

            public String getAutoSplitted() {
                return autoSplitted;
            }

            public void setAutoSplitted(String autoSplitted) {
                this.autoSplitted = autoSplitted;
            }

            public String getExtraRate() {
                return extraRate;
            }

            public void setExtraRate(String extraRate) {
                this.extraRate = extraRate;
            }

            public String getFloatDuration() {
                return floatDuration;
            }

            public void setFloatDuration(String floatDuration) {
                this.floatDuration = floatDuration;
            }

            public String getGradeLimit() {
                return gradeLimit;
            }

            public void setGradeLimit(String gradeLimit) {
                this.gradeLimit = gradeLimit;
            }

            public String getBalance() {
                return balance;
            }

            public void setBalance(String balance) {
                this.balance = balance;
            }

            public Object getCorporationName() {
                return corporationName;
            }

            public void setCorporationName(Object corporationName) {
                this.corporationName = corporationName;
            }

            public Object getCorporationShortName() {
                return corporationShortName;
            }

            public void setCorporationShortName(Object corporationShortName) {
                this.corporationShortName = corporationShortName;
            }

            public Object getCorporationUrl() {
                return corporationUrl;
            }

            public void setCorporationUrl(Object corporationUrl) {
                this.corporationUrl = corporationUrl;
            }

            public Object getCorporationId() {
                return corporationId;
            }

            public void setCorporationId(Object corporationId) {
                this.corporationId = corporationId;
            }

            public Object getGuaranteeLogo() {
                return guaranteeLogo;
            }

            public void setGuaranteeLogo(Object guaranteeLogo) {
                this.guaranteeLogo = guaranteeLogo;
            }

            public Object getGuaranteeIcon() {
                return guaranteeIcon;
            }

            public void setGuaranteeIcon(Object guaranteeIcon) {
                this.guaranteeIcon = guaranteeIcon;
            }

            public String getContractCode() {
                return contractCode;
            }

            public void setContractCode(String contractCode) {
                this.contractCode = contractCode;
            }

            public Object getLocation() {
                return location;
            }

            public void setLocation(Object location) {
                this.location = location;
            }

            public Object getIndustry() {
                return industry;
            }

            public void setIndustry(Object industry) {
                this.industry = industry;
            }

            public String getPurpose() {
                return purpose;
            }

            public void setPurpose(String purpose) {
                this.purpose = purpose;
            }

            public Object getRiskGrade() {
                return riskGrade;
            }

            public void setRiskGrade(Object riskGrade) {
                this.riskGrade = riskGrade;
            }

            public Object getProviderProjectCode() {
                return providerProjectCode;
            }

            public void setProviderProjectCode(Object providerProjectCode) {
                this.providerProjectCode = providerProjectCode;
            }

            public Object getCoborrower() {
                return coborrower;
            }

            public void setCoborrower(Object coborrower) {
                this.coborrower = coborrower;
            }

            public String getInvestAmount() {
                return investAmount;
            }

            public void setInvestAmount(String investAmount) {
                this.investAmount = investAmount;
            }

            public String getCountDownTime() {
                return countDownTime;
            }

            public void setCountDownTime(String countDownTime) {
                this.countDownTime = countDownTime;
            }

            public String getServerDate() {
                return serverDate;
            }

            public void setServerDate(String serverDate) {
                this.serverDate = serverDate;
            }

            public String getInvestPercent() {
                return investPercent;
            }

            public void setInvestPercent(String investPercent) {
                this.investPercent = investPercent;
            }

            public String getLeftBidTime() {
                return leftBidTime;
            }

            public void setLeftBidTime(String leftBidTime) {
                this.leftBidTime = leftBidTime;
            }

            public String getAnnualRate() {
                return annualRate;
            }

            public void setAnnualRate(String annualRate) {
                this.annualRate = annualRate;
            }

            public String getTimeLeft() {
                return timeLeft;
            }

            public void setTimeLeft(String timeLeft) {
                this.timeLeft = timeLeft;
            }

            public String getTimeElapsed() {
                return timeElapsed;
            }

            public void setTimeElapsed(String timeElapsed) {
                this.timeElapsed = timeElapsed;
            }

            public String getAvailable() {
                return available;
            }

            public void setAvailable(String available) {
                this.available = available;
            }

            public String getTimeout() {
                return timeout;
            }

            public void setTimeout(String timeout) {
                this.timeout = timeout;
            }

            @Override
            public String toString() {
                return "ContentBean{" +
                        "id='" + id + '\'' +
                        ", title='" + title + '\'' +
                        ", method='" + method + '\'' +
                        ", ordinal='" + ordinal + '\'' +
                        ", amount='" + amount + '\'' +
                        ", rate='" + rate + '\'' +
                        ", duration=" + duration +
                        ", loanRequest=" + loanRequest +
                        ", timeOpen='" + timeOpen + '\'' +
                        ", timeFinished='" + timeFinished + '\'' +
                        ", timeSettled='" + timeSettled + '\'' +
                        ", timeCleared=" + timeCleared +
                        ", mortgaged='" + mortgaged + '\'' +
                        ", bidNumber='" + bidNumber + '\'' +
                        ", bidAmount='" + bidAmount + '\'' +
                        ", status='" + status + '\'' +
                        ", rewarded='" + rewarded + '\'' +
                        ", hidden='" + hidden + '\'' +
                        ", autoSplitted='" + autoSplitted + '\'' +
                        ", extraRate='" + extraRate + '\'' +
                        ", floatDuration='" + floatDuration + '\'' +
                        ", gradeLimit='" + gradeLimit + '\'' +
                        ", balance='" + balance + '\'' +
                        ", corporationName=" + corporationName +
                        ", corporationShortName=" + corporationShortName +
                        ", corporationUrl=" + corporationUrl +
                        ", corporationId=" + corporationId +
                        ", guaranteeLogo=" + guaranteeLogo +
                        ", guaranteeIcon=" + guaranteeIcon +
                        ", contractCode='" + contractCode + '\'' +
                        ", location=" + location +
                        ", industry=" + industry +
                        ", purpose='" + purpose + '\'' +
                        ", riskGrade=" + riskGrade +
                        ", providerProjectCode=" + providerProjectCode +
                        ", coborrower=" + coborrower +
                        ", investAmount='" + investAmount + '\'' +
                        ", countDownTime='" + countDownTime + '\'' +
                        ", serverDate='" + serverDate + '\'' +
                        ", investPercent='" + investPercent + '\'' +
                        ", leftBidTime='" + leftBidTime + '\'' +
                        ", annualRate='" + annualRate + '\'' +
                        ", timeLeft='" + timeLeft + '\'' +
                        ", timeElapsed='" + timeElapsed + '\'' +
                        ", available='" + available + '\'' +
                        ", timeout='" + timeout + '\'' +
                        '}';
            }

            public static class DurationBeanXXXX {
                /**
                 * years : 0
                 * months : 3
                 * days : 0
                 * totalMonths : 3
                 * totalDays : 90
                 */

                private int years;
                private int months;
                private int days;
                private int totalMonths;
                private int totalDays;

                public int getYears() {
                    return years;
                }

                public void setYears(int years) {
                    this.years = years;
                }

                public int getMonths() {
                    return months;
                }

                public void setMonths(int months) {
                    this.months = months;
                }

                public int getDays() {
                    return days;
                }

                public void setDays(int days) {
                    this.days = days;
                }

                public int getTotalMonths() {
                    return totalMonths;
                }

                public void setTotalMonths(int totalMonths) {
                    this.totalMonths = totalMonths;
                }

                public int getTotalDays() {
                    return totalDays;
                }

                public void setTotalDays(int totalDays) {
                    this.totalDays = totalDays;
                }
            }

            public static class LoanRequestBeanXX {
                private String id;
                private String userId;
                private UserBeanXX user;
                private String title;
                private String purpose;
                private String amount;
                private DurationBeanXXXXX duration;
                private String floatDuration;
                private String gradeLimit;
                private String rate;
                private String extraRate;
                private String method;
                private RepaymentRuleBeanXX repaymentRule;
                private String description;
                private String status;
                private String timeSubmit;
                private boolean mortgaged;
                private String source;
                private String employeeId;
                private String mortgageInfo;
                private String guaranteeEntity;
                private String receiverEntity;
                private String bhfnEntity;
                private String dingfangEntity;
                private String wufangEntity;
                private String guaranteeInfo;
                private String guarantyStyle;
                private String riskInfo;
                private String serial;
                private InvestRuleBeanXX investRule;
                private String reviewComment;
                private String clientPriv;
                private String requestProvider;
                private String productId;
                private String productKey;
                private Object productDescription;
                private boolean hidden;
                private String valueDate;
                private String dueDate;
                private String parentId;
                private String displayUserId;
                private boolean pureRequest;
                private String autoAble;
                private String autoSettle;
                private int autoRatio;
                private String code;
                private int annualRate;
                private List<String> mortgageType;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getUserId() {
                    return userId;
                }

                public void setUserId(String userId) {
                    this.userId = userId;
                }

                public UserBeanXX getUser() {
                    return user;
                }

                public void setUser(UserBeanXX user) {
                    this.user = user;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPurpose() {
                    return purpose;
                }

                public void setPurpose(String purpose) {
                    this.purpose = purpose;
                }

                public String getAmount() {
                    return amount;
                }

                public void setAmount(String amount) {
                    this.amount = amount;
                }

                public DurationBeanXXXXX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanXXXXX duration) {
                    this.duration = duration;
                }

                public String getFloatDuration() {
                    return floatDuration;
                }

                public void setFloatDuration(String floatDuration) {
                    this.floatDuration = floatDuration;
                }

                public String getGradeLimit() {
                    return gradeLimit;
                }

                public void setGradeLimit(String gradeLimit) {
                    this.gradeLimit = gradeLimit;
                }

                public String getRate() {
                    return rate;
                }

                public void setRate(String rate) {
                    this.rate = rate;
                }

                public String getExtraRate() {
                    return extraRate;
                }

                public void setExtraRate(String extraRate) {
                    this.extraRate = extraRate;
                }

                public String getMethod() {
                    return method;
                }

                public void setMethod(String method) {
                    this.method = method;
                }

                public RepaymentRuleBeanXX getRepaymentRule() {
                    return repaymentRule;
                }

                public void setRepaymentRule(RepaymentRuleBeanXX repaymentRule) {
                    this.repaymentRule = repaymentRule;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getTimeSubmit() {
                    return timeSubmit;
                }

                public void setTimeSubmit(String timeSubmit) {
                    this.timeSubmit = timeSubmit;
                }

                public boolean isMortgaged() {
                    return mortgaged;
                }

                public void setMortgaged(boolean mortgaged) {
                    this.mortgaged = mortgaged;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getEmployeeId() {
                    return employeeId;
                }

                public void setEmployeeId(String employeeId) {
                    this.employeeId = employeeId;
                }

                public String getMortgageInfo() {
                    return mortgageInfo;
                }

                public void setMortgageInfo(String mortgageInfo) {
                    this.mortgageInfo = mortgageInfo;
                }

                public String getGuaranteeEntity() {
                    return guaranteeEntity;
                }

                public void setGuaranteeEntity(String guaranteeEntity) {
                    this.guaranteeEntity = guaranteeEntity;
                }

                public String getReceiverEntity() {
                    return receiverEntity;
                }

                public void setReceiverEntity(String receiverEntity) {
                    this.receiverEntity = receiverEntity;
                }

                public String getBhfnEntity() {
                    return bhfnEntity;
                }

                public void setBhfnEntity(String bhfnEntity) {
                    this.bhfnEntity = bhfnEntity;
                }

                public String getDingfangEntity() {
                    return dingfangEntity;
                }

                public void setDingfangEntity(String dingfangEntity) {
                    this.dingfangEntity = dingfangEntity;
                }

                public String getWufangEntity() {
                    return wufangEntity;
                }

                public void setWufangEntity(String wufangEntity) {
                    this.wufangEntity = wufangEntity;
                }

                public String getGuaranteeInfo() {
                    return guaranteeInfo;
                }

                public void setGuaranteeInfo(String guaranteeInfo) {
                    this.guaranteeInfo = guaranteeInfo;
                }

                public String getGuarantyStyle() {
                    return guarantyStyle;
                }

                public void setGuarantyStyle(String guarantyStyle) {
                    this.guarantyStyle = guarantyStyle;
                }

                public String getRiskInfo() {
                    return riskInfo;
                }

                public void setRiskInfo(String riskInfo) {
                    this.riskInfo = riskInfo;
                }

                public String getSerial() {
                    return serial;
                }

                public void setSerial(String serial) {
                    this.serial = serial;
                }

                public InvestRuleBeanXX getInvestRule() {
                    return investRule;
                }

                public void setInvestRule(InvestRuleBeanXX investRule) {
                    this.investRule = investRule;
                }

                public String getReviewComment() {
                    return reviewComment;
                }

                public void setReviewComment(String reviewComment) {
                    this.reviewComment = reviewComment;
                }

                public String getClientPriv() {
                    return clientPriv;
                }

                public void setClientPriv(String clientPriv) {
                    this.clientPriv = clientPriv;
                }

                public String getRequestProvider() {
                    return requestProvider;
                }

                public void setRequestProvider(String requestProvider) {
                    this.requestProvider = requestProvider;
                }

                public String getProductId() {
                    return productId;
                }

                public void setProductId(String productId) {
                    this.productId = productId;
                }

                public String getProductKey() {
                    return productKey;
                }

                public void setProductKey(String productKey) {
                    this.productKey = productKey;
                }

                public Object getProductDescription() {
                    return productDescription;
                }

                public void setProductDescription(Object productDescription) {
                    this.productDescription = productDescription;
                }

                public boolean isHidden() {
                    return hidden;
                }

                public void setHidden(boolean hidden) {
                    this.hidden = hidden;
                }

                public String getValueDate() {
                    return valueDate;
                }

                public void setValueDate(String valueDate) {
                    this.valueDate = valueDate;
                }

                public String getDueDate() {
                    return dueDate;
                }

                public void setDueDate(String dueDate) {
                    this.dueDate = dueDate;
                }

                public String getParentId() {
                    return parentId;
                }

                public void setParentId(String parentId) {
                    this.parentId = parentId;
                }

                public String getDisplayUserId() {
                    return displayUserId;
                }

                public void setDisplayUserId(String displayUserId) {
                    this.displayUserId = displayUserId;
                }

                public boolean isPureRequest() {
                    return pureRequest;
                }

                public void setPureRequest(boolean pureRequest) {
                    this.pureRequest = pureRequest;
                }

                public String getAutoAble() {
                    return autoAble;
                }

                public void setAutoAble(String autoAble) {
                    this.autoAble = autoAble;
                }

                public String getAutoSettle() {
                    return autoSettle;
                }

                public void setAutoSettle(String autoSettle) {
                    this.autoSettle = autoSettle;
                }

                public int getAutoRatio() {
                    return autoRatio;
                }

                public void setAutoRatio(int autoRatio) {
                    this.autoRatio = autoRatio;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public int getAnnualRate() {
                    return annualRate;
                }

                public void setAnnualRate(int annualRate) {
                    this.annualRate = annualRate;
                }

                public List<String> getMortgageType() {
                    return mortgageType;
                }

                public void setMortgageType(List<String> mortgageType) {
                    this.mortgageType = mortgageType;
                }

                public static class UserBeanXX {
                    /**
                     * id : 093CCE02-AFBE-447E-A420-DC71D1D94D89
                     * clientCode : XWJR
                     * name : null
                     * loginName : vk023
                     * idNumber : null
                     * mobile : null
                     * email : support@xwjr.com
                     * source : WEB
                     * employeeId : null
                     * lastModifiedBy : null
                     * channel : null
                     * lastLoginDate : 1490162430832
                     * registerDate : 1481159856000
                     * merCustId : 093CCE02-AFBE-447E-A420-DC71D1D9
                     * enabled : true
                     * referralEntity : null
                     * enterprise : false
                     * registryRewarded : false
                     * referralRewarded : false
                     * referralUrl : http%3A%2F%2Fuat.soopay.net%2Fspay%2Fpay%2FdepositMerRegPerson.do
                     * registerUrl : http%3A%2F%2Fbjp2p.kfxfd.cn%3A9080%2Fregister
                     * coreenterprise : false
                     * enterpriseName : null
                     * deposit : false
                     * groupId : null
                     * checkIdNumberLimit : null
                     * checkIdNumberCount : null
                     */

                    private String id;
                    private String clientCode;
                    private Object name;
                    private String loginName;
                    private Object idNumber;
                    private Object mobile;
                    private String email;
                    private String source;
                    private Object employeeId;
                    private Object lastModifiedBy;
                    private Object channel;
                    private long lastLoginDate;
                    private long registerDate;
                    private String merCustId;
                    private boolean enabled;
                    private Object referralEntity;
                    private boolean enterprise;
                    private boolean registryRewarded;
                    private boolean referralRewarded;
                    private String referralUrl;
                    private String registerUrl;
                    private boolean coreenterprise;
                    private Object enterpriseName;
                    private boolean deposit;
                    private Object groupId;
                    private Object checkIdNumberLimit;
                    private Object checkIdNumberCount;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getClientCode() {
                        return clientCode;
                    }

                    public void setClientCode(String clientCode) {
                        this.clientCode = clientCode;
                    }

                    public Object getName() {
                        return name;
                    }

                    public void setName(Object name) {
                        this.name = name;
                    }

                    public String getLoginName() {
                        return loginName;
                    }

                    public void setLoginName(String loginName) {
                        this.loginName = loginName;
                    }

                    public Object getIdNumber() {
                        return idNumber;
                    }

                    public void setIdNumber(Object idNumber) {
                        this.idNumber = idNumber;
                    }

                    public Object getMobile() {
                        return mobile;
                    }

                    public void setMobile(Object mobile) {
                        this.mobile = mobile;
                    }

                    public String getEmail() {
                        return email;
                    }

                    public void setEmail(String email) {
                        this.email = email;
                    }

                    public String getSource() {
                        return source;
                    }

                    public void setSource(String source) {
                        this.source = source;
                    }

                    public Object getEmployeeId() {
                        return employeeId;
                    }

                    public void setEmployeeId(Object employeeId) {
                        this.employeeId = employeeId;
                    }

                    public Object getLastModifiedBy() {
                        return lastModifiedBy;
                    }

                    public void setLastModifiedBy(Object lastModifiedBy) {
                        this.lastModifiedBy = lastModifiedBy;
                    }

                    public Object getChannel() {
                        return channel;
                    }

                    public void setChannel(Object channel) {
                        this.channel = channel;
                    }

                    public long getLastLoginDate() {
                        return lastLoginDate;
                    }

                    public void setLastLoginDate(long lastLoginDate) {
                        this.lastLoginDate = lastLoginDate;
                    }

                    public long getRegisterDate() {
                        return registerDate;
                    }

                    public void setRegisterDate(long registerDate) {
                        this.registerDate = registerDate;
                    }

                    public String getMerCustId() {
                        return merCustId;
                    }

                    public void setMerCustId(String merCustId) {
                        this.merCustId = merCustId;
                    }

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }

                    public Object getReferralEntity() {
                        return referralEntity;
                    }

                    public void setReferralEntity(Object referralEntity) {
                        this.referralEntity = referralEntity;
                    }

                    public boolean isEnterprise() {
                        return enterprise;
                    }

                    public void setEnterprise(boolean enterprise) {
                        this.enterprise = enterprise;
                    }

                    public boolean isRegistryRewarded() {
                        return registryRewarded;
                    }

                    public void setRegistryRewarded(boolean registryRewarded) {
                        this.registryRewarded = registryRewarded;
                    }

                    public boolean isReferralRewarded() {
                        return referralRewarded;
                    }

                    public void setReferralRewarded(boolean referralRewarded) {
                        this.referralRewarded = referralRewarded;
                    }

                    public String getReferralUrl() {
                        return referralUrl;
                    }

                    public void setReferralUrl(String referralUrl) {
                        this.referralUrl = referralUrl;
                    }

                    public String getRegisterUrl() {
                        return registerUrl;
                    }

                    public void setRegisterUrl(String registerUrl) {
                        this.registerUrl = registerUrl;
                    }

                    public boolean isCoreenterprise() {
                        return coreenterprise;
                    }

                    public void setCoreenterprise(boolean coreenterprise) {
                        this.coreenterprise = coreenterprise;
                    }

                    public Object getEnterpriseName() {
                        return enterpriseName;
                    }

                    public void setEnterpriseName(Object enterpriseName) {
                        this.enterpriseName = enterpriseName;
                    }

                    public boolean isDeposit() {
                        return deposit;
                    }

                    public void setDeposit(boolean deposit) {
                        this.deposit = deposit;
                    }

                    public Object getGroupId() {
                        return groupId;
                    }

                    public void setGroupId(Object groupId) {
                        this.groupId = groupId;
                    }

                    public Object getCheckIdNumberLimit() {
                        return checkIdNumberLimit;
                    }

                    public void setCheckIdNumberLimit(Object checkIdNumberLimit) {
                        this.checkIdNumberLimit = checkIdNumberLimit;
                    }

                    public Object getCheckIdNumberCount() {
                        return checkIdNumberCount;
                    }

                    public void setCheckIdNumberCount(Object checkIdNumberCount) {
                        this.checkIdNumberCount = checkIdNumberCount;
                    }
                }

                public static class DurationBeanXXXXX {
                    /**
                     * years : 0
                     * months : 3
                     * days : 0
                     * totalMonths : 3
                     * totalDays : 90
                     */

                    private int years;
                    private int months;
                    private int days;
                    private int totalMonths;
                    private int totalDays;

                    public int getYears() {
                        return years;
                    }

                    public void setYears(int years) {
                        this.years = years;
                    }

                    public int getMonths() {
                        return months;
                    }

                    public void setMonths(int months) {
                        this.months = months;
                    }

                    public int getDays() {
                        return days;
                    }

                    public void setDays(int days) {
                        this.days = days;
                    }

                    public int getTotalMonths() {
                        return totalMonths;
                    }

                    public void setTotalMonths(int totalMonths) {
                        this.totalMonths = totalMonths;
                    }

                    public int getTotalDays() {
                        return totalDays;
                    }

                    public void setTotalDays(int totalDays) {
                        this.totalDays = totalDays;
                    }
                }

                public static class RepaymentRuleBeanXX {
                    /**
                     * daysOfYear : 365
                     * repaymentPeriod : Monthly
                     * dayOfRepayment : 0
                     */

                    private int daysOfYear;
                    private String repaymentPeriod;
                    private int dayOfRepayment;

                    public int getDaysOfYear() {
                        return daysOfYear;
                    }

                    public void setDaysOfYear(int daysOfYear) {
                        this.daysOfYear = daysOfYear;
                    }

                    public String getRepaymentPeriod() {
                        return repaymentPeriod;
                    }

                    public void setRepaymentPeriod(String repaymentPeriod) {
                        this.repaymentPeriod = repaymentPeriod;
                    }

                    public int getDayOfRepayment() {
                        return dayOfRepayment;
                    }

                    public void setDayOfRepayment(int dayOfRepayment) {
                        this.dayOfRepayment = dayOfRepayment;
                    }
                }

                public static class InvestRuleBeanXX {
                    /**
                     * minAmount : 100
                     * maxAmount : 100000000
                     * stepAmount : 100
                     * maxTotalAmount : 0
                     * maxTimes : 0
                     */

                    private int minAmount;
                    private int maxAmount;
                    private int stepAmount;
                    private int maxTotalAmount;
                    private int maxTimes;

                    public int getMinAmount() {
                        return minAmount;
                    }

                    public void setMinAmount(int minAmount) {
                        this.minAmount = minAmount;
                    }

                    public int getMaxAmount() {
                        return maxAmount;
                    }

                    public void setMaxAmount(int maxAmount) {
                        this.maxAmount = maxAmount;
                    }

                    public int getStepAmount() {
                        return stepAmount;
                    }

                    public void setStepAmount(int stepAmount) {
                        this.stepAmount = stepAmount;
                    }

                    public int getMaxTotalAmount() {
                        return maxTotalAmount;
                    }

                    public void setMaxTotalAmount(int maxTotalAmount) {
                        this.maxTotalAmount = maxTotalAmount;
                    }

                    public int getMaxTimes() {
                        return maxTimes;
                    }

                    public void setMaxTimes(int maxTimes) {
                        this.maxTimes = maxTimes;
                    }
                }
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "open=" + open +
                    ", scheduled=" + scheduled +
                    ", settled=" + settled +
                    ", finished=" + finished +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HomeFragmentBean{" +
                "RE_001=" + RE_001 +
                ", DYD1=" + DYD1 +
                ", test=" + test +
                ", ZZY=" + ZZY +
                ", DDD=" + DDD +
                ", YSD=" + YSD +
                ", DBL=" + DBL +
                ", GQD=" + GQD +
                ", XYD=" + XYD +
                ", DDD_DMR=" + DDD_DMR +
                ", CE_001=" + CE_001 +
                ", MMB=" + MMB +
                ", XSB=" + XSB +
                ", HSD=" + HSD +
                ", XND=" + XND +
                ", hfcredit=" + hfcredit +
                ", CSB=" + CSB +
                ", ABCDEFG=" + ABCDEFG +
                ", YQJH=" + YQJH +
                ", XLD=" + XLD +
                ", HND=" + HND +
                '}';
    }
}
