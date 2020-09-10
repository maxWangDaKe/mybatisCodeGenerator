package cn.csdn.pojo;

import java.io.Serializable;
import java.util.Date;

public class SysMenu implements Serializable {
    private String menuNum;

    private String menuName;

    private String fatherNum;

    private String iconNum;

    private String menuLine;

    private String menuType;

    private String openType;

    private Integer menuOrder;

    private String createName;

    private String createNum;

    private String updateName;

    private String updateNum;

    private Date createTime;

    private Date updateTime;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(String menuNum) {
        this.menuNum = menuNum == null ? null : menuNum.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getFatherNum() {
        return fatherNum;
    }

    public void setFatherNum(String fatherNum) {
        this.fatherNum = fatherNum == null ? null : fatherNum.trim();
    }

    public String getIconNum() {
        return iconNum;
    }

    public void setIconNum(String iconNum) {
        this.iconNum = iconNum == null ? null : iconNum.trim();
    }

    public String getMenuLine() {
        return menuLine;
    }

    public void setMenuLine(String menuLine) {
        this.menuLine = menuLine == null ? null : menuLine.trim();
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType == null ? null : openType.trim();
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}