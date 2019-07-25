package com.aicrowdfunding.bean.vo;

import com.aicrowdfunding.bean.TProject;
import com.aicrowdfunding.bean.TReturn;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable {
    private static final long serialVersionUID = 6212938533628811554L;
    private TProject tProject;
    private String username;
    private String description;
    private String authstatus;
    private String tellphone;
    private List<TReturn> tReturns;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthstatus() {
        return authstatus;
    }

    public void setAuthstatus(String authstatus) {
        this.authstatus = authstatus;
    }

    public String getTellphone() {
        return tellphone;
    }

    public void setTellphone(String tellphone) {
        this.tellphone = tellphone;
    }

    public TProject gettProject() {
        return tProject;
    }

    public void settProject(TProject tProject) {
        this.tProject = tProject;
    }

    public List<TReturn> gettReturns() {
        return tReturns;
    }

    public void settReturns(List<TReturn> tReturns) {
        this.tReturns = tReturns;
    }
}
