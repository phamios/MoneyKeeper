package com.bot.redsun.moneykeeper.Model;

/**
 * Created by redsu on 10/02/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("userpass")
    @Expose
    private String userpass;
    @SerializedName("usertype")
    @Expose
    private Integer usertype;
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
    public UserModel() {
    }

    /**
     *
     * @param id
     * @param username
     * @param status
     * @param createdate
     * @param userpass
     * @param usertype
     */
    public UserModel(Integer id, String username, String userpass, Integer usertype, String createdate, Integer status) {
        super();
        this.id = id;
        this.username = username;
        this.userpass = userpass;
        this.usertype = usertype;
        this.createdate = createdate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
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