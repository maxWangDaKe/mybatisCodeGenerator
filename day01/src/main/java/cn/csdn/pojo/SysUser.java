package cn.csdn.pojo;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private String id;

    private String userNum;

    private String userName;

    private String password;

    private String userMotto;

    private String telephone;

    private String address;

    private String eMail;

    private String iconNum;

    private String userSex;

    private Date lastSiginTime;

    private Integer loginNumbers;

    private String createName;

    private String createNum;

    private String updateName;

    private String updateNum;

    private Date creatTime;

    private Date updateTime;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserMotto() {
        return userMotto;
    }

    public void setUserMotto(String userMotto) {
        this.userMotto = userMotto == null ? null : userMotto.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getIconNum() {
        return iconNum;
    }

    public void setIconNum(String iconNum) {
        this.iconNum = iconNum == null ? null : iconNum.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Date getLastSiginTime() {
        return lastSiginTime;
    }

    public void setLastSiginTime(Date lastSiginTime) {
        this.lastSiginTime = lastSiginTime;
    }

    public Integer getLoginNumbers() {
        return loginNumbers;
    }

    public void setLoginNumbers(Integer loginNumbers) {
        this.loginNumbers = loginNumbers;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public String getCreateNum() {
        return createNum;
    }

    public void setCreateNum(String createNum) {
        this.createNum = createNum == null ? null : createNum.trim();
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public String getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(String updateNum) {
        this.updateNum = updateNum == null ? null : updateNum.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}