package com.devitis.retrofittest_080419.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Diana on 08.04.2019.
 */

public class Post {

    @SerializedName("title")
    @Expose
    private String name;
    @SerializedName("body")
    @Expose
    private String email;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + name + '\'' +
                ", body='" + email + '\'' +
                ", userId=" + userId +
                ", id=" + id +
                '}';
    }
}