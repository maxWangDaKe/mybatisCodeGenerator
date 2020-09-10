package cn.csdn.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbLoanSpecialcaseinfor implements Serializable {
    private String id;

    private String clientDescInfor;

    private String apvDescInfor;

    private String conDescInfor;

    private String guarantyDescInfor;

    private String payDescInfor;

    private String otherDescInfor;

    private Date clientEstimated;

    private Date apvEstimated;

    private Date conEstimated;

    private Date guarantyEstimated;

    private Date payEstimated;

    private Date otherEstimated;

    private String detailId;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClientDescInfor() {
        return clientDescInfor;
    }

    public void setClientDescInfor(String clientDescInfor) {
        this.clientDescInfor = clientDescInfor == null ? null : clientDescInfor.trim();
    }

    public String getApvDescInfor() {
        return apvDescInfor;
    }

    public void setApvDescInfor(String apvDescInfor) {
        this.apvDescInfor = apvDescInfor == null ? null : apvDescInfor.trim();
    }

    public String getConDescInfor() {
        return conDescInfor;
    }

    public void setConDescInfor(String conDescInfor) {
        this.conDescInfor = conDescInfor == null ? null : conDescInfor.trim();
    }

    public String getGuarantyDescInfor() {
        return guarantyDescInfor;
    }

    public void setGuarantyDescInfor(String guarantyDescInfor) {
        this.guarantyDescInfor = guarantyDescInfor == null ? null : guarantyDescInfor.trim();
    }

    public String getPayDescInfor() {
        return payDescInfor;
    }

    public void setPayDescInfor(String payDescInfor) {
        this.payDescInfor = payDescInfor == null ? null : payDescInfor.trim();
    }

    public String getOtherDescInfor() {
        return otherDescInfor;
    }

    public void setOtherDescInfor(String otherDescInfor) {
        this.otherDescInfor = otherDescInfor == null ? null : otherDescInfor.trim();
    }

    public Date getClientEstimated() {
        return clientEstimated;
    }

    public void setClientEstimated(Date clientEstimated) {
        this.clientEstimated = clientEstimated;
    }

    public Date getApvEstimated() {
        return apvEstimated;
    }

    public void setApvEstimated(Date apvEstimated) {
        this.apvEstimated = apvEstimated;
    }

    public Date getConEstimated() {
        return conEstimated;
    }

    public void setConEstimated(Date conEstimated) {
        this.conEstimated = conEstimated;
    }

    public Date getGuarantyEstimated() {
        return guarantyEstimated;
    }

    public void setGuarantyEstimated(Date guarantyEstimated) {
        this.guarantyEstimated = guarantyEstimated;
    }

    public Date getPayEstimated() {
        return payEstimated;
    }

    public void setPayEstimated(Date payEstimated) {
        this.payEstimated = payEstimated;
    }

    public Date getOtherEstimated() {
        return otherEstimated;
    }

    public void setOtherEstimated(Date otherEstimated) {
        this.otherEstimated = otherEstimated;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}