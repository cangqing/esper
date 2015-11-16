package com.xiaoka.mybatis;

import java.util.Date;

public class CarUser {
    private Integer id;

    private String phone;

    private String name;

    private String avatar;

    private String chatPassword;

    private String chatMail;

    private Integer isValid;

    private Integer isExpert;

    private Integer isBusiness;

    private Date createTime;

    private String code;

    private Date codeTime;

    private Date loginTime;

    private String token;

    private Integer codeCount;

    private Date codeFlagTime;

    private Integer settlement;

    private String settlementCode;

    private Integer tokenUpdateCode;

    private String deviceId;

    private String city;

    private String wechatOpenId;

    private Integer source;

    private Date upgradeTime;

    private String userBusiAgreementId;

    private String userPayAgreementId;

    private String unionPayBindBank;

    private String unionPayLastFour;

    private String unionPayCardType;

    private String unionPayBindPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getChatPassword() {
        return chatPassword;
    }

    public void setChatPassword(String chatPassword) {
        this.chatPassword = chatPassword == null ? null : chatPassword.trim();
    }

    public String getChatMail() {
        return chatMail;
    }

    public void setChatMail(String chatMail) {
        this.chatMail = chatMail == null ? null : chatMail.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsExpert() {
        return isExpert;
    }

    public void setIsExpert(Integer isExpert) {
        this.isExpert = isExpert;
    }

    public Integer getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Integer isBusiness) {
        this.isBusiness = isBusiness;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getCodeTime() {
        return codeTime;
    }

    public void setCodeTime(Date codeTime) {
        this.codeTime = codeTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getCodeCount() {
        return codeCount;
    }

    public void setCodeCount(Integer codeCount) {
        this.codeCount = codeCount;
    }

    public Date getCodeFlagTime() {
        return codeFlagTime;
    }

    public void setCodeFlagTime(Date codeFlagTime) {
        this.codeFlagTime = codeFlagTime;
    }

    public Integer getSettlement() {
        return settlement;
    }

    public void setSettlement(Integer settlement) {
        this.settlement = settlement;
    }

    public String getSettlementCode() {
        return settlementCode;
    }

    public void setSettlementCode(String settlementCode) {
        this.settlementCode = settlementCode == null ? null : settlementCode.trim();
    }

    public Integer getTokenUpdateCode() {
        return tokenUpdateCode;
    }

    public void setTokenUpdateCode(Integer tokenUpdateCode) {
        this.tokenUpdateCode = tokenUpdateCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getWechatOpenId() {
        return wechatOpenId;
    }

    public void setWechatOpenId(String wechatOpenId) {
        this.wechatOpenId = wechatOpenId == null ? null : wechatOpenId.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Date getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(Date upgradeTime) {
        this.upgradeTime = upgradeTime;
    }

    public String getUserBusiAgreementId() {
        return userBusiAgreementId;
    }

    public void setUserBusiAgreementId(String userBusiAgreementId) {
        this.userBusiAgreementId = userBusiAgreementId == null ? null : userBusiAgreementId.trim();
    }

    public String getUserPayAgreementId() {
        return userPayAgreementId;
    }

    public void setUserPayAgreementId(String userPayAgreementId) {
        this.userPayAgreementId = userPayAgreementId == null ? null : userPayAgreementId.trim();
    }

    public String getUnionPayBindBank() {
        return unionPayBindBank;
    }

    public void setUnionPayBindBank(String unionPayBindBank) {
        this.unionPayBindBank = unionPayBindBank == null ? null : unionPayBindBank.trim();
    }

    public String getUnionPayLastFour() {
        return unionPayLastFour;
    }

    public void setUnionPayLastFour(String unionPayLastFour) {
        this.unionPayLastFour = unionPayLastFour == null ? null : unionPayLastFour.trim();
    }

    public String getUnionPayCardType() {
        return unionPayCardType;
    }

    public void setUnionPayCardType(String unionPayCardType) {
        this.unionPayCardType = unionPayCardType == null ? null : unionPayCardType.trim();
    }

    public String getUnionPayBindPhone() {
        return unionPayBindPhone;
    }

    public void setUnionPayBindPhone(String unionPayBindPhone) {
        this.unionPayBindPhone = unionPayBindPhone == null ? null : unionPayBindPhone.trim();
    }
}