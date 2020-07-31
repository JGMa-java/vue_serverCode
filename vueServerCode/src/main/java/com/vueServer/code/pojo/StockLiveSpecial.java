package com.vueServer.code.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class StockLiveSpecial {
    private BigDecimal id;

    private Date createtime;

    private Short status;

    private String color;

    private String articletypename1;

    private String articletypename2;

    private Short type;

    private Long conceptcode;

    private Short hot;

    private Long hotsort;

    private Date modifydate;

    private String title;

    private String headpic;

    private String remark;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getArticletypename1() {
        return articletypename1;
    }

    public void setArticletypename1(String articletypename1) {
        this.articletypename1 = articletypename1 == null ? null : articletypename1.trim();
    }

    public String getArticletypename2() {
        return articletypename2;
    }

    public void setArticletypename2(String articletypename2) {
        this.articletypename2 = articletypename2 == null ? null : articletypename2.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Long getConceptcode() {
        return conceptcode;
    }

    public void setConceptcode(Long conceptcode) {
        this.conceptcode = conceptcode;
    }

    public Short getHot() {
        return hot;
    }

    public void setHot(Short hot) {
        this.hot = hot;
    }

    public Long getHotsort() {
        return hotsort;
    }

    public void setHotsort(Long hotsort) {
        this.hotsort = hotsort;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}