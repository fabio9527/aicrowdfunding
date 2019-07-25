package com.aicrowdfunding.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class TReturn implements Serializable {
    private static final long serialVersionUID = -1587537498610641750L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.projectid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.type
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.supportmoney
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private BigDecimal supportmoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.supporter
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer supporter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.content
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.signalpurchase
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer signalpurchase;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.purchase
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer purchase;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.remain
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer remain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.freight
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private BigDecimal freight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.invoice
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private String invoice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_return.rtndate
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer rtndate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.id
     *
     * @return the value of t_return.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.id
     *
     * @param id the value for t_return.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.projectid
     *
     * @return the value of t_return.projectid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.projectid
     *
     * @param projectid the value for t_return.projectid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.type
     *
     * @return the value of t_return.type
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.type
     *
     * @param type the value for t_return.type
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.supportmoney
     *
     * @return the value of t_return.supportmoney
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public BigDecimal getSupportmoney() {
        return supportmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.supportmoney
     *
     * @param supportmoney the value for t_return.supportmoney
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setSupportmoney(BigDecimal supportmoney) {
        this.supportmoney = supportmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.supporter
     *
     * @return the value of t_return.supporter
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getSupporter() {
        return supporter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.supporter
     *
     * @param supporter the value for t_return.supporter
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setSupporter(Integer supporter) {
        this.supporter = supporter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.content
     *
     * @return the value of t_return.content
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.content
     *
     * @param content the value for t_return.content
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.signalpurchase
     *
     * @return the value of t_return.signalpurchase
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getSignalpurchase() {
        return signalpurchase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.signalpurchase
     *
     * @param signalpurchase the value for t_return.signalpurchase
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setSignalpurchase(Integer signalpurchase) {
        this.signalpurchase = signalpurchase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.purchase
     *
     * @return the value of t_return.purchase
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getPurchase() {
        return purchase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.purchase
     *
     * @param purchase the value for t_return.purchase
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.remain
     *
     * @return the value of t_return.remain
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getRemain() {
        return remain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.remain
     *
     * @param remain the value for t_return.remain
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.freight
     *
     * @return the value of t_return.freight
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.freight
     *
     * @param freight the value for t_return.freight
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.invoice
     *
     * @return the value of t_return.invoice
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.invoice
     *
     * @param invoice the value for t_return.invoice
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_return.rtndate
     *
     * @return the value of t_return.rtndate
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getRtndate() {
        return rtndate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_return.rtndate
     *
     * @param rtndate the value for t_return.rtndate
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setRtndate(Integer rtndate) {
        this.rtndate = rtndate;
    }
}