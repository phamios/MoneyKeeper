package com.bot.redsun.moneykeeper.ObjectModel;

/**
 * Created by redsu on 10/02/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("groupname")
    @Expose
    private String groupname;
    @SerializedName("grouptype")
    @Expose
    private String grouptype;
    @SerializedName("groupdesc")
    @Expose
    private String groupdesc;
    @SerializedName("groupcreatedate")
    @Expose
    private String groupcreatedate;
    @SerializedName("status")
    @Expose
    private Integer status;

    /**
     * No args constructor for use in serialization
     *
     */
    public GroupModel() {
    }

    /**
     *
     * @param id
     * @param grouptype
     * @param groupdesc
     * @param status
     * @param groupname
     * @param groupcreatedate
     */
    public GroupModel(Integer id, String groupname, String grouptype, String groupdesc, String groupcreatedate, Integer status) {
        super();
        this.id = id;
        this.groupname = groupname;
        this.grouptype = grouptype;
        this.groupdesc = groupdesc;
        this.groupcreatedate = groupcreatedate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    public String getGroupdesc() {
        return groupdesc;
    }

    public void setGroupdesc(String groupdesc) {
        this.groupdesc = groupdesc;
    }

    public String getGroupcreatedate() {
        return groupcreatedate;
    }

    public void setGroupcreatedate(String groupcreatedate) {
        this.groupcreatedate = groupcreatedate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}