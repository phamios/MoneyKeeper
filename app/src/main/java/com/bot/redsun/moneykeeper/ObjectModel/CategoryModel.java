package com.bot.redsun.moneykeeper.ObjectModel;

/**
 * Created by redsu on 10/02/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("categoryname")
    @Expose
    private String categoryname;
    @SerializedName("createdate")
    @Expose
    private String createdate;
    @SerializedName("status")
    @Expose
    private Integer status;

    /**
     * No args constructor for use in serialization
     *
     */
    public CategoryModel() {
    }

    /**
     *
     * @param id
     * @param status
     * @param createdate
     * @param categoryname
     */
    public CategoryModel(Integer id, String categoryname, String createdate, Integer status) {
        super();
        this.id = id;
        this.categoryname = categoryname;
        this.createdate = createdate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}