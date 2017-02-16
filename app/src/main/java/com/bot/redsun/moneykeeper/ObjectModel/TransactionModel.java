package com.bot.redsun.moneykeeper.ObjectModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by redsu on 10/02/2017.
 */

public class TransactionModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("category")
    @Expose
    private Integer category;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("userid")
    @Expose
    private Integer userid;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("createdate")
    @Expose
    private String createdate;


    /**
     *
     * @param amount
     * @param id
     * @param category
     * @param status
     * @param description
     * @param createdate
     * @param userid
     * @param type
     */
    public TransactionModel(Integer id, Integer category, Integer type, Integer userid, Integer amount, String description, Integer status, String createdate) {
        super();
        this.id = id;
        this.category = category;
        this.type = type;
        this.userid = userid;
        this.amount = amount;
        this.description = description;
        this.status = status;
        this.createdate = createdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }


}
