package com.ashwani.jsonparser.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ansh on 8/2/18.
 */

public class AboutProfileResponse {
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("post_title")
    @Expose
    private String postTitle;
    @SerializedName("post_name")
    @Expose
    private String postName;
    @SerializedName("office_phone")
    @Expose
    private String officePhone;
    @SerializedName("office_mail")
    @Expose
    private String officeMail;
    @SerializedName("office_location")
    @Expose
    private OfficeLocation officeLocation;
    @SerializedName("office_coworkers")
    @Expose
    private List<OfficeCoworker> officeCoworkers = null;

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficeMail() {
        return officeMail;
    }

    public void setOfficeMail(String officeMail) {
        this.officeMail = officeMail;
    }

    public OfficeLocation getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(OfficeLocation officeLocation) {
        this.officeLocation = officeLocation;
    }

    public List<OfficeCoworker> getOfficeCoworkers() {
        return officeCoworkers;
    }

    public void setOfficeCoworkers(List<OfficeCoworker> officeCoworkers) {
        this.officeCoworkers = officeCoworkers;
    }
}
