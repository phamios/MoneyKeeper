package com.bot.redsun.moneykeeper.ObjectModel;

/**
 * Created by redsu on 10/02/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TypeModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("typename")
    @Expose
    private String typename;

    /**
     * No args constructor for use in serialization
     *
     */
    public TypeModel() {
    }

    /**
     *
     * @param id
     * @param typename
     * @param type
     */
    public TypeModel(Integer id, Integer type, String typename) {
        super();
        this.id = id;
        this.type = type;
        this.typename = typename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

}