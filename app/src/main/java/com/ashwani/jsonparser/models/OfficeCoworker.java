package com.ashwani.jsonparser.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ansh on 8/2/18.
 */

public class OfficeCoworker {
    @SerializedName("area")
    @Expose
    private Object area;
    @SerializedName("coworkers")
    @Expose
    private List<Coworker> coworkers = null;

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public List<Coworker> getCoworkers() {
        return coworkers;
    }

    public void setCoworkers(List<Coworker> coworkers) {
        this.coworkers = coworkers;
    }
}
